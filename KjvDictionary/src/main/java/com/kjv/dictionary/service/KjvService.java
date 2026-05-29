package com.kjv.dictionary.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.kjv.dictionary.entity.KjvEntity;

@Service
public class KjvService 
{
	private Map<String, KjvEntity> wordMap = new HashMap<>();
	
	public KjvService()
	{
	

//		wordMap.put("Select Word", new KjvEntity(" Select Word", " Select the word", List.of("Job 40:11 - Cast abroad the rage of thy wrath: and behold every one that is proud, and abase him","Daniel 4:37 - Now I Nebuchadnezzar praise and extol and honour the King of heaven, all whose works are truth, and his ways judgment: and those that walk in pride he is able to abase", "Ezekiel 21:26 - Thus saith the Lord GOD; Remove the diadem, and take off the crown: this shall not be the same: exalt him that is low, and abase him that is high")));

		wordMap.put("Abase", new KjvEntity("Abase", "to humble", List.of("Job 40:11 - Cast abroad the rage of thy wrath: and behold every one that is proud, and abase him","Daniel 4:37 - Now I Nebuchadnezzar praise and extol and honour the King of heaven, all whose works are truth, and his ways judgment: and those that walk in pride he is able to abase", "Ezekiel 21:26 - Thus saith the Lord GOD; Remove the diadem, and take off the crown: this shall not be the same: exalt him that is low, and abase him that is high")));
		wordMap.put("Adamant", new KjvEntity("Adamant", "hard stone", List.of("Ezekiel 3:9 - As an adamant harder than flint have I made thy forehead: fear them not, neither be dismayed at their looks, though they be a rebellious house.", "Zechariah 7:12 - Yea, they made their hearts as an adamant stone, lest they should hear the law, and the words which the LORD of hosts hath sent in his spirit by the former prophets: therefore came a great wrath from the LORD of hosts.")));	
		wordMap.put("Admonish", new KjvEntity("Admonish", "mild reproof", List.of("Romans 15:14 - And I myself also am persuaded of you, my brethren, that ye also are full of goodness, filled with all knowledge, able also to admonish one another."," 1 Thessalonians 5:12 - And we beseech you, brethren, to know them which labour among you, and are over you in the Lord, and admonish you;", "2 Thessalonians 3 :15 - Yet count him not as an enemy, but admonish him as a brother.")));
		wordMap.put("Alleluia", new KjvEntity("Alleluia", "praise the Lord", List.of("Revelation 19:1 - And after these things I heard a great voice of much people in heaven, saying, Alleluia; Salvation, and glory, and honour, and power, unto the Lord our God:", "Revelation 19:3 - And again they said, Alleluia. And her smoke rose up for ever and ever.", "Revelation 19:4 - And the four and twenty elders and the four beasts fell down and worshipped God that sat on the throne, saying, Amen; Alleluia.")));
		wordMap.put("Alms", new KjvEntity("Alms", "relief to the poor", List.of("Matthew 6:3 - But when thou doest alms, let not thy left hand know what thy right hand doeth:", "Acts 3:3 - Who seeing Peter and John about to go into the temple asked an alms.", "Luke 11:41 - But rather give alms of such things as ye have; and, behold, all things are clean unto you.")));
		wordMap.put("Amiss", new KjvEntity("Amiss", "in error", List.of("Luke 23:41 - And we indeed justly; for we receive the due reward of our deeds: but this man hath done nothing amiss.", "James 4:3 - Ye ask, and receive not, because ye ask amiss, that ye may consume it upon your lusts.", "2 Chronicles 6:37 - Yet if they bethink themselves in the land whither they are carried captive, and turn and pray unto thee in the land of their captivity, saying, We have sinned, we have done amiss, and have dealt wickedly;")));
		wordMap.put("Angle", new KjvEntity("Angle","fishing with a line and hook", List.of("Isaiah 19:8 - The fishers also shall mourn, and all they that cast angle into the brooks shall lament, and they that spread nets upon the waters shall languish.", "Habakkuk 1:15 - They take up all of them with the angle, they catch them in their net, and gather them in their drag: therefore they rejoice and are glad.")));
		wordMap.put("Anon", new KjvEntity("Anon", "immediately", List.of ("Matthew 13:20 - But he that received the seed into stony places, the same is he that heareth the word, and anon with joy receiveth it;", "Mark 1:30 - But Simon's wife's mother lay sick of a fever, and anon they tell him of her.")));
		wordMap.put("Apostle", new KjvEntity("Apostle", "sent one", List.of("Romans 1:1 - Paul, a servant of Jesus Christ, called to be an apostle, separated unto the gospel of God," ,", Romans 11:13 - For I speak to you Gentiles, inasmuch as I am the apostle of the Gentiles, I magnify mine office:", "Hebrews 3:1 - Wherefore, holy brethren, partakers of the heavenly calling, consider the Apostle and High Priest of our profession, Christ Jesus;")));
		wordMap.put("Apothecary", new KjvEntity("Apothecary", "one who compounds/prepares medicines or perfumes", List.of("Exodus 30:35 - And thou shalt make it a perfume, a confection after the art of the apothecary, tempered together, pure and holy:", "Ecclesiastes 10:1 - Dead flies cause the ointment of the apothecary to send forth a stinking savour: so doth a little folly him that is in reputation for wisdom and honour.", "Exodus 37:29 - And he made the holy anointing oil, and the pure incense of sweet spices, according to the work of the apothecary.")));	
		
		wordMap.put("Apparel", new KjvEntity("Apparel", "clothing, covering", List.of("Acts 20:33 - I have coveted no man's silver, or gold, or apparel.", "2 Chronicles 9:4 - And the meat of his table, and the sitting of his servants, and the attendance of his ministers, and their apparel; his cupbearers also, and their apparel; and his ascent by which he went up into the house of the LORD; there was no more spirit in her.", "Isaiah 63:2 - Wherefore art thou red in thine apparel, and thy garments like him that treadeth in the winefat?")));
		wordMap.put("Appertain", new KjvEntity("Appertain", "to belong to", List.of("Jeremiah 10:7 - Who would not fear thee, O King of nations? for to thee doth it appertain: forasmuch as among all the wise men of the nations, and in all their kingdoms, there is none like unto thee.", "Numbers 16:30 - But if the LORD make a new thing, and the earth open her mouth, and swallow them up, with all that appertain unto them, and they go down quick into the pit; then ye shall understand that these men have provoked the LORD.")));
		wordMap.put("Art", new KjvEntity("Art", "are", List.of("Daniel 5:27 - TEKEL; Thou art weighed in the balances, and art found wanting.", "Psalms 86:10 - For thou art great, and doest wondrous things: thou art God alone.", "Romans 2:19 - And art confident that thou thyself art a guide of the blind, a light of them which are in darkness,")));
		wordMap.put("Artificer", new KjvEntity("Artificer", "one who makes something by art or skill", List.of("Genesis 4:22 - And Zillah, she also bare Tubalcain, an instructer of every artificer in brass and iron: and the sister of Tubalcain was Naamah.", "Isaiah 3:3 - The captain of fifty, and the honourable man, and the counsellor, and the cunning artificer, and the eloquent orator.")));
		wordMap.put("Asp", new KjvEntity("Asp", "the ancient Egyptian Cobra", List.of("Isaiah 11:8 - And the sucking child shall play on the hole of the asp, and the weaned child shall put his hand on the cockatrice' den.")));
		wordMap.put("Assay", new KjvEntity("Assay", "to attempt", List.of("Job 4:2 - If we assay to commune with thee, wilt thou be grieved? but who can withhold himself from speaking?")));
		wordMap.put("Asswage", new KjvEntity("Asswage", "relieve or lessen", List.of("Job 16:5 - But I would strengthen you with my mouth, and the moving of my lips should asswage your grief.")));
		wordMap.put("Astonied", new KjvEntity("Astonied", "astonished", List.of("Ezekiel 4:17 -That they may want bread and water, and be astonied one with another, and consume away for their iniquity.", "Daniel 5:9 - Then was king Belshazzar greatly troubled, and his countenance was changed in him, and his lords were astonied.", "Ezra 9:3 - And when I heard this thing, I rent my garment and my mantle, and plucked off the hair of my head and of my beard, and sat down astonied.")));
		
		wordMap.put("Asunder", new KjvEntity("Asunder", "divide into parts", List.of("Zechariah 11:14 - Then I cut asunder mine other staff, even Bands, that I might break the brotherhood between Judah and Israel.", "Mark 10:9 - What therefore God hath joined together, let not man put asunder.", "Hebrews 4:12 - For the word of God is quick, and powerful, and sharper than any twoedged sword, piercing even to the dividing asunder of soul and spirit, and of the joints and marrow, and is a discerner of the thoughts and intents of the heart.")));
		wordMap.put("Avouched", new KjvEntity("Avouched", "affirmed", List.of("Deuteronomy 26:18 - And the LORD hath avouched thee this day to be his peculiar people, as he hath promised thee, and that thou shouldest keep all his commandments;", "Deuteronomy 26:17 - Thou hast avouched the LORD this day to be thy God, and to walk in his ways, and to keep his statutes, and his commandments, and his judgments, and to hearken unto his voice:")));
		wordMap.put("Axletrees", new KjvEntity("Axletrees", "wooden axles", List.of("1 Kings 7:33 - And the work of the wheels was like the work of a chariot wheel: their axletrees, and their naves, and their felloes, and their spokes, were all molten.", "1 Kings 7:32 - And under the borders were four wheels; and the axletrees of the wheels were joined to the base: and the height of a wheel was a cubit and half a cubit.")));

		
		
		//wordMap.put("Assay", new KjvEntity("Apparel", "“clothing, covering", List.of("Acts 20:33 - I have coveted no man's silver, or gold, or apparel.", "2 Chronicles 9:4 - And the meat of his table, and the sitting of his servants, and the attendance of his ministers, and their apparel; his cupbearers also, and their apparel; and his ascent by which he went up into the house of the LORD; there was no more spirit in her.", "Isaiah 63:2 - Wherefore art thou red in thine apparel, and thy garments like him that treadeth in the winefat?")));


		
		
		
	}
	
	
    public Set<String> getAllWords() {
        return wordMap.keySet();
    }
	
	public KjvEntity getKjvWord(String word)
	{
		return wordMap.get(word);
	}
}
