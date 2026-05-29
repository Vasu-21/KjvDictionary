package com.kjv.dictionary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kjv.dictionary.entity.KjvEntity;
import com.kjv.dictionary.service.KjvService;

@Controller
public class KjvController 
{
	
    @Autowired
    private KjvService kjvService;

	public KjvEntity getKjvWord(String word)
	{
		return kjvService.getKjvWord(word);
	}
	
	
	 @GetMapping("/")
	 public String home(Model model) 
	 {
	        model.addAttribute("words", kjvService.getAllWords());
	        return "index";
	 }

	
	
	  @PostMapping("/search")
	    public String search(@RequestParam String word, Model model) {

	        model.addAttribute("words",kjvService.getAllWords());
	        KjvEntity result = kjvService.getKjvWord(word);
	        model.addAttribute("result", result);
	        model.addAttribute("selectedWord", word);
	        
	        return "index";
	    }
}
