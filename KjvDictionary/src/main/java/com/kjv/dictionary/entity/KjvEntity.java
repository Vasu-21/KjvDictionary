package com.kjv.dictionary.entity;

import java.util.List;

public class KjvEntity 
{
	
	private String name;
	private String meaning;
	private List<String> references;
	
	

	public KjvEntity(String name, String meaning, List<String> references) {
		super();
		this.name = name;
		this.meaning = meaning;
		this.references = references;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public List<String> getReferences() {
		return references;
	}

	public void setReferences(List<String> references) {
		this.references = references;
	}

	
	
}
