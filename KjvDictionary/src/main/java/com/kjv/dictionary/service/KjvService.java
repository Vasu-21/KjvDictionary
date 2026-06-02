package com.kjv.dictionary.service;

import java.util.ArrayList;
import java.util.Collections;
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

		//B
		wordMap.put("Barbarian", new KjvEntity("Barbarian", "a foreigner", List.of("1 Corinthians 14:11 - Therefore if I know not the meaning of the voice, I shall be unto him that speaketh a barbarian, and he that speaketh shall be a barbarian unto me.", "Colossians 3:11 - Where there is neither Greek nor Jew, circumcision nor uncircumcision, Barbarian, Scythian, bond nor free: but Christ is all, and in all.")));
		wordMap.put("Base", new KjvEntity("Base", "of little worth", List.of("1 Kings 7:34 - And there were four undersetters to the four corners of one base: and the undersetters were of the very base itself.", "Malachi 2:9 - Therefore have I also made you contemptible and base before all the people, according as ye have not kept my ways, but have been partial in the law.", "2 Samuel 6:22 - And I will yet be more vile than thus, and will be base in mine own sight: and of the maidservants which thou hast spoken of, of them shall I be had in honour.")));
		wordMap.put("Bastard", new KjvEntity("Bastard", "an illegitimate child", List.of("Deuteronomy 23:2 - A bastard shall not enter into the congregation of the LORD; even to his tenth generation shall he not enter into the congregation of the LORD.", "Zechariah 9:6 - And a bastard shall dwell in Ashdod, and I will cut off the pride of the Philistines.")));
		wordMap.put("Beeves", new KjvEntity("Beeves", "the plural of beef", List.of("Numbers 31:33 - And threescore and twelve thousand beeves,", "Leviticus 22:19 - Ye shall offer at your own will a male without blemish, of the beeves, of the sheep, or of the goats.", "Numbers 31:28 - And levy a tribute unto the LORD of the men of war which went out to battle: one soul of five hundred, both of the persons, and of the beeves, and of the asses, and of the sheep:")));
		wordMap.put("Begat", new KjvEntity("Begat", "to bring forth, procreate", List.of("Nehemiah 12:10 - And Jeshua begat Joiakim, Joiakim also begat Eliashib, and Eliashib begat Joiada,", "Matthew 1:3 - And Judas begat Phares and Zara of Thamar; and Phares begat Esrom; and Esrom begat Aram;", "1 Chronicles 9:39 - And Ner begat Kish; and Kish begat Saul; and Saul begat Jonathan, and Malchishua, and Abinadab, and Eshbaal.")));
		wordMap.put("Beseech", new KjvEntity("Beseech", "to beg or implore", List.of("Psalms 118:25 - Save now, I beseech thee, O LORD: O LORD, I beseech thee, send now prosperity.", "Exodus 33:18 - And he said, I beseech thee, shew me thy glory.", "2 Corinthians 2:8 - Wherefore I beseech you that ye would confirm your love toward him.")));
		wordMap.put("Bethink", new KjvEntity("Bethink", "to recollect", List.of("2 Chronicles 6:37 - Yet if they bethink themselves in the land whither they are carried captive, and turn and pray unto thee in the land of their captivity, saying, We have sinned, we have done amiss, and have dealt wickedly;", "1 Kings 8:47 - Yet if they shall bethink themselves in the land whither they were carried captives, and repent, and make supplication unto thee in the land of them that carried them captives, saying, We have sinned, and have done perversely, we have committed wickedness;")));
		wordMap.put("Betimes", new KjvEntity("Betimes", "early, before it is late", List.of("Genesis 26:31 - And they rose up betimes in the morning, and sware one to another: and Isaac sent them away, and they departed from him in peace.", "Job 8:5 - If thou wouldest seek unto God betimes, and make thy supplication to the Almighty;", "Proverbs 13:24 - He that spareth his rod hateth his son: but he that loveth him chasteneth him betimes.")));
		wordMap.put("Betroth", new KjvEntity("Betroth", "contracted for future marriage; espoused", List.of("Deuteronomy 28:30 - Thou shalt betroth a wife, and another man shall lie with her: thou shalt build an house, and thou shalt not dwell therein: thou shalt plant a vineyard, and shalt not gather the grapes thereof.", "Hosea 2:19 - And I will betroth thee unto me for ever; yea, I will betroth thee unto me in righteousness, and in judgment, and in lovingkindness, and in mercies.", "Hosea 2:20 - I will even betroth thee unto me in faithfulness: and thou shalt know the LORD.")));	
		wordMap.put("Betwixt", new KjvEntity("Betwixt", "between", List.of("Genesis 26:28 - And they said, We saw certainly that the LORD was with thee: and we said, Let there be now an oath betwixt us, even betwixt us and thee, and let us make a covenant with thee;", "Job 9:33 - Neither is there any daysman betwixt us, that might lay his hand upon us both.", "Song of Solomon 1:13 - A bundle of myrrh is my wellbeloved unto me; he shall lie all night betwixt my breasts.")));
		wordMap.put("Bewitched", new KjvEntity("Bewitched", "to be affected by witchcraft; to be deceived", List.of("Acts 8:9 - But there was a certain man, called Simon, which beforetime in the same city used sorcery, and bewitched the people of Samaria, giving out that himself was some great one:", "Acts 8:11 - And to him they had regard, because that of long time he had bewitched them with sorceries.", "Galatians 3:1 - O foolish Galatians, who hath bewitched you, that ye should not obey the truth, before whose eyes Jesus Christ hath been evidently set forth, crucified among you?")));
		wordMap.put("Bewray", new KjvEntity("Bewray", "to reveal; to betray", List.of("Isaiah 16:3 - Take counsel, execute judgment; make thy shadow as the night in the midst of the noonday; hide the outcasts; bewray not him that wandereth.")));
		wordMap.put("Bier", new KjvEntity("Bier", "a frame on which a corpse or casket is laid", List.of("2 Samuel 3:31 - And David said to Joab, and to all the people that were with him, Rend your clothes, and gird you with sackcloth, and mourn before Abner. And king David himself followed the bier.", "Luke 7:14 - And he came and touched the bier: and they that bare him stood still. And he said, Young man, I say unto thee, Arise.")));
		wordMap.put("Bittern", new KjvEntity("Bittern", "a bird similar to a heron", List.of("Isaiah 14:23 - I will also make it a possession for the bittern, and pools of water: and I will sweep it with the besom of destruction, saith the LORD of hosts.","Isaiah 34:11 - But the cormorant and the bittern shall possess it; the owl also and the raven shall dwell in it: and he shall stretch out upon it the line of confusion, and the stones of emptiness.", "Zephaniah 2:14 - And flocks shall lie down in the midst of her, all the beasts of the nations: both the cormorant and the bittern shall lodge in the upper lintels of it; their voice shall sing in the windows; desolation shall be in the thresholds: for he shall uncover the cedar work.")));
		wordMap.put("Blains", new KjvEntity("Blains", "a swelling; a boil", List.of("Exodus 9:9 - And it shall become small dust in all the land of Egypt, and shall be a boil breaking forth with blains upon man, and upon beast, throughout all the land of Egypt.", "Exodus 9:10 - And they took ashes of the furnace, and stood before Pharaoh; and Moses sprinkled it up toward heaven; and it became a boil breaking forth with blains upon man, and upon beast.")));

		
		wordMap.put("Bolster", new KjvEntity("Bolster", "a support cushion", List.of("1 Samuel 19:13 - And Michal took an image, and laid it in the bed, and put a pillow of goats' hair for his bolster, and covered it with a cloth.", "1 Samuel 19:16 - And when the messengers were come in, behold, there was an image in the bed, with a pillow of goats' hair for his bolster.", "1 Samuel 26:7 - So David and Abishai came to the people by night: and, behold, Saul lay sleeping within the trench, and his spear stuck in the ground at his bolster: but Abner and the people lay round about him.")));
		wordMap.put("Bowels", new KjvEntity("Bowels", "intestines; the heart or soul", List.of("Job 30:27 - My bowels boiled, and rested not: the days of affliction prevented me.","Philemon 1:12 - Whom I have sent again: thou therefore receive him, that is, mine own bowels:","Isaiah 16:11 - Wherefore my bowels shall sound like an harp for Moab, and mine inward parts for Kirharesh.")));
		wordMap.put("Bray", new KjvEntity("Bray", "to crush; to cry out", List.of("Proverbs 27:22 - Though thou shouldest bray a fool in a mortar among wheat with a pestle, yet will not his foolishness depart from him.", "Job 6:5 - Doth the wild ass bray when he hath grass? or loweth the ox over his fodder?")));
		wordMap.put("Breeches", new KjvEntity("Breeches", "garments for the loins and thighs", List.of("Exodus 28:42 - And thou shalt make them linen breeches to cover their nakedness; from the loins even unto the thighs they shall reach:" , "Ezekiel 44:18 - They shall have linen bonnets upon their heads, and shall have linen breeches upon their loins; they shall not gird themselves with any thing that causeth sweat." , "Leviticus 6:10 - And the priest shall put on his linen garment, and his linen breeches shall he put upon his flesh, and take up the ashes which the fire hath consumed with the burnt offering on the altar, and he shall put them beside the altar.")));
		wordMap.put("Brimstone", new KjvEntity("Brimstone", "burning stone of sulphur", List.of("Luke 17:29 - But the same day that Lot went out of Sodom it rained fire and brimstone from heaven, and destroyed them all.", "Revelation 9:17 - And thus I saw the horses in the vision, and them that sat on them, having breastplates of fire, and of jacinth, and brimstone: and the heads of the horses were as the heads of lions; and out of their mouths issued fire and smoke and brimstone." , "Psalms 11:6 - Upon the wicked he shall rain snares, fire and brimstone, and an horrible tempest: this shall be the portion of their cup.")));
		wordMap.put("Broidered", new KjvEntity("Broidered", "to adorn with needlework", List.of("Exodus 28:4 - And these are the garments which they shall make; a breastplate, and an ephod, and a robe, and a broidered coat, a mitre, and a girdle: and they shall make holy garments for Aaron thy brother, and his sons, that he may minister unto me in the priest's office." , "Ezekiel 16:13 - Thus wast thou decked with gold and silver; and thy raiment was of fine linen, and silk, and broidered work; thou didst eat fine flour, and honey, and oil: and thou wast exceeding beautiful, and thou didst prosper into a kingdom." , "Ezekiel 27:16 - Syria was thy merchant by reason of the multitude of the wares of thy making: they occupied in thy fairs with emeralds, purple, and broidered work, and fine linen, and coral, and agate.")));
		wordMap.put("Bruit", new KjvEntity("Bruit", "rumor, report", List.of("Jeremiah 10:22 - Behold, the noise of the bruit is come, and a great commotion out of the north country, to make the cities of Judah desolate, and a den of dragons." ,"Nahum 3:19 - There is no healing of thy bruise; thy wound is grievous: all that hear the bruit of thee shall clap the hands over thee: for upon whom hath not thy wickedness passed continually?")));
		wordMap.put("Brutish", new KjvEntity("Brutish", "brutal, ignorant", List.of("Psalms 92:6 - A brutish man knoweth not; neither doth a fool understand this.", "Jeremiah 10:8 - But they are altogether brutish and foolish: the stock is a doctrine of vanities." , "Proverbs 12:1 - Whoso loveth instruction loveth knowledge: but he that hateth reproof is brutish.")));
		wordMap.put("Buckler", new KjvEntity("Buckler", "a round shield with a grip", List.of("Jeremiah 46:3 - Order ye the buckler and shield, and draw near to battle.", "Psalms 35:2 - Take hold of shield and buckler, and stand up for mine help.", "Proverbs 2:7 - He layeth up sound wisdom for the righteous: he is a buckler to them that walk uprightly.")));
		wordMap.put("Bulrush", new KjvEntity("Bulrush", "a cattail", List.of("Isaiah 58:5 - Is it such a fast that I have chosen? a day for a man to afflict his soul? is it to bow down his head as a bulrush, and to spread sackcloth and ashes under him? wilt thou call this a fast, and an acceptable day to the LORD?")));


		wordMap.put("Bunches", new KjvEntity("Bunches", "hump or cluster", List.of("2 Samuel 16:1 - And when David was a little past the top of the hill, behold, Ziba the servant of Mephibosheth met him, with a couple of asses saddled, and upon them two hundred loaves of bread, and an hundred bunches of raisins, and an hundred of summer fruits, and a bottle of wine.", "1 Chronicles 12:40 - Moreover they that were nigh them, even unto Issachar and Zebulun and Naphtali, brought bread on asses, and on camels, and on mules, and on oxen, and meat, meal, cakes of figs, and bunches of raisins, and wine, and oil, and oxen, and sheep abundantly: for there was joy in Israel." , "Isaiah 30:6 - The burden of the beasts of the south: into the land of trouble and anguish, from whence come the young and old lion, the viper and fiery flying serpent, they will carry their riches upon the shoulders of young asses, and their treasures upon the bunches of camels, to a people that shall not profit them.")));
		wordMap.put("Carbuncle", new KjvEntity("Carbuncle", "a red precious stone", List.of("Exodus 39:10 - And they set in it four rows of stones: the first row was a sardius, a topaz, and a carbuncle: this was the first row.","Exodus 28:17 - And thou shalt set in it settings of stones, even four rows of stones: the first row shall be a sardius, a topaz, and a carbuncle: this shall be the first row.","Ezekiel 28:13 - Thou hast been in Eden the garden of God; every precious stone was thy covering, the sardius, topaz, and the diamond, the beryl, the onyx, and the jasper, the sapphire, the emerald, and the carbuncle, and gold: the workmanship of thy tabrets and of thy pipes was prepared in thee in the day that thou wast created.")));

		wordMap.put("Carriage", new KjvEntity("Carriage", "that which is carried", List.of("1 Samuel 17:22 - And David left his carriage in the hand of the keeper of the carriage, and ran into the army, and came and saluted his brethren.", "Judges 18:21 - So they turned and departed, and put the little ones and the cattle and the carriage before them.")));
		wordMap.put("Caul", new KjvEntity("Caul", "organ membrane, Gall Bladder, or hair-net", List.of("Leviticus 9:10 - And the two kidneys, and the fat that is upon them, which is by the flanks, and the caul above the liver, with the kidneys, it shall he take away.", "Hosea 13:8 - I will meet them as a bear that is bereaved of her whelps, and will rend the caul of their heart, and there will I devour them like a lion: the wild beast shall tear them.", "Exodus 29:13 - And thou shalt take all the fat that covereth the inwards, and the caul that is above the liver, and the two kidneys, and the fat that is upon them, and burn them upon the altar.")));
		wordMap.put("Cieled", new KjvEntity("Cieled", "covered, panelled", List.of("Haggai 1:4 - Is it time for you, O ye, to dwell in your cieled houses, and this house lie waste?", "Jeremiah 22:14 - That saith, I will build me a wide house and large chambers, and cutteth him out windows; and it is cieled with cedar, and painted with vermilion.", "2 Chronicles 3:5 - And the greater house he cieled with fir tree, which he overlaid with fine gold, and set thereon palm trees and chains.")));
		wordMap.put("Chapiter", new KjvEntity("Chapiter", "head of", List.of("2 Kings 25:17 - The height of the one pillar was eighteen cubits, and the chapiter upon it was brass: and the height of the chapiter three cubits; and the wreathen work, and pomegranates upon the chapiter round about, all of brass: and like unto these had the second pillar with wreathen work.","Jeremiah 52:22 - And a chapiter of brass was upon it; and the height of one chapiter was five cubits, with network and pomegranates upon the chapiters round about, all of brass. The second pillar also and the pomegranates were like unto these.", "2 Chronicles 3:15 - Also he made before the house two pillars of thirty and five cubits high, and the chapiter that was on the top of each of them was five cubits.")));
		wordMap.put("Charger", new KjvEntity("Charger", "a large dish", List.of("Matthew 14:8 - And she, being before instructed of her mother, said, Give me here John Baptist's head in a charger.","Matthew 14:11 - And his head was brought in a charger, and given to the damsel: and she brought it to her mother.","Numbers 7:85 - Each charger of silver weighing an hundred and thirty shekels, each bowl seventy: all the silver vessels weighed two thousand and four hundred shekels, after the shekel of the sanctuary:")));
		wordMap.put("Chide", new KjvEntity("Chide", "to quarrel", List.of("Exodus 17:2 - Wherefore the people did chide with Moses, and said, Give us water that we may drink. And Moses said unto them, Why chide ye with me? wherefore do ye tempt the LORD?","Psalms 103:9 - He will not always chide: neither will he keep his anger for ever.","Judges 8:1 - And the men of Ephraim said unto him, Why hast thou served us thus, that thou calledst us not, when thou wentest to fight with the Midianites? And they did chide with him sharply.")));
		wordMap.put("Choler", new KjvEntity("Choler", "anger", List.of("Daniel 11:11 - And the king of the south shall be moved with choler, and shall come forth and fight with him, even with the king of the north: and he shall set forth a great multitude; but the multitude shall be given into his hand.","Daniel 8:7 - And I saw him come close unto the ram, and he was moved with choler against him, and smote the ram, and brake his two horns: and there was no power in the ram to stand before him, but he cast him down to the ground, and stamped upon him: and there was none that could deliver the ram out of his hand.")));

		wordMap.put("Churl", new KjvEntity("Churl", "a rude man", List.of("Isaiah 32:5 - The vile person shall be no more called liberal, nor the churl said to be bountiful.","Isaiah 32:7 - The instruments also of the churl are evil: he deviseth wicked devices to destroy the poor with lying words, even when the needy speaketh right.")));
		wordMap.put("Circumspect", new KjvEntity("Circumspect", "to be cautious", List.of("Exodus 23:13 - And in all things that I have said unto you be circumspect: and make no mention of the name of other gods, neither let it be heard out of thy mouth.")));
		wordMap.put("Clouts", new KjvEntity("Clouts", "a cloth patch", List.of("Jeremiah 38:12 - And Ebedmelech the Ethiopian said unto Jeremiah, Put now these old cast clouts and rotten rags under thine armholes under the cords. And Jeremiah did so.","Jeremiah 38:11 - So Ebedmelech took the men with him, and went into the house of the king under the treasury, and took thence old cast clouts and old rotten rags, and let them down by cords into the dungeon to Jeremiah.")));
		wordMap.put("Cockatrice", new KjvEntity("Cockatrice", "a serpent", List.of("Isaiah 59:5 - They hatch cockatrice' eggs, and weave the spider's web: he that eateth of their eggs dieth, and that which is crushed breaketh out into a viper.","Isaiah 14:29 - Rejoice not thou, whole Palestina, because the rod of him that smote thee is broken: for out of the serpent's root shall come forth a cockatrice, and his fruit shall be a fiery flying serpent.","Isaiah 11:8 - And the sucking child shall play on the hole of the asp, and the weaned child shall put his hand on the cockatrice' den.")));
		wordMap.put("Coffer", new KjvEntity("Coffer", "a chest", List.of("1 Samuel 6:11 - And they laid the ark of the LORD upon the cart, and the coffer with the mice of gold and the images of their emerods.", "1 Samuel 6:8 - And take the ark of the LORD, and lay it upon the cart; and put the jewels of gold, which ye return him for a trespass offering, in a coffer by the side thereof; and send it away, that it may go.", "1 Samuel 6:15 - And the Levites took down the ark of the LORD, and the coffer that was with it, wherein the jewels of gold were, and put them on the great stone: and the men of Bethshemesh offered burnt offerings and sacrificed sacrifices the same day unto the LORD.")));
		wordMap.put("Comely", new KjvEntity("Comely", "beautiful, becoming, appropriate", List.of("Jeremiah 6:2 - I have likened the daughter of Zion to a comely and delicate woman.","1 Corinthians 11:13 - Judge in yourselves: is it comely that a woman pray unto God uncovered?", "Proverbs 30:29 - There be three things which go well, yea, four are comely in going:")));
		wordMap.put("Concourse", new KjvEntity("Concourse", "an assembly of people", List.of("Acts 19:40 - For we are in danger to be called in question for this day's uproar, there being no cause whereby we may give an account of this concourse.","Proverbs 1:21 - She crieth in the chief place of concourse, in the openings of the gates: in the city she uttereth her words, saying,")));
		wordMap.put("Concubine", new KjvEntity("Concubine", "a mistress;  a wife of inferior rank", List.of("2 Samuel 3:7 - And Saul had a concubine, whose name was Rizpah, the daughter of Aiah: and Ishbosheth said to Abner, Wherefore hast thou gone in unto my father's concubine?","1 Chronicles 2:48 - Maachah, Caleb's concubine, bare Sheber, and Tirhanah.","2 Samuel 21:11 - And it was told David what Rizpah the daughter of Aiah, the concubine of Saul, had done.")));
		wordMap.put("Concupiscence", new KjvEntity("Concupiscence", "strong desire", List.of("Colossians 3:5 - Mortify therefore your members which are upon the earth; fornication, uncleanness, inordinate affection, evil concupiscence, and covetousness, which is idolatry:","1 Thessalonians 4:5 - Not in the lust of concupiscence, even as the Gentiles which know not God:","Romans 7:8 - But sin, taking occasion by the commandment, wrought in me all manner of concupiscence. For without the law sin was dead.")));

		wordMap.put("Coney", new KjvEntity("Coney", "a rabbit like, nocturnal animal", List.of("Leviticus 11:5 - And the coney, because he cheweth the cud, but divideth not the hoof; he is unclean unto you.","Deuteronomy 14:7 - Nevertheless these ye shall not eat of them that chew the cud, or of them that divide the cloven hoof; as the camel, and the hare, and the coney: for they chew the cud, but divide not the hoof; therefore they are unclean unto you.")));
		wordMap.put("Contemn", new KjvEntity("Contemn", "to despise", List.of("Psalms 10:13 - Wherefore doth the wicked contemn God? he hath said in his heart, Thou wilt not require it.","Ezekiel 21:13 - Because it is a trial, and what if the sword contemn even the rod? it shall be no more, saith the Lord GOD.")));
		wordMap.put("Contrite", new KjvEntity("Contrite", "broken, humble", List.of("Psalms 34:18 - The LORD is nigh unto them that are of a broken heart; and saveth such as be of a contrite spirit.", "Psalms 51:17 - The sacrifices of God are a broken spirit: a broken and a contrite heart, O God, thou wilt not despise.", "Isaiah 66:2 - For all those things hath mine hand made, and all those things have been, saith the LORD: but to this man will I look, even to him that is poor and of a contrite spirit, and trembleth at my word.")));
		wordMap.put("Conversation", new KjvEntity("Conversation","behavior, conduct",List.of("Philippians 1:27 - Only let your conversation be as it becometh the gospel of Christ: that whether I come and see you, or else be absent, I may hear of your affairs, that ye stand fast in one spirit, with one mind striving together for the faith of the gospel;","1 Peter 1:15 - But as he which hath called you is holy, so be ye holy in all manner of conversation;","1 Peter 3:16 - Having a good conscience; that, whereas they speak evil of you, as of evildoers, they may be ashamed that falsely accuse your good conversation in Christ.")));
		wordMap.put("Convocation", new KjvEntity("Convocation","a called assembly",List.of("Leviticus 23:3 - Six days shall work be done: but the seventh day is the sabbath of rest, an holy convocation; ye shall do no work therein: it is the sabbath of the LORD in all your dwellings.","Leviticus 23:7 - In the first day ye shall have an holy convocation: ye shall do no servile work therein.","Numbers 28:18 - In the first day shall be an holy convocation; ye shall do no manner of servile work therein.")));
		wordMap.put("Coriander", new KjvEntity("Coriander","plant with small spicy seeds",List.of("Exodus 16:31 - And the house of Israel called the name thereof Manna: and it was like coriander seed, white; and the taste of it was like wafers made with honey.","Numbers 11:7 - And the manna was as coriander seed, and the colour thereof as the colour of bdellium.")));
		wordMap.put("Cormorant", new KjvEntity("Cormorant","a large ravenous sea bird",List.of("Leviticus 11:17 - And the little owl, and the cormorant, and the great owl,","Deuteronomy 14:17 - And the pelican, and the gier eagle, and the cormorant,","Zephaniah 2:14 - And flocks shall lie down in the midst of her, all the beasts of the nations: both the cormorant and the bittern shall lodge in the upper lintels of it; their voice shall sing in the windows; desolation shall be in the thresholds: for he shall uncover the cedar work.")));
		wordMap.put("Covert", new KjvEntity("Covert","a shelter or hiding place",List.of("1 Samuel 25:20 - And it was so, as she rode on the ass, that she came down by the covert of the hill, and, behold, David and his men came down against her; and she met them.","Job 38:40 - When they couch in their dens, and abide in the covert to lie in wait?","Jeremiah 25:38 - He hath forsaken his covert, as the lion: for their land is desolate because of the fierceness of the oppressor, and because of his fierce anger.")));
		wordMap.put("Crib", new KjvEntity("Crib","the manger of a stable",List.of("Proverbs 14:4 - Where no oxen are, the crib is clean: but much increase is by the strength of the ox.","Isaiah 1:3 - The ox knoweth his owner, and the ass his master's crib: but Israel doth not know, my people doth not consider.","Job 39:9 - Will the unicorn be willing to serve thee, or abide by thy crib?")));

		wordMap.put("Cruse", new KjvEntity("Cruse","a small vessel for holding liquids",List.of("1 Kings 17:12 - And she said, As the LORD thy God liveth, I have not a cake, but an handful of meal in a barrel, and a little oil in a cruse: and, behold, I am gathering two sticks, that I may go in and dress it for me and my son, that we may eat it, and die.","1 Kings 17:14 - For thus saith the LORD God of Israel, The barrel of meal shall not waste, neither shall the cruse of oil fail, until the day that the LORD sendeth rain upon the earth.","1 Kings 17:16 - And the barrel of meal wasted not, neither did the cruse of oil fail, according to the word of the LORD, which he spake by Elijah.")));
		wordMap.put("Cubit", new KjvEntity("Cubit","measurement from elbow to fingertip ~ 18-22 inches",List.of("Genesis 6:15 - And this is the fashion which thou shalt make it of: The length of the ark shall be three hundred cubits, the breadth of it fifty cubits, and the height of it thirty cubits.","Exodus 25:10 - And they shall make an ark of shittim wood: two cubits and a half shall be the length thereof, and a cubit and a half the breadth thereof, and a cubit and a half the height thereof.","Ezekiel 40:5 - And behold a wall on the outside of the house round about, and in the man's hand a measuring reed of six cubits long by the cubit and an hand breadth: so he measured the breadth of the building, one reed; and the height, one reed.")));
		wordMap.put("Cummin", new KjvEntity("Cummin","a plant used as a spice",List.of("Isaiah 28:25 - When he hath made plain the face thereof, doth he not cast abroad the fitches, and scatter the cummin, and cast in the principal wheat and the appointed barley and the rie in their place?","Isaiah 28:27 - For the fitches are not threshed with a threshing instrument, neither is a cart wheel turned about upon the cummin; but the fitches are beaten out with a staff, and the cummin with a rod.","Matthew 23:23 - Woe unto you, scribes and Pharisees, hypocrites! for ye pay tithe of mint and anise and cummin, and have omitted the weightier matters of the law, judgment, mercy, and faith...")));
		wordMap.put("Curious", new KjvEntity("Curious","detailed; skillfully made",List.of("Exodus 26:1 - Moreover thou shalt make the tabernacle with ten curtains of fine twined linen, and blue, and purple, and scarlet: with cherubims of cunning work shalt thou make them.","Exodus 28:8 - And the curious girdle of the ephod, which is upon it, shall be of the same, according to the work thereof; even of gold, of blue, and purple, and scarlet, and fine twined linen.","Exodus 39:5 - And the curious girdle of his ephod, that was upon it, was of the same, according to the work thereof; of gold, blue, and purple, and scarlet, and fine twined linen; as the LORD commanded Moses.")));
		wordMap.put("Dam", new KjvEntity("Dam","a mother animal",List.of("Deuteronomy 22:6 - If a bird's nest chance to be before thee in the way in any tree, or on the ground, whether they be young ones, or eggs, and the dam sitting upon the young, or upon the eggs, thou shalt not take the dam with the young:","Deuteronomy 22:7 - But thou shalt in any wise let the dam go, and take the young to thee; that it may be well with thee, and that thou mayest prolong thy days.")));
		wordMap.put("Damsel", new KjvEntity("Damsel","a young unmarried girl",List.of("Genesis 24:16 - And the damsel was very fair to look upon, a virgin, neither had any man known her...","Mark 5:41 - And he took the damsel by the hand, and said unto her, Talitha cumi; which is, being interpreted, Damsel, I say unto thee, arise.","Acts 12:13 - And as Peter knocked at the door of the gate, a damsel came to hearken, named Rhoda.")));
		wordMap.put("Dayspring", new KjvEntity("Dayspring","sunrise",List.of("Job 38:12 - Hast thou commanded the morning since thy days; and caused the dayspring to know his place;","Luke 1:78 - Through the tender mercy of our God; whereby the dayspring from on high hath visited us;")));
		wordMap.put("Dearth", new KjvEntity("Dearth","scarcity of rain; drought",List.of("Genesis 41:54 - And the seven years of dearth began to come, according as Joseph had said: and the dearth was in all lands; but in all the land of Egypt there was bread.","Jeremiah 14:1 - The word of the LORD that came to Jeremiah concerning the dearth.","Acts 11:28 - And there stood up one of them named Agabus, and signified by the Spirit that there should be great dearth throughout all the world: which came to pass in the days of Claudius Caesar.")));
		
		
		wordMap.put("Diadem", new KjvEntity("Diadem","royal head-dress",List.of("Isaiah 28:5 - In that day shall the LORD of hosts be for a crown of glory, and for a diadem of beauty, unto the residue of his people,","Ezekiel 21:26 - Thus saith the Lord GOD; Remove the diadem, and take off the crown: this shall not be the same: exalt him that is low, and abase him that is high.","Isaiah 62:3 - Thou shalt also be a crown of glory in the hand of the LORD, and a royal diadem in the hand of thy God.")));
		wordMap.put("Dispensation", new KjvEntity("Dispensation","dealing out; distribution",List.of("1 Corinthians 9:17 - For if I do this thing willingly, I have a reward: but if against my will, a dispensation of the gospel is committed unto me.","Ephesians 1:10 - That in the dispensation of the fulness of times he might gather together in one all things in Christ, both which are in heaven, and which are on earth; even in him:","Colossians 1:25 - Whereof I am made a minister, according to the dispensation of God which is given to me for you, to fulfil the word of God;")));
		wordMap.put("Divers", new KjvEntity("Divers","different, diverse",List.of("Matthew 24:7 - For nation shall rise against nation, and kingdom against kingdom: and there shall be famines, and pestilences, and earthquakes, in divers places.","Mark 1:34 - And he healed many that were sick of divers diseases, and cast out many devils; and suffered not the devils to speak, because they knew him.","Hebrews 13:9 - Be not carried about with divers and strange doctrines. For it is a good thing that the heart be established with grace; not with meats, which have not profited them that have been occupied therein.")));
		wordMap.put("Doleful", new KjvEntity("Doleful","sorrowful, mournful, or grieved",List.of("Isaiah 13:21 - But wild beasts of the desert shall lie there; and their houses shall be full of doleful creatures; and owls shall dwell there, and satyrs shall dance there.","Isaiah 34:13 - And thorns shall come up in her palaces, nettles and brambles in the fortresses thereof: and it shall be an habitation of dragons, and a court for owls.","Jeremiah 50:39 - Therefore the wild beasts of the desert with the wild beasts of the islands shall dwell there, and the owls shall dwell therein...")));
		wordMap.put("Dote", new KjvEntity("Dote","to say or think foolishly",List.of("Jeremiah 50:36 - A sword is upon the liars; and they shall dote: a sword is upon her mighty men; and they shall be dismayed.")));
		wordMap.put("Drams", new KjvEntity("Drams","a weight of measure",List.of("Ezra 2:69 - They gave after their ability unto the treasure of the work threescore and one thousand drams of gold, and five thousand pound of silver, and one hundred priests' garments.","Nehemiah 7:70 - And some of the chief of the fathers gave unto the work. The Tirshatha gave to the treasure a thousand drams of gold, fifty basons, five hundred and thirty priests' garments.","Nehemiah 7:71 - And some of the chief of the fathers gave to the treasure of the work twenty thousand drams of gold, and two thousand and two hundred pound of silver.")));
		wordMap.put("Draught", new KjvEntity("Draught","something derived or extracted",List.of("Luke 5:4 - Now when he had left speaking, he said unto Simon, Launch out into the deep, and let down your nets for a draught.","Luke 5:9 - For he was astonished, and all that were with him, at the draught of the fishes which they had taken:","Matthew 15:17 - Do not ye yet understand, that whatsoever entereth in at the mouth goeth into the belly, and is cast out into the draught?")));
		wordMap.put("Dromedary", new KjvEntity("Dromedary","a one hump camel",List.of("Jeremiah 2:23 - How canst thou say, I am not polluted, I have not gone after Baalim? see thy way in the valley, know what thou hast done: thou art a swift dromedary traversing her ways.")));
		
		wordMap.put("Duke(s)", new KjvEntity("Duke(s)","a chief, commander",List.of("Genesis 36:15 - These were dukes of the sons of Esau: the sons of Eliphaz the firstborn son of Esau; duke Teman, duke Omar, duke Zepho, duke Kenaz,","Genesis 36:40 - And these are the names of the dukes that came of Esau, according to their families, after their places, by their names; duke Timnah, duke Alvah, duke Jetheth,","1 Chronicles 1:54 - Duke Magdiel, duke Iram. These are the dukes of Edom.")));
		wordMap.put("Durst", new KjvEntity("Durst","dared",List.of("Matthew 22:46 - And no man was able to answer him a word, neither durst any man from that day forth ask him any more questions.","Mark 12:34 - And when Jesus saw that he answered discreetly, he said unto him, Thou art not far from the kingdom of God. And no man after that durst ask him any question.","John 21:12 - Jesus saith unto them, Come and dine. And none of the disciples durst ask him, Who art thou? knowing that it was the Lord.")));
		wordMap.put("Emerods", new KjvEntity("Emerods","hemorrhoids",List.of("Deuteronomy 28:27 - The LORD will smite thee with the botch of Egypt, and with the emerods, and with the scab, and with the itch, whereof thou canst not be healed.","1 Samuel 5:6 - But the hand of the LORD was heavy upon them of Ashdod, and he destroyed them, and smote them with emerods, even Ashdod and the coasts thereof.","1 Samuel 6:4 - Then said they, What shall be the trespass offering which we shall return to him? They answered, Five golden emerods, and five golden mice, according to the number of the lords of the Philistines.")));
		wordMap.put("Emulation(s)", new KjvEntity("Emulation(s)","a jealous rivalry",List.of("Galatians 5:20 - Idolatry, witchcraft, hatred, variance, emulations, wrath, strife, seditions, heresies,","Romans 11:14 - If by any means I may provoke to emulation them which are my flesh, and might save some of them.")));
		wordMap.put("Enjoin(ed)", new KjvEntity("Enjoin(ed)","to direct, command, or impose",List.of("Philemon 1:8 - Wherefore, though I might be much bold in Christ to enjoin thee that which is convenient,")));
		wordMap.put("Ensample(s)", new KjvEntity("Ensample(s)","an example",List.of("Philippians 3:17 - Brethren, be followers together of me, and mark them which walk so as ye have us for an ensample.","2 Thessalonians 3:9 - Not because we have not power, but to make ourselves an ensample unto you to follow us.","2 Peter 2:6 - And turning the cities of Sodom and Gomorrha into ashes condemned them with an overthrow, making them an ensample unto those that after should live ungodly;")));
		wordMap.put("Ensign(s)", new KjvEntity("Ensign(s)","a signal, sign, emblem, flag",List.of("Isaiah 11:10 - And in that day there shall be a root of Jesse, which shall stand for an ensign of the people; to it shall the Gentiles seek: and his rest shall be glorious.","Isaiah 11:12 - And he shall set up an ensign for the nations, and shall assemble the outcasts of Israel, and gather together the dispersed of Judah from the four corners of the earth.","Isaiah 18:3 - All ye inhabitants of the world, and dwellers on the earth, see ye, when he lifteth up an ensign on the mountains; and when he bloweth a trumpet, hear ye.")));
		wordMap.put("Ephah", new KjvEntity("Ephah","about 8 gallons",List.of("Exodus 16:36 - Now an omer is the tenth part of an ephah.","Ezekiel 45:24 - And he shall prepare a meat offering of an ephah for a bullock, and an ephah for a ram, and an hin of oil for an ephah.","Ruth 2:17 - So she gleaned in the field until even, and beat out that she had gleaned: and it was about an ephah of barley.")));
		
		wordMap.put("Ephod", new KjvEntity("Ephod","cape worn by priests",List.of("Exodus 28:4 - And these are the garments which they shall make; a breastplate, and an ephod, and a robe, and a broidered coat, a mitre, and a girdle: and they shall make holy garments for Aaron thy brother, and his sons, that he may minister unto me in the priest's office.","1 Samuel 2:18 - But Samuel ministered before the LORD, being a child, girded with a linen ephod.","1 Samuel 30:7 - And David said to Abiathar the priest, Ahimelech's son, I pray thee, bring me hither the ephod. And Abiathar brought thither the ephod to David.")));
		wordMap.put("Epistle(s)", new KjvEntity("Epistle(s)","A sent letter",List.of("2 Corinthians 3:2 - Ye are our epistle written in our hearts, known and read of all men:","Colossians 4:16 - And when this epistle is read among you, cause that it be read also in the church of the Laodiceans; and that ye likewise read the epistle from Laodicea.","1 Thessalonians 5:27 - I charge you by the Lord that this epistle be read unto all the holy brethren.")));
		wordMap.put("Ere", new KjvEntity("Ere","before or until",List.of("Hosea 8:5 - Thy calf, O Samaria, hath cast thee off; mine anger is kindled against them: how long will it be ere they attain to innocency?","Jeremiah 47:6 - O thou sword of the LORD, how long will it be ere thou be quiet? put up thyself into thy scabbard, rest, and be still.","John 4:49 - The nobleman saith unto him, Sir, come down ere my child die.")));
		wordMap.put("Eschew(ed)(eth)", new KjvEntity("Eschew(ed)(eth)","to shun, avoid, abstain from",List.of("1 Peter 3:11 - Let him eschew evil, and do good; let him seek peace, and ensue it.","Job 1:1 - There was a man in the land of Uz, whose name was Job; and that man was perfect and upright, and one that feared God, and eschewed evil.","Job 1:8 - And the LORD said unto Satan, Hast thou considered my servant Job, that there is none like him in the earth, a perfect and an upright man, one that feareth God, and escheweth evil?")));
		wordMap.put("Espoused(als)", new KjvEntity("Espoused(als)","betrothed; engaged; legally married but not consumated",List.of("Matthew 1:18 - Now the birth of Jesus Christ was on this wise: When as his mother Mary was espoused to Joseph, before they came together, she was found with child of the Holy Ghost.","Luke 1:27 - To a virgin espoused to a man whose name was Joseph, of the house of David; and the virgin's name was Mary.","2 Corinthians 11:2 - For I am jealous over you with godly jealousy: for I have espoused you to one husband, that I may present you as a chaste virgin to Christ.")));
		wordMap.put("Execration", new KjvEntity("Execration","a curse, detestation",List.of("Jeremiah 42:18 - For thus saith the LORD of hosts, the God of Israel; As mine anger and my fury hath been poured forth upon the inhabitants of Jerusalem; so shall my fury be poured forth upon you, when ye shall enter into Egypt: and ye shall be an execration, and an astonishment, and a curse, and a reproach...","Jeremiah 44:12 - And I will take the remnant of Judah, that have set their faces to go into the land of Egypt... and they shall be an execration, and an astonishment, and a curse, and a reproach...")));
		wordMap.put("Fain", new KjvEntity("Fain","gladly, willingly",List.of("Job 27:22 - For God shall cast upon him, and not spare: he would fain flee out of his hand.","Luke 15:16 - And he would fain have filled his belly with the husks that the swine did eat: and no man gave unto him.")));
		wordMap.put("Fairs", new KjvEntity("Fairs","A gathering of buyers and sellers",List.of("Ezekiel 27:12 - Tarshish was thy merchant by reason of the multitude of all kind of riches; with silver, iron, tin, and lead, they traded in thy fairs.","Ezekiel 27:14 - They of the house of Togarmah traded in thy fairs with horses and horsemen and mules.","Ezekiel 27:16 - Syria was thy merchant by reason of the multitude of the wares of thy making: they occupied in thy fairs with emeralds, purple, and broidered work, and fine linen, and coral, and agate.")));
		
		wordMap.put("Farthing(s)", new KjvEntity("Farthing(s)",
			    "a fourth part of a penny",
			    List.of(
			        "Matthew 5:26 - Verily I say unto thee, Thou shalt by no means come out thence, till thou hast paid the uttermost farthing.",
			        "Matthew 10:29 - Are not two sparrows sold for a farthing? and one of them shall not fall on the ground without your Father.",
			        "Mark 12:42 - And there came a certain poor widow, and she threw in two mites, which make a farthing."
			    )
			));

			wordMap.put("Fetters", new KjvEntity("Fetters","A metal band used to confine the feet",List.of("Judges 16:21 - But the Philistines took him, and put out his eyes, and brought him down to Gaza, and bound him with fetters of brass; and he did grind in the prison house.","Psalms 105:18 - Whose feet they hurt with fetters: he was laid in iron:","Mark 5:4 - Because that he had been often bound with fetters and chains, and the chains had been plucked asunder by him, and the fetters broken in pieces: neither could any man tame him.")));

			wordMap.put("Fillet(s)(ed)", new KjvEntity(
			    "Fillet(s)(ed)",
			    "an ornamental narrow band",
			    List.of(
			        "Exodus 27:10 - And the twenty pillars thereof and their twenty sockets shall be of brass; the hooks of the pillars and their fillets shall be of silver.",
			        "Exodus 38:17 - And the sockets for the pillars were of brass; the hooks of the pillars and their fillets of silver...",
			        "Jeremiah 52:21 - And concerning the pillars, the height of one pillar was eighteen cubits; and a fillet of twelve cubits did compass it; and the thickness thereof was four fingers: it was hollow."
			    )
			));

			wordMap.put("Firmament", new KjvEntity(
			    "Firmament",
			    "great expanse, heavens",
			    List.of(
			        "Genesis 1:7 - And God made the firmament, and divided the waters which were under the firmament from the waters which were above the firmament: and it was so.",
			        "Genesis 1:8 - And God called the firmament Heaven. And the evening and the morning were the second day.",
			        "Psalms 19:1 - The heavens declare the glory of God; and the firmament sheweth his handywork."
			    )
			));

			wordMap.put("Fitches", new KjvEntity(
			    "Fitches",
			    "an herb",
			    List.of(
			        "Isaiah 28:25 - When he hath made plain the face thereof, doth he not cast abroad the fitches, and scatter the cummin, and cast in the principal wheat and the appointed barley and the rie in their place?",
			        "Isaiah 28:27 - For the fitches are not threshed with a threshing instrument, neither is a cart wheel turned about upon the cummin; but the fitches are beaten out with a staff, and the cummin with a rod.",
			        "Ezekiel 4:9 - Take thou also unto thee wheat, and barley, and beans, and lentiles, and millet, and fitches, and put them in one vessel, and make thee bread thereof, according to the number of the days that thou shalt lie upon thy side, three hundred and ninety days shalt thou eat thereof."
			    )
			));

			wordMap.put("Flag(s)", new KjvEntity(
			    "Flag(s)",
			    "an aquatic plant like a reed",
			    List.of(
			        "Exodus 2:3 - And when she could not longer hide him, she took for him an ark of bulrushes, and daubed it with slime and with pitch, and put the child therein; and she laid it in the flags by the river's brink.",
			        "Exodus 2:5 - And the daughter of Pharaoh came down to wash herself at the river; and her maidens walked along by the river's side; and when she saw the ark among the flags, she sent her maid to fetch it.",
			        "Job 8:11 - Can the rush grow up without mire? can the flag grow without water?"
			    )
			));

			wordMap.put("Flagon(s)", new KjvEntity(
			    "Flagon(s)",
			    "a small container for holding liquids",
			    List.of(
			        "2 Samuel 6:19 - And he dealt among all the people... to every one a cake of bread, and a good piece of flesh, and a flagon of wine.",
			        "1 Chronicles 16:3 - And he dealt to every one of Israel, both man and woman, to every one a loaf of bread, and a good piece of flesh, and a flagon of wine.",
			        "Song of Solomon 2:5 - Stay me with flagons, comfort me with apples: for I am sick of love."
			    )
			));

			wordMap.put("Fray", new KjvEntity(
			    "Fray",
			    "to frighten",
			    List.of(
			        "Deuteronomy 28:26 - And thy carcase shall be meat unto all fowls of the air, and unto the beasts of the earth, and no man shall fray them away.",
			        "Zechariah 1:21 - Then said I, What come these to do? And he spake, saying, These are the horns which have scattered Judah, so that no man did lift up his head: but these are come to fray them, to cast out the horns of the Gentiles, which lifted up their horn over the land of Judah to scatter it.",
			        "Jeremiah 7:33 - And the carcases of this people shall be meat for the fowls of the heaven, and for the beasts of the earth; and none shall fray them away."
			    )
			));
			
			
			
			
			
			
			
			wordMap.put("Frontlets", new KjvEntity(
				    "Frontlets",
				    "something worn on the forehead",
				    List.of(
				        "Exodus 13:16 - And it shall be for a token upon thine hand, and for frontlets between thine eyes: for by strength of hand the LORD brought us forth out of Egypt.",
				        "Deuteronomy 6:8 - And thou shalt bind them for a sign upon thine hand, and they shall be as frontlets between thine eyes.",
				        "Deuteronomy 11:18 - Therefore shall ye lay up these my words in your heart and in your soul, and bind them for a sign upon your hand, that they may be as frontlets between your eyes."
				    )
				));

				wordMap.put("Froward(ly)(ness)", new KjvEntity(
				    "Froward(ly)(ness)",
				    "stubborn, perverse, turned away from",
				    List.of(
				        "Proverbs 2:12 - To deliver thee from the way of the evil man, from the man that speaketh froward things;",
				        "Proverbs 8:13 - The fear of the LORD is to hate evil: pride, and arrogancy, and the evil way, and the froward mouth, do I hate.",
				        "Psalms 18:26 - With the pure thou wilt shew thyself pure; and with the froward thou wilt shew thyself froward."
				    )
				));

				wordMap.put("Furlongs", new KjvEntity(
				    "Furlong",
				    "220 yards",
				    List.of(
				        "Luke 24:13 - And, behold, two of them went that same day to a village called Emmaus, which was from Jerusalem about threescore furlongs.",
				        "John 11:18 - Now Bethany was nigh unto Jerusalem, about fifteen furlongs off:",
				        "Revelation 14:20 - And the winepress was trodden without the city, and blood came out of the winepress, even unto the horse bridles, by the space of a thousand and six hundred furlongs."
				    )
				));

				wordMap.put("Girdle(s)", new KjvEntity(
				    "Girdle(s)",
				    "belt",
				    List.of(
				        "Exodus 28:4 - And these are the garments which they shall make; a breastplate, and an ephod, and a robe, and a broidered coat, a mitre, and a girdle; and they shall make holy garments for Aaron thy brother, and his sons, that he may minister unto me in the priest's office.",
				        "Isaiah 11:5 - And righteousness shall be the girdle of his loins, and faithfulness the girdle of his reins.",
				        "Jeremiah 13:2 - So I got a girdle according to the word of the LORD, and put it on my loins."
				    )
				));

				wordMap.put("Garner(s)", new KjvEntity(
				    "Garner(s)",
				    "a storehouse for grain, barn",
				    List.of(
				        "Matthew 3:12 - Whose fan is in his hand, and he will throughly purge his floor, and gather his wheat into the garner; but he will burn up the chaff with unquenchable fire.",
				        "Luke 3:17 - Whose fan is in his hand, and he will throughly purge his floor, and will gather the wheat into his garner; but the chaff he will burn with fire unquenchable.",
				        "Joel 1:17 - The seed is rotten under their clods, the garners are laid desolate, the barns are broken down; for the corn is withered."
				    )
				));

				wordMap.put("Glass", new KjvEntity(
				    "Glass",
				    "a mirror",
				    List.of(
				        "1 Corinthians 13:12 - For now we see through a glass, darkly; but then face to face: now I know in part; but then shall I know even as also I am known.",
				        "2 Corinthians 3:18 - But we all, with open face beholding as in a glass the glory of the Lord, are changed into the same image from glory to glory, even as by the Spirit of the Lord.",
				        "James 1:23 - For if any be a hearer of the word, and not a doer, he is like unto a man beholding his natural face in a glass:"
				    )
				));

				wordMap.put("Goodman", new KjvEntity(
				    "Goodman",
				    "the male head of the household",
				    List.of(
				        "Proverbs 7:19 - For the goodman is not at home, he is gone a long journey:",
				        "Matthew 20:11 - And when they had received it, they murmured against the goodman of the house,",
				        "Luke 12:39 - And this know, that if the goodman of the house had known what hour the thief would come, he would have watched, and not have suffered his house to be broken through."
				    )
				));

				wordMap.put("Grisled", new KjvEntity(
				    "Grisled",
				    "gray colored",
				    List.of(
				        "Genesis 31:10 - And it came to pass at the time that the cattle conceived, that I lifted up mine eyes, and saw in a dream, and, behold, the rams which leaped upon the cattle were ringstraked, speckled, and grisled.",
				        "Genesis 31:12 - And he said, Lift up now thine eyes, and see, all the rams which leap upon the cattle are ringstraked, speckled, and grisled: for I have seen all that Laban doeth unto thee.",
				        "Zechariah 6:3 - And in the third chariot white horses; and in the fourth chariot grisled and bay horses."
				    )
				));
				
				
				
				
				
				wordMap.put("Habergeon(s)", new KjvEntity(
					    "Habergeon(s)",
					    "a sleeveless coat of armor",
					    List.of(
					        "Exodus 28:32 - And there shall be an hole in the top of it, in the midst thereof: it shall have a binding of woven work round about the hole of it, as it were the hole of an habergeon, that it be not rent.",
					        "Exodus 39:23 - And there was an hole in the midst of the robe, as the hole of an habergeon, with a band round about the hole, that it should not rend.",
					        "2 Chronicles 26:14 - And Uzziah prepared for them throughout all the host shields, and spears, and helmets, and habergeons, and bows, and slings to cast stones."
					    )
					));

					wordMap.put("Hallow(ed)", new KjvEntity(
					    "Hallow(ed)",
					    "to make holy",
					    List.of(
					        "Exodus 20:11 - For in six days the LORD made heaven and earth, the sea, and all that in them is, and rested the seventh day: wherefore the LORD blessed the sabbath day, and hallowed it.",
					        "Leviticus 22:32 - Neither shall ye profane my holy name; but I will be hallowed among the children of Israel: I am the LORD which hallow you.",
					        "Matthew 6:9 - After this manner therefore pray ye: Our Father which art in heaven, Hallowed be thy name."
					    )
					));

					wordMap.put("Halt(ed)(eth)", new KjvEntity(
					    "Halt(ed)(eth)",
					    "lame; hesitate; fall",
					    List.of(
					        "1 Kings 18:21 - And Elijah came unto all the people, and said, How long halt ye between two opinions? if the LORD be God, follow him: but if Baal, then follow him. And the people answered him not a word.",
					        "Micah 4:6 - In that day, saith the LORD, will I assemble her that halteth, and I will gather her that is driven out, and her that I have afflicted;",
					        "Luke 14:21 - So that servant came, and shewed his lord these things. Then the master of the house being angry said to his servant, Go out quickly into the streets and lanes of the city, and bring in hither the poor, and the maimed, and the halt, and the blind."
					    )
					));

					wordMap.put("Handmaid(s)(en)(ens)", new KjvEntity(
					    "Handmaid(s)(en)(ens)",
					    "a female servant",
					    List.of(
					        "Luke 1:38 - And Mary said, Behold the handmaid of the Lord; be it unto me according to thy word. And the angel departed from her.",
					        "Psalms 123:2 - Behold, as the eyes of servants look unto the hand of their masters, and as the eyes of a maiden unto the hand of her mistress; so our eyes wait upon the LORD our God, until that he have mercy upon us.",
					        "Ruth 3:9 - And he said, Who art thou? And she answered, I am Ruth thine handmaid: spread therefore thy skirt over thine handmaid; for thou art a near kinsman."
					    )
					));

					wordMap.put("Haply (hap)", new KjvEntity(
					    "Haply (hap)",
					    "by chance",
					    List.of(
					        "Luke 14:29 - Lest haply, after he hath laid the foundation, and is not able to finish it, all that behold it begin to mock him,",
					        "Acts 5:39 - But if it be of God, ye cannot overthrow it; lest haply ye be found even to fight against God.",
					        "Acts 17:27 - That they should seek the Lord, if haply they might feel after him, and find him, though he be not far from every one of us:"
					    )
					));

					wordMap.put("Hart(s)", new KjvEntity(
					    "Hart(s)",
					    "a male deer",
					    List.of(
					        "Psalms 42:1 - As the hart panteth after the water brooks, so panteth my soul after thee, O God.",
					        "Song of Solomon 2:9 - My beloved is like a roe or a young hart: behold, he standeth behind our wall, he looketh forth at the windows, shewing himself through the lattice.",
					        "Isaiah 35:6 - Then shall the lame man leap as an hart, and the tongue of the dumb sing: for in the wilderness shall waters break out, and streams in the desert."
					    )
					));

					wordMap.put("Haunt", new KjvEntity(
					    "Haunt",
					    "place of frequent abode",
					    List.of(
					        "1 Samuel 23:22 - Go, I pray you, prepare yet, and know and see his place where his haunt is, and who hath seen him there: for it is told me that he dealeth very subtilly.","Ezekiel 26:17 - And they shall take up a lamentation for thee, and say to thee, How art thou destroyed, that wast inhabited of seafaring men, the renowned city, which wast strong in the sea, she and her inhabitants, which cause their terror to be on all that haunt it!","1 Samuel 30:31 - And to them which were in Hebron, and to all the places where David himself and his men were wont to haunt.")));

					wordMap.put("Heath", new KjvEntity(
					    "Heath",
					    "open uncultivated land",
					    List.of(
					        "Jeremiah 17:6 - For he shall be like the heath in the desert, and shall not see when good cometh; but shall inhabit the parched places in the wilderness, in a salt land and not inhabited.",
					        "Jeremiah 48:6 - Flee, save your lives, and be like the heath in the wilderness."    )
					));

					wordMap.put("Hin", new KjvEntity(
					    "Hin",
					    "about 1.5 gallons",
					    List.of(
					        "Exodus 29:40 - And with the one lamb a tenth deal of flour mingled with the fourth part of an hin of beaten oil; and the fourth part of an hin of wine for a drink offering.",
					        "Leviticus 19:36 - Just balances, just weights, a just ephah, and a just hin, shall ye have: I am the LORD your God, which brought you out of the land of Egypt.",
					        "Numbers 15:5 - And the fourth part of an hin of wine for a drink offering shalt thou prepare with the burnt offering or sacrifice, for one lamb."
					    )
					));

					wordMap.put("Hind(s)", new KjvEntity(
					    "Hind(s)",
					    "a female deer",
					    List.of(
					        "Genesis 49:21 - Naphtali is a hind let loose: he giveth goodly words.",
					        "Psalms 18:33 - He maketh my feet like hinds' feet, and setteth me upon my high places.",
					        "Habakkuk 3:19 - The LORD God is my strength, and he will make my feet like hinds' feet, and he will make me to walk upon mine high places. To the chief singer on my stringed instruments."
					    )
					));

					wordMap.put("Hither(to)", new KjvEntity(
					    "Hither(to)",
					    "here, to or towards, until now",
					    List.of(
						"Matthew 14:18 - He said, Bring them hither to me.",
					        "Job 38:11 - And said, Hitherto shalt thou come, but no further: and here shall thy proud waves be stayed?",
					        "John 5:17 - But Jesus answered them, My Father worketh hitherto, and I work."
					    )
					));

					wordMap.put("Hoar(y)", new KjvEntity(
					    "Hoar(y)",
					    "gray or white with age",
					    List.of(
					        "1 Kings 2:6 - Do therefore according to thy wisdom, and let not his hoar head go down to the grave in peace.",
					        "Isaiah 46:4 - And even to your old age I am he; and even to hoar hairs will I carry you: I have made, and I will bear; even I will carry, and will deliver you.",
					        "Proverbs 16:31 - The hoary head is a crown of glory, if it be found in the way of righteousness."
					    )
					));
		
		
					wordMap.put("Impudent", new KjvEntity(
						    "Impudent",
						    "shameless",
						    List.of(
						        "Ezekiel 2:4 - For they are impudent children and stiffhearted. I do send thee unto them; and thou shalt say unto them, Thus saith the Lord GOD.",
						        "Proverbs 7:13 - So she caught him, and kissed him, and with an impudent face said unto him,",
						        "Ezekiel 3:7 - But the house of Israel will not hearken unto thee; for they will not hearken unto me: for all the house of Israel are impudent and hardhearted."
						    )
						));

						wordMap.put("Infamy", new KjvEntity(
						    "Infamy",
						    "disgrace",
						    List.of(
						        "Proverbs 25:10 - Lest he that heareth it put thee to shame, and thine infamy turn not away.",
						        "Ezekiel 36:3 - Therefore prophesy and say, Thus saith the Lord GOD; Because they have made you desolate, and swallowed you up on every side, that ye might be a possession unto the residue of the heathen, and ye are taken up in the lips of talkers, and are an infamy of the people:"
						    )
						));

						wordMap.put("Infidel", new KjvEntity(
						    "Infidel",
						    "one who is unfaithful or unbelieving",
						    List.of(
						        "1 Timothy 5:8 - But if any provide not for his own, and specially for those of his own house, he hath denied the faith, and is worse than an infidel.",
						        "2 Corinthians 6:15 - And what concord hath Christ with Belial? or what part hath he that believeth with an infidel?"
						    )
						));

						wordMap.put("Instant(ly)", new KjvEntity(
						    "Instant(ly)",
						    "persistent, moment",
						    List.of(
						        "Luke 7:4 - And when they came to Jesus, they besought him instantly, saying, That he was worthy for whom he should do this:",
						        "Romans 12:12 - Rejoicing in hope; patient in tribulation; continuing instant in prayer;",
						        "2 Timothy 4:2 - Preach the word; be instant in season, out of season; reprove, rebuke, exhort with all longsuffering and doctrine."
						    )
						));

						wordMap.put("Jewry", new KjvEntity(
						    "Jewry",
						    "Judaea",
						    List.of(
						        "Daniel 5:13 - Then was Daniel brought in before the king. And the king spake and said unto Daniel, Art thou that Daniel, which art of the children of the captivity of Judah, whom the king my father brought out of Jewry?",
						        "Luke 23:5 - And they were the more fierce, saying, He stirreth up the people, teaching throughout all Jewry, beginning from Galilee to this place.",
						        "John 7:1 - After these things Jesus walked in Galilee: for he would not walk in Jewry, because the Jews sought to kill him."
						    )
						));

						wordMap.put("Kerchiefs", new KjvEntity(
						    "Kerchiefs",
						    "a cloth used to cover the heads of women; veil",
						    List.of(
						        "Ezekiel 13:18 - And say, Thus saith the Lord GOD; Woe to the women that sew pillows to all armholes, and make kerchiefs upon the head of every stature to hunt souls!",
						        "Ezekiel 13:21 - Your kerchiefs also will I tear, and deliver my people out of your hand, and they shall be no more in your hand to be hunted..."
						    )
						));

						wordMap.put("Kine", new KjvEntity(
						    "Kine",
						    "cows",
						    List.of(
						        "Genesis 41:2 - And, behold, there came up out of the river seven well favoured kine and fatfleshed; and they fed in a meadow.",
						        "1 Samuel 6:7 - Now therefore make a new cart, and take two milch kine, on which there hath come no yoke, and tie the kine to the cart, and bring their calves home from them:",
						        "Amos 4:1 - Hear this word, ye kine of Bashan, that are in the mountain of Samaria, which oppress the poor, which crush the needy, which say to their masters, Bring, and let us drink."
						    )
						));

						wordMap.put("Knop(s)", new KjvEntity(
						    "Knop(s)",
						    "knob; anything that protrudes",
						    List.of(
						        "Exodus 25:31 - And thou shalt make a candlestick of pure gold... his knops, and his flowers, shall be of the same.",
						        "Exodus 25:34 - And in the candlestick shall be four bowls made like unto almonds, with their knops and their flowers.",
						        "Exodus 25:33 - Three bowls made like unto almonds, with a knop and a flower in one branch; and three bowls made like almonds in the other branch, with a knop and a flower: so in the six branches that come out of the candlestick."
						    )
						));

						wordMap.put("Lapwing", new KjvEntity(
						    "Lapwing",
						    "an awkward flying bird",
						    List.of(
						        "Leviticus 11:19 - And the stork, the heron after her kind, and the lapwing, and the bat.",
						        "Deuteronomy 14:18 - And the stork, and the heron after her kind, and the lapwing, and the bat."
						    )
						));

						wordMap.put("Lasciviousness", new KjvEntity(
						    "Lasciviousness",
						    "unrestrained sexual lust",
						    List.of(
						        "Mark 7:22 - Thefts, covetousness, wickedness, deceit, lasciviousness, an evil eye, blasphemy, pride, foolishness:",
						        "Ephesians 4:19 - Who being past feeling have given themselves over unto lasciviousness, to work all uncleanness with greediness.",
						        "Galatians 5:19 - Now the works of the flesh are manifest, which are these; Adultery, fornication, uncleanness, lasciviousness,"
						    )
						));

						wordMap.put("Latchet", new KjvEntity(
						    "Latchet",
						    "shoelace",
						    List.of(
						        "Mark 1:7 - And preached, saying, There cometh one mightier than I after me, the latchet of whose shoes I am not worthy to stoop down and unloose.",
						        "Luke 3:16 - John answered, saying unto them all, I indeed baptize you with water; but one mightier than I cometh, the latchet of whose shoes I am not worthy to unloose: he shall baptize you with the Holy Ghost and with fire:",
						        "John 1:27 - He it is, who coming after me is preferred before me, whose shoe's latchet I am not worthy to unloose."
						    )
						));

						wordMap.put("Laver(s)", new KjvEntity(
						    "Laver(s)",
						    "a wash basin",
						    List.of(
						        "Exodus 30:18 - Thou shalt also make a laver of brass, and his foot also of brass, to wash withal: and thou shalt put it between the tabernacle of the congregation and the altar, and thou shalt put water therein.",
						        "Exodus 40:30 - And he set the laver between the tent of the congregation and the altar, and put water there, to wash withal.",
						        "1 Kings 7:38 - Then made he ten lavers of brass: one laver contained forty baths: and every laver was four cubits: and upon every one of the ten bases one laver."
						    )
						));

						wordMap.put("Leasing", new KjvEntity(
						    "Leasing",
						    "deceit",
						    List.of(
						        "Psalms 4:2 - O ye sons of men, how long will ye turn my glory into shame? how long will ye love vanity, and seek after leasing? Selah.",
						        "Psalms 5:6 - Thou shalt destroy them that speak leasing: the LORD will abhor the bloody and deceitful man."
						    )
						));

						wordMap.put("Leaven", new KjvEntity(
						    "Leaven",
						    "yeast, fermented bread dough",
						    List.of(
						        "Matthew 16:6 - Then Jesus said unto them, Take heed and beware of the leaven of the Pharisees and of the Sadducees.",
						        "Luke 12:1 - In the mean time, when there were gathered together an innumerable multitude of people... Beware ye of the leaven of the Pharisees, which is hypocrisy.",
						        "1 Corinthians 5:6 - Your glorying is not good. Know ye not that a little leaven leaveneth the whole lump?"
						    )
						));
		
		
						wordMap.put("Lees", new KjvEntity("Lees", "the sediment from a liquid; the worst part of something",
							    List.of(
							        "Isaiah 25:6 - And in this mountain shall the LORD of hosts make unto all people a feast of fat things, a feast of wines on the lees, of fat things full of marrow, of wines on the lees well refined.",
							        "Jeremiah 48:11 - Moab hath been at ease from his youth, and he hath settled on his lees, and hath not been emptied from vessel to vessel, neither hath he gone into captivity: therefore his taste remained in him, and his scent is not changed.",
							        "Zephaniah 1:12 - And it shall come to pass at that time, that I will search Jerusalem with candles, and punish the men that are settled on their lees: that say in their heart, The LORD will not do good, neither will he do evil."
							    )));

							wordMap.put("Legion", new KjvEntity("Legion", "three to five thousand",
							    List.of(
							        "Mark 5:15 - And they come to Jesus, and see him that was possessed with the devil, and had the legion, sitting, and clothed, and in his right mind: and they were afraid.",
							        "Mark 5:9 - And he asked him, What is thy name? And he answered, saying, My name is Legion: for we are many.",
							        "Luke 8:30 - And Jesus asked him, saying, What is thy name? And he said, Legion: because many devils were entered into him."
							    )));

							wordMap.put("Let(teth)", new KjvEntity("Let(teth)", "to hinder, prevent, or obstruct",
							    List.of(
							        "Proverbs 17:14 - The beginning of strife is as when one letteth out water: therefore leave off contention, before it be meddled with.",
							        "2 Thessalonians 2:7 - For the mystery of iniquity doth already work: only he who now letteth will let, until he be taken out of the way.",
							        "2 Kings 10:24 - And when they went in to offer sacrifices and burnt offerings, Jehu appointed fourscore men without, and said, If any of the men whom I have brought into your hands escape, he that letteth him go, his life shall be for the life of him."
							    )));

							wordMap.put("Listed(eth)", new KjvEntity("Listed(eth)", "pleases, desires",
							    List.of(
							        "Mark 9:13 - But I say unto you, That Elias is indeed come, and they have done unto him whatsoever they listed, as it is written of him.",
							        "Matthew 17:12 - But I say unto you, That Elias is come already, and they knew him not, but have done unto him whatsoever they listed. Likewise shall also the Son of man suffer of them.",
							        "James 3:4 - Behold also the ships, which though they be so great, and are driven of fierce winds, yet are they turned about with a very small helm, whithersoever the governor listeth."
							    )));

							wordMap.put("Lucre", new KjvEntity("Lucre", "dishonorable or unlawful gain",
							    List.of(
							        "1 Timothy 3:3 - Not given to wine, no striker, not greedy of filthy lucre; but patient, not a brawler, not covetous;",
							        "Titus 1:11 - Whose mouths must be stopped... teaching things which they ought not, for filthy lucre's sake.",
							        "1 Peter 5:2 - Feed the flock of God which is among you... not for filthy lucre, but of a ready mind."
							    )));

							wordMap.put("Mail", new KjvEntity("Mail", "body armor of overlapping plates",
							    List.of(
							        "1 Samuel 17:5 - And he had an helmet of brass upon his head, and he was armed with a coat of mail; and the weight of the coat was five thousand shekels of brass.",
							        "1 Samuel 17:38 - And Saul armed David with his armour... and he put a coat of mail upon him."    )));

							wordMap.put("Mammon", new KjvEntity("Mammon", "a term of reproach for material wealth",
							    List.of(
							        "Matthew 6:24 - No man can serve two masters... Ye cannot serve God and mammon.",
							        "Luke 16:9 - And I say unto you, Make to yourselves friends of the mammon of unrighteousness; that, when ye fail, they may receive you into everlasting habitations.",
							        "Luke 16:13 - No servant can serve two masters... Ye cannot serve God and mammon."
							    )));

							wordMap.put("Mandrakes", new KjvEntity("Mandrakes", "a plant that has narcotic properties and is used as an aphrodisiac",
							    List.of(
							        "Genesis 30:14 - And Reuben went in the days of wheat harvest, and found mandrakes in the field, and brought them unto his mother Leah. Then Rachel said to Leah, Give me, I pray thee, of thy son's mandrakes.",
							        "Genesis 30:15 - And she said unto her, Is it a small matter that thou hast taken my husband? and wouldest thou take away my son's mandrakes also?",
							        "Song of Solomon 7:13 - The mandrakes give a smell, and at our gates are all manner of pleasant fruits, new and old, which I have laid up for thee, O my beloved."
							    )));

							wordMap.put("Mantle", new KjvEntity("Mantle", "a loose sleeveless cloak",
							    List.of(
							        "1 Kings 19:13 - And it was so, when Elijah heard it, that he wrapped his face in his mantle, and went out, and stood in the entering in of the cave. And, behold, there came a voice unto him, and said, What doest thou here, Elijah?",
							        "1 Kings 19:19 - So he departed thence, and found Elisha... and Elijah passed by him, and cast his mantle upon him.",
							        "2 Kings 2:13 - He took up also the mantle of Elijah that fell from him, and went back, and stood by the bank of Jordan;"
							    )));

							wordMap.put("Matrix", new KjvEntity("Matrix", "the womb",
							    List.of(
							        "Exodus 13:12 - That thou shalt set apart unto the LORD all that openeth the matrix, and every firstling that cometh of a beast which thou hast; the males shall be the LORD'S.",
							        "Exodus 13:15 - And it came to pass, when Pharaoh would hardly let us go, that the LORD slew all the firstborn in the land of Egypt, both the firstborn of man, and the firstborn of beast: therefore I sacrifice to the LORD all that openeth the matrix, being males; but all the firstborn of my children I redeem.",
							        "Numbers 18:15 - Every thing that openeth the matrix in all flesh... shall be thine."
							    )));

							wordMap.put("Mean", new KjvEntity("Mean", "common",
							    List.of(
							        "Isaiah 5:15 - And the mean man shall be brought down, and the mighty man shall be humbled, and the eyes of the lofty shall be humbled:",
							        "Isaiah 31:8 - Her priests have violated my law... and have put no difference between the holy and profane...Then shall the Assyrian fall with the sword, not of a mighty man; and the sword, not of a mean man, shall devour him: but he shall flee from the sword, and his young men shall be discomfited.",
							        "Acts 21:39 - But Paul said, I am a man which am a Jew of Tarsus, a city in Cilicia, a citizen of no mean city: and, I beseech thee, suffer me to speak unto the people."
							    )));
							
							
							wordMap.put("Meat(s)", new KjvEntity("Meat(s)", "food of any kind",
								    List.of(
								        "Genesis 1:29 - And God said, Behold, I have given you every herb bearing seed, which is upon the face of all the earth, and every tree, in the which is the fruit of a tree yielding seed; to you it shall be for meat.",
								        "Matthew 6:25 - Therefore I say unto you, Take no thought for your life, what ye shall eat, or what ye shall drink; nor yet for your body, what ye shall put on. Is not the life more than meat, and the body than raiment?",
								        "John 4:34 - Jesus saith unto them, My meat is to do the will of him that sent me, and to finish his work."
								    )));

								wordMap.put("Meet", new KjvEntity("Meet", "proper, suitable",
								    List.of(
								        "Matthew 3:8 - Bring forth therefore fruits meet for repentance:",
								        "Colossians 1:12 - Giving thanks unto the Father, which hath made us meet to be partakers of the inheritance of the saints in light:",
								        "2 Timothy 2:21 - If a man therefore purge himself from these, he shall be a vessel unto honour, sanctified, and meet for the master's use, and prepared unto every good work."
								    )));

								wordMap.put("Mete(d)", new KjvEntity("Mete(d)", "to allot, measure, or apportion",
								    List.of(
								        "Matthew 7:2 - For with what judgment ye judge, ye shall be judged: and with what measure ye mete, it shall be measured to you again.",
								        "Mark 4:24 - And he said unto them, Take heed what ye hear: with what measure ye mete, it shall be measured to you: and unto you that hear shall more be given.",
								        "Luke 6:38 - Give, and it shall be given unto you; good measure, pressed down, and shaken together, and running over, shall men give into your bosom. For with the same measure that ye mete withal it shall be measured to you again."
								    )));

								wordMap.put("Milch", new KjvEntity("Milch", "an animal which gives milk",
								    List.of(
								        "Genesis 32:15 - Thirty milch camels with their colts, forty kine, and ten bulls, twenty she asses, and ten foals.",
								        "1 Samuel 6:7 - Now therefore make a new cart, and take two milch kine, on which there hath come no yoke, and tie the kine to the cart, and bring their calves home from them:",
								        "1 Samuel 6:10 - And the men did so; and took two milch kine, and tied them to the cart, and shut up their calves at home:"
								    )));

								wordMap.put("Mite(s)", new KjvEntity("Mite(s)", "extremely small piece of money",
								    List.of(
								        "Luke 12:59 - I tell thee, thou shalt not depart thence, till thou hast paid the very last mite.",
								        "Mark 12:42 - And there came a certain poor widow, and she threw in two mites, which make a farthing.",
								        "Luke 21:2 - And he saw also a certain poor widow casting in thither two mites."
								    )));

								wordMap.put("Mitre", new KjvEntity("Mitre", "ceremonial religious headwear",
								    List.of(
								        "Exodus 28:4 - And these are the garments which they shall make; a breastplate, and an ephod, and a robe, and a broidered coat, a mitre, and a girdle: and they shall make holy garments for Aaron thy brother, and his sons, that he may minister unto me in the priest's office.",
								        "Exodus 29:6 - And thou shalt put the mitre upon his head, and put the holy crown upon the mitre.",
								        "Leviticus 8:9 - And he put the mitre upon his head; also upon the mitre, even upon his forefront, did he put the golden plate, the holy crown; as the LORD commanded Moses."
								    )));

								wordMap.put("Mote", new KjvEntity("Mote", "a tiny speck of foreign matter",
								    List.of(
								        "Matthew 7:3 - And why beholdest thou the mote that is in thy brother's eye, but considerest not the beam that is in thine own eye?",
								        "Matthew 7:4 - Or how wilt thou say to thy brother, Let me pull out the mote out of thine eye; and, behold, a beam is in thine own eye?",
								        "Luke 6:41 - And why beholdest thou the mote that is in thy brother's eye, but perceivest not the beam that is in thine own eye?"
								    )));

								wordMap.put("Nought", new KjvEntity("Nought", "worthless or nothing",
								    List.of(
								        "Malachi 1:10 - Who is there even among you that would shut the doors for nought? neither do ye kindle fire on mine altar for nought. I have no pleasure in you, saith the LORD of hosts, neither will I accept an offering at your hand.",
								        "Job 1:9 - Then Satan answered the LORD, and said, Doth Job fear God for nought?",
								        "Isaiah 41:24 - Behold, ye are of nothing, and your work of nought: an abomination is he that chooseth you."
								    )));
									
									wordMap.put("Naught", new KjvEntity("Naught", "worthless or nothing",
								    List.of(
								        "Proverbs 20:14 - It is naught, it is naught, saith the buyer: but when he is gone his way, then he boasteth.",
								        "2 Kings 2:19 - And the men of the city said unto Elisha, Behold, I pray thee, the situation of this city is pleasant, as my lord seeth: but the water is naught, and the ground barren."    )));

								wordMap.put("Nephew(s)", new KjvEntity("Nephew(s)", "a grandson or descendant",
								    List.of(
								        "Judges 12:14 - And he had forty sons and thirty nephews, that rode on threescore and ten ass colts: and he judged Israel eight years.",
								        "1 Timothy 5:4 - But if any widow have children or nephews, let them learn first to shew piety at home, and to requite their parents: for that is good and acceptable before God.",
								        "Job 18:19 - He shall neither have son nor nephew among his people, nor any remaining in his dwellings."
								    )));

								wordMap.put("Nether", new KjvEntity("Nether", "lower; beneath",
								    List.of(
								        "Exodus 19:17 - And Moses brought forth the people out of the camp to meet with God; and they stood at the nether part of the mount.",
								        "Joshua 15:19 - Who answered, Give me a blessing; for thou hast given me a south land; give me also springs of water. And he gave her the upper springs, and the nether springs.",
								        "Ezekiel 31:14 - To the end that none of all the trees by the waters exalt themselves for their height, neither shoot up their top among the thick boughs, neither their trees stand up in their height, all that drink water: for they are all delivered unto death, to the nether parts of the earth, in the midst of the children of men, with them that go down to the pit."
								    )));
								
								
								wordMap.put("Nitre", new KjvEntity("Nitre", "sodium carbonate, a cleansing agent",
									    List.of(
									        "Proverbs 25:20 - As he that taketh away a garment in cold weather, and as vinegar upon nitre, so is he that singeth songs to an heavy heart.",
									        "Jeremiah 2:22 - For though thou wash thee with nitre, and take thee much soap, yet thine iniquity is marked before me, saith the Lord GOD."
									    )));

									wordMap.put("Noisome", new KjvEntity("Noisome", "annoying or hurtful",
									    List.of(
									        "Psalms 91:3 - Surely he shall deliver thee from the snare of the fowler, and from the noisome pestilence.",
									        "Ezekiel 14:15 - If I cause noisome beasts to pass through the land, and they spoil it, so that it be desolate, that no man may pass through because of the beasts:",
									        "Revelation 16:2 - And the first went, and poured out his vial upon the earth; and there fell a noisome and grievous sore upon the men which had the mark of the beast, and upon them which worshipped his image."
									    )));

									wordMap.put("Obeisance", new KjvEntity("Obeisance", "an expression of respect or submission",
									    List.of(
									        "Genesis 37:7 - For, behold, we were binding sheaves in the field, and, lo, my sheaf arose, and also stood upright; and, behold, your sheaves stood round about, and made obeisance to my sheaf.",
									        "Genesis 37:9 - And he dreamed yet another dream, and told it his brethren, and said, Behold, I have dreamed a dream more; and, behold, the sun and the moon and the eleven stars made obeisance to me.",
									        "Genesis 43:28 - And they answered, Thy servant our father is in good health, he is yet alive. And they bowed down their heads, and made obeisance."
									    )));

									wordMap.put("Odious", new KjvEntity("Odious", "offensive, disgusting",
									    List.of(
									        "1 Chronicles 19:6 - And when the children of Ammon saw that they had made themselves odious to David, Hanun and the children of Ammon sent a thousand talents of silver to hire them chariots and horsemen out of Mesopotamia, and out of Syriamaachah, and out of Zobah.",
									        "Proverbs 30:23 - For an odious woman when she is married; and an handmaid that is heir to her mistress."    )));

									wordMap.put("Omer", new KjvEntity("Omer", "one tenth of an ephah, about 6.5 pints",
									    List.of(
									        "Exodus 16:16 - This is the thing which the LORD hath commanded, Gather of it every man according to his eating, an omer for every man, according to the number of your persons; take ye every man for them which are in his tents.",
									        "Exodus 16:18 - And when they did mete it with an omer, he that gathered much had nothing over, and he that gathered little had no lack; they gathered every man according to his eating.",
									        "Exodus 16:36 - Now an omer is the tenth part of an ephah."
									    )));

									wordMap.put("Oracle", new KjvEntity("Oracle", "someone regarded as an infallible guide; a place where divine revelation is obtained",
									    List.of(
									        "1 Kings 6:16 - And he built twenty cubits on the sides of the house, both the floor and the walls with boards of cedar: he even built them for it within, even for the oracle, even for the most holy place.",
									        "1 Kings 6:19 - And the oracle he prepared in the house within, to set there the ark of the covenant of the LORD.",
									        "2 Chronicles 4:20 - Moreover the candlesticks with their lamps, that they should burn after the manner before the oracle, of pure gold;"
									    )));

									wordMap.put("Ordain", new KjvEntity("Ordain", "to establish something via spiritual authority",
									    List.of(
									        "1 Corinthians 7:17 - But as God hath distributed to every man, as the Lord hath called every one, so let him walk. And so ordain I in all churches.",
									        "1 Chronicles 17:9 - Also I will ordain a place for my people Israel, and will plant them, and they shall dwell in their place, and shall be moved no more; neither shall the children of wickedness waste them any more, as at the beginning,",
									        "Titus 1:5 - For this cause left I thee in Crete, that thou shouldest set in order the things that are wanting, and ordain elders in every city, as I had appointed thee:"
									    )));

									wordMap.put("Ossifrage", new KjvEntity("Ossifrage", "a vulture",
									    List.of(
									        "Leviticus 11:13 - And these are they which ye shall have in abomination among the fowls; they shall not be eaten, they are an abomination: the eagle, and the ossifrage, and the ospray,",
									        "Deuteronomy 14:12 - But these are they of which ye shall not eat: the eagle, and the ossifrage, and the ospray,"
									    )));

									wordMap.put("Ouches", new KjvEntity("Ouches", "a socket or setting for a precious stone",
									    List.of(
									        "Exodus 28:11 - With the work of an engraver in stone, like the engravings of a signet, shalt thou engrave the two stones with the names of the children of Israel: thou shalt make them to be set in ouches of gold.",
									        "Exodus 28:13 - And thou shalt make ouches of gold;",
									        "Exodus 39:6 - And they wrought onyx stones inclosed in ouches of gold, graven, as signets are graven, with the names of the children of Israel."
									    )));

									wordMap.put("Palsy", new KjvEntity("Palsy", "paralysis",
									    List.of(
									        "Matthew 4:24 - And his fame went throughout all Syria: and they brought unto him all sick people that were taken with divers diseases and torments, and those which were possessed with devils, and those which were lunatick, and those that had the palsy; and he healed them.",
									        "Matthew 9:2 - And, behold, they brought to him a man sick of the palsy, lying on a bed: and Jesus seeing their faith said unto the sick of the palsy; Son, be of good cheer; thy sins be forgiven thee.",
									        "Mark 2:3 - And they come unto him, bringing one sick of the palsy, which was borne of four."
									    )));
									
									
									
									
									wordMap.put("Penny", new KjvEntity("Penny(Pence)(Pennyworth)", "Penny = daily wage of a Roman soldier; Pence = plural of penny; Pennyworth = how much a penny would buy",
										    List.of(
										        "Matthew 20:2 - And when he had agreed with the labourers for a penny a day, he sent them into his vineyard.",
										        "Mark 6:37 - He answered and said unto them, Give ye them to eat. And they say unto him, Shall we go and buy two hundred pennyworth of bread, and give them to eat?",
										        "Luke 20:24 - Shew me a penny. Whose image and superscription hath it? They answered and said, Caesar's."
										    )));
											
											wordMap.put("Pence", new KjvEntity("Penny(Pence)(Pennyworth)", "Penny = daily wage of a Roman soldier; Pence = plural of penny; Pennyworth = how much a penny would buy",
										    List.of(
										        "John 12:5 - Why was not this ointment sold for three hundred pence, and given to the poor?",
										        "Luke 7:41 - There was a certain creditor which had two debtors: the one owed five hundred pence, and the other fifty.",
										        "Mark 14:5 - For it might have been sold for more than three hundred pence, and have been given to the poor. And they murmured against her."
										    )));
											
											
												wordMap.put("Pennyworth", new KjvEntity("Penny(Pence)(Pennyworth)", "Penny = daily wage of a Roman soldier; Pence = plural of penny; Pennyworth = how much a penny would buy",
										    List.of(
										        "John 6:7 - Philip answered him, Two hundred pennyworth of bread is not sufficient for them, that every one of them may take a little.",
										        "Mark 6:37 - He answered and said unto them, Give ye them to eat. And they say unto him, Shall we go and buy two hundred pennyworth of bread, and give them to eat?"    )));
											

										wordMap.put("Poll", new KjvEntity("Poll(s)", "taking a head-count, or to make bald or round-headed",
										    List.of(
										        "Micah 1:16 - Make thee bald, and poll thee for thy delicate children; enlarge thy baldness as the eagle; for they are gone into captivity from thee.",
										        "Ezekiel 44:20 - Neither shall they shave their heads, nor suffer their locks to grow long; they shall only poll their heads.",
										        "Numbers 3:47 - Thou shalt even take five shekels apiece by the poll, after the shekel of the sanctuary shalt thou take them: (the shekel is twenty gerahs:)"
										    )));
											
											
										wordMap.put("Polls", new KjvEntity("Poll(s)", "taking a head-count, or to make bald or round-headed",
										    List.of(
										        "1 Chronicles 23:3 - Now the Levites were numbered from the age of thirty years and upward: and their number by their polls, man by man, was thirty and eight thousand.",
										        "Numbers 1:18 - And they assembled all the congregation together on the first day of the second month, and they declared their pedigrees after their families, by the house of their fathers, according to the number of the names, from twenty years old and upward, by their polls.",
										        "Numbers 1:2 - Take ye the sum of all the congregation of the children of Israel, after their families, by the house of their fathers, with the number of their names, every male by their polls;"
										    )));

										wordMap.put("Pommels", new KjvEntity("Pommels", "ornamental knob",
										    List.of(
										        "2 Chronicles 4:12 - To wit, the two pillars, and the pommels, and the chapiters which were on the top of the two pillars, and the two wreaths to cover the two pommels of the chapiters which were on the top of the pillars;",
										        "2 Chronicles 4:13 - And four hundred pomegranates on the two wreaths; two rows of pomegranates on each wreath, to cover the two pommels of the chapiters which were upon the pillars."    )));

										wordMap.put("Potsherd", new KjvEntity("Potsherd", "piece of broken pottery",
										    List.of(
										        "Job 2:8 - And he took him a potsherd to scrape himself withal; and he sat down among the ashes.",
										        "Psalms 22:15 - My strength is dried up like a potsherd; and my tongue cleaveth to my jaws; and thou hast brought me into the dust of death.",
										        "Isaiah 45:9 - Woe unto him that striveth with his Maker! Let the potsherd strive with the potsherds of the earth. Shall the clay say to him that fashioneth it, What makest thou? or thy work, He hath no hands?"
										    )));

										wordMap.put("Pottage", new KjvEntity("Pottage", "thick soup",
										    List.of(
										        "Genesis 25:29 - And Jacob sod pottage: and Esau came from the field, and he was faint:",
										        "Genesis 25:34 - Then Jacob gave Esau bread and pottage of lentiles; and he did eat and drink, and rose up, and went his way: thus Esau despised his birthright.",
										        "2 Kings 4:38 - And Elisha came again to Gilgal: and there was a dearth in the land; and the sons of the prophets were sitting before him: and he said unto his servant, Set on the great pot, and seethe pottage for the sons of the prophets."
										    )));

										wordMap.put("Pound", new KjvEntity("Pound(s)", "originally meant a pound weight of silver",
										    List.of(
										        "John 12:3 - Then took Mary a pound of ointment of spikenard, very costly, and anointed the feet of Jesus, and wiped his feet with her hair: and the house was filled with the odour of the ointment.",
										        "John 19:39 - And there came also Nicodemus, which at the first came to Jesus by night, and brought a mixture of myrrh and aloes, about an hundred pound weight.",
										        "Luke 19:18 - And the second came, saying, Lord, thy pound hath gained five pounds."
										    )));
											
											
											wordMap.put("Pounds", new KjvEntity("Pound(s)", "originally meant a pound weight of silver",
										    List.of(
										        "Luke 19:25 - (And they said unto him, Lord, he hath ten pounds.)",
										        "Luke 19:16 - Then came the first, saying, Lord, thy pound hath gained ten pounds.",
										        "Luke 19:13 - And he called his ten servants, and delivered them ten pounds, and said unto them, Occupy till I come."
										    )));

										wordMap.put("Prating", new KjvEntity("Prating", "boastful",
										    List.of(
										        "3 John 1:10 - Wherefore, if I come, I will remember his deeds which he doeth, prating against us with malicious words: and not content therewith, neither doth he himself receive the brethren, and forbiddeth them that would, and casteth them out of the church.",
										      "Proverbs 10:8 - The wise in heart will receive commandments: but a prating fool shall fall.",
											  "Proverbs 10:10 - He that winketh with the eye causeth sorrow: but a prating fool shall fall."
										   )));

										wordMap.put("Pricks", new KjvEntity("Pricks", "sharp pointed wood or iron rod for driving oxen",
										    List.of(
										        "Acts 9:5 - And he said, Who art thou, Lord? And the Lord said, I am Jesus whom thou persecutest: it is hard for thee to kick against the pricks.",
										        "Acts 26:14 - And when we were all fallen to the earth, I heard a voice speaking unto me, and saying in the Hebrew tongue, Saul, Saul, why persecutest thou me? it is hard for thee to kick against the pricks.",
										        "Numbers 33:55 - But if ye will not drive out the inhabitants of the land from before you; then it shall come to pass, that those which ye let remain of them shall be pricks in your eyes, and thorns in your sides, and shall vex you in the land wherein ye dwell."
										    )));

										wordMap.put("Privily", new KjvEntity("Privily", "secretly",
										    List.of(
										        "Matthew 1:19 - Then Joseph her husband, being a just man, and not willing to make her a publick example, was minded to put her away privily.",
										        "Galatians 2:4 - And that because of false brethren unawares brought in, who came in privily to spy out our liberty which we have in Christ Jesus, that they might bring us into bondage:",
										        "2 Peter 2:1 - But there were false prophets also among the people, even as there shall be false teachers among you, who privily shall bring in damnable heresies, even denying the Lord that bought them, and bring upon themselves swift destruction."
										    )));

										wordMap.put("Privy", new KjvEntity("Privy", "to have knowledge of; private",
										    List.of(
										        "Acts 5:2 - And kept back part of the price, his wife also being privy to it, and brought a certain part, and laid it at the apostles' feet.",
										        "Deuteronomy 23:1 - He that is wounded in the stones, or hath his privy member cut off, shall not enter into the congregation of the LORD.",
										        "1 Kings 2:44 - The king said moreover to Shimei, Thou knowest all the wickedness which thine heart is privy to, that thou didst to David my father: therefore the LORD shall return thy wickedness upon thine own head;"
										    )));

										wordMap.put("Profane", new KjvEntity("Profane", "common; unholy; to dishonor",
										    List.of(
										        "Ezekiel 22:26 - Her priests have violated my law, and have profaned mine holy things: they have put no difference between the holy and profane, neither have they shewed difference between the unclean and the clean, and have hid their eyes from my sabbaths, and I am profaned among them.",
										        "1 Timothy 4:7 - But refuse profane and old wives' fables, and exercise thyself rather unto godliness.",
										        "Hebrews 12:16 - Lest there be any fornicator, or profane person, as Esau, who for one morsel of meat sold his birthright."
										    )));

										wordMap.put("Provender", new KjvEntity("Provender", "animal feed",
										    List.of(
										        "Genesis 24:25 - She said moreover unto him, We have both straw and provender enough, and room to lodge in.",
										        "Genesis 42:27 - And as one of them opened his sack to give his ass provender in the inn, he espied his money; for, behold, it was in his sack's mouth.",
										        "Judges 19:19 - Yet there is both straw and provender for our asses; and there is bread and wine also for me, and for thy handmaid, and for the young man which is with thy servants: there is no want of any thing."
										    )));

										wordMap.put("Psaltery", new KjvEntity("Psaltery", "a harp with 12 strings",
										    List.of(
										        "Psalm 33:2 - Praise the LORD with harp: sing unto him with the psaltery and an instrument of ten strings.",
										        "Psalm 71:22 - I will also praise thee with the psaltery, even thy truth, O my God: unto thee will I sing with the harp, O thou Holy One of Israel.",
										        "Psalm 144:9 - I will sing a new song unto thee, O God: upon a psaltery and an instrument of ten strings will I sing praises unto thee."
										    )));
										
										
										wordMap.put("Publican", new KjvEntity("Publican", "a tax collector",
											    List.of(
											        "Luke 18:10 - Two men went up into the temple to pray; the one a Pharisee, and the other a publican.",
											        "Luke 18:13 - And the publican, standing afar off, would not lift up so much as his eyes unto heaven, but smote upon his breast, saying, God be merciful to me a sinner.",
											        "Luke 19:2 - And, behold, there was a man named Zacchaeus, which was the chief among the publicans, and he was rich."
											    )));

											wordMap.put("Pulse", new KjvEntity("Pulse", "grain or beans",
											    List.of(
											        "Daniel 1:12 - Prove thy servants, I beseech thee, ten days; and let them give us pulse to eat, and water to drink.",
											        "Daniel 1:16 - Thus Melzar took away the portion of their meat, and the wine that they should drink; and gave them pulse.",
											        "2 Samuel 17:28 - Brought beds, and basons, and earthen vessels, and wheat, and barley, and flour, and parched corn, and beans, and lentiles, and parched pulse,"
											    )));

											wordMap.put("Quicken", new KjvEntity("Quicken", "to make alive",
											    List.of(
											        "Psalm 119:25 - My soul cleaveth unto the dust: quicken thou me according to thy word.",
											        "Psalm 119:37 - Turn away mine eyes from beholding vanity; and quicken thou me in thy way.",
													"Psalms 119:25 - DALETH. My soul cleaveth unto the dust: quicken thou me according to thy word."
											    )));

											wordMap.put("Quickened", new KjvEntity("Quickened", "to make alive",
											    List.of(
											        "Ephesians 2:1 - And you hath he quickened, who were dead in trespasses and sins;",
											        "Ephesians 2:5 - Even when we were dead in sins, hath quickened us together with Christ, (by grace ye are saved;)",
											        "1 Peter 3:18 - For Christ also hath once suffered for sins, the just for the unjust, that he might bring us to God, being put to death in the flesh, but quickened by the Spirit:"
											    )));

											wordMap.put("Rail", new KjvEntity("Rail", "scorn",
											    List.of(
											        "2 Chronicles 32:17 - He wrote also letters to rail on the LORD God of Israel, and to speak against him, saying, As the gods of the nations of other lands have not delivered their people out of mine hand, so shall not the God of Hezekiah deliver his people out of mine hand."
											         )));

											wordMap.put("Railed", new KjvEntity("Railed", "scorn",
											    List.of(
											        "Matthew 27:39 - And they that passed by railed on him, wagging their heads,",
											        "Mark 15:29 - And they that passed by railed on him, wagging their heads, and saying, Ah, thou that destroyest the temple, and buildest it in three days,",
											        "Luke 23:39 - And one of the malefactors which were hanged railed on him, saying, If thou be Christ, save thyself and us."
											    )));

											wordMap.put("Raiment", new KjvEntity("Raiment", "clothing",
											    List.of(
											        "Matthew 6:28 - And why take ye thought for raiment? Consider the lilies of the field, how they grow; they toil not, neither do they spin:",
											        "Deuteronomy 8:4 - Thy raiment waxed not old upon thee, neither did thy foot swell, these forty years.",
											        "James 2:2 - For if there come unto your assembly a man with a gold ring, in goodly apparel, and there come in also a poor man in vile raiment;"
											    )));

											wordMap.put("Rampart", new KjvEntity("Rampart", "protective barrier, fortification",
											    List.of(
											        "Lamentations 2:8 - The LORD hath purposed to destroy the wall of the daughter of Zion: he hath stretched out a line, he hath not withdrawn his hand from destroying: therefore he made the rampart and the wall to lament; they languished together.",
													"Nahum 3:8 - Art thou better than populous No, that was situate among the rivers, that had the waters round about it, whose rampart was the sea, and her wall was from the sea?"
											   )));

											wordMap.put("Rank", new KjvEntity("Rank", "ripe",
											    List.of(
											        "Genesis 41:5 - And he slept and dreamed the second time: and, behold, seven ears of corn came up upon one stalk, rank and good.",
											        "1 Chronicles 12:33 - Of Zebulun, such as went forth to battle, expert in war, with all instruments of war, fifty thousand, which could keep rank: they were not of double heart.",
											        "Numbers 2:16- All that were numbered in the camp of Reuben were an hundred thousand and fifty and one thousand and four hundred and fifty, throughout their armies. And they shall set forth in the second rank."
											    )));

											wordMap.put("Rase", new KjvEntity("Rase", "destroy",
											    List.of(
											        "Psalm 137:7 - Remember, O LORD, the children of Edom in the day of Jerusalem; who said, Rase it, rase it, even to the foundation thereof."
											    )));

											wordMap.put("Ravin", new KjvEntity("Ravin", "plundering; tearing to pieces",
											    List.of(
											        "Genesis 49:27 - Benjamin shall ravin as a wolf: in the morning he shall devour the prey, and at night he shall divide the spoil.",
											        "Nahum 2:12 - The lion did tear in pieces enough for his whelps, and strangled for his lionesses, and filled his holes with prey, and his dens with ravin."
											    )));



											wordMap.put("Reins", new KjvEntity("Reins", "the seat of emotions, soul",
											    List.of(
											        "Psalm 7:9 - Oh let the wickedness of the wicked come to an end; but establish the just: for the righteous God trieth the hearts and reins.",
											        "Jeremiah 17:10 - I the LORD search the heart, I try the reins, even to give every man according to his ways, and according to the fruit of his doings.",
											        "Revelation 2:23 - And I will kill her children with death; and all the churches shall know that I am he which searcheth the reins and hearts: and I will give unto every one of you according to your works."
											    )));

											wordMap.put("Rend", new KjvEntity("Rend", "to tear",
											    List.of(
											        "Joel 2:13 - And rend your heart, and not your garments, and turn unto the LORD your God: for he is gracious and merciful, slow to anger, and of great kindness, and repenteth him of the evil.",
											        "1 Kings 11:31 - And he said to Jeroboam, Take thee ten pieces: for thus saith the LORD, the God of Israel, Behold, I will rend the kingdom out of the hand of Solomon, and will give ten tribes to thee:",
											        "Exodus 39:23 - And there was an hole in the midst of the robe, as the hole of an habergeon, with a band round about the hole, that it should not rend."
											    )));

											wordMap.put("Rent", new KjvEntity("Rent", "to tear",
											    List.of(
											        "Matthew 27:51 - And, behold, the veil of the temple was rent in twain from the top to the bottom; and the earth did quake, and the rocks rent;",
											        "Mark 1:10 - And straightway coming up out of the water, he saw the heavens opened, and the Spirit like a dove descending upon him:",
											        "Luke 5:36 - And he spake also a parable unto them; No man putteth a piece of a new garment upon an old; if otherwise, then both the new maketh a rent, and the piece that was taken out of the new agreeth not with the old."
											    )));

											wordMap.put("Reprobate", new KjvEntity("Reprobate", "rejected, depraved",
											    List.of(
											        "Jeremiah 6:30 - Reprobate silver shall men call them, because the LORD hath rejected them.",
											        "Titus 1:16 - They profess that they know God; but in works they deny him, being abominable, and disobedient, and unto every good work reprobate.",
											        "Romans 1:28 - And even as they did not like to retain God in their knowledge, God gave them over to a reprobate mind, to do those things which are not convenient;"
											    )));
											
											
											
											wordMap.put("Requite", new KjvEntity("Requite", "to pay back",
												    List.of(
												        "1 Timothy 5:4 - But if any widow have children or nephews, let them learn first to shew piety at home, and to requite their parents: for that is good and acceptable before God.",
												        "Deuteronomy 32:6 - Do ye thus requite the LORD, O foolish people and unwise? is not he thy father that hath bought thee? hath he not made thee, and established thee?",
												        "2 Samuel 16:12 - It may be that the LORD will look on mine affliction, and that the LORD will requite me good for his cursing this day."
												    )));

												wordMap.put("Rereward", new KjvEntity("Rereward", "a rear guard",
												    List.of(
												        "Isaiah 52:12 - For ye shall not go out with haste, nor go by flight: for the LORD will go before you; and the God of Israel will be your rereward.",
												        "Isaiah 58:8 - Then shall thy light break forth as the morning, and thine health shall spring forth speedily: and thy righteousness shall go before thee; the glory of the LORD shall be thy rereward.",
												        "Numbers 10:25 - And the standard of the camp of the children of Dan set forward, which was the rereward of all the camps throughout their hosts: and over his host was Ahiezer the son of Ammishaddai."
												    )));

												wordMap.put("Respite", new KjvEntity("Respite", "a rest",
												    List.of(
												        "Exodus 8:15 - But when Pharaoh saw that there was respite, he hardened his heart, and hearkened not unto them; as the LORD had said.",
														"1 Samuel 11:3 - And the elders of Jabesh said unto him, Give us seven days' respite, that we may send messengers unto all the coasts of Israel: and then, if there be no man to save us, we will come out to thee."
												    )));

												wordMap.put("Rudiments", new KjvEntity("Rudiments", "first principles",
												    List.of(
												        "Colossians 2:8 - Beware lest any man spoil you through philosophy and vain deceit, after the tradition of men, after the rudiments of the world, and not after Christ.",
												        "Colossians 2:20 - Wherefore if ye be dead with Christ from the rudiments of the world, why, as though living in the world, are ye subject to ordinances,"    )));

												wordMap.put("Sackbut", new KjvEntity("Sackbut", "a high-pitched 4-stringed harp",
												    List.of(
												        "Daniel 3:5 - That at what time ye hear the sound of the cornet, flute, harp, sackbut, psaltery, dulcimer, and all kinds of musick, ye fall down and worship the golden image that Nebuchadnezzar the king hath set up:",
												        "Daniel 3:7 - Therefore at that time, when all the people heard the sound of the cornet, flute, harp, sackbut, psaltery, and all kinds of musick, all the people, the nations, and the languages, fell down and worshipped the golden image that Nebuchadnezzar the king had set up.",
												        "Daniel 3:10 - Thou, O king, hast made a decree, that every man that shall hear the sound of the cornet, flute, harp, sackbut, psaltery, and dulcimer, and all kinds of musick, shall fall down and worship the golden image:"
												    )));

												wordMap.put("Satyr", new KjvEntity("Satyr", "an hairy male goat",
												    List.of(
												        "Isaiah 34:14 - The wild beasts of the desert shall also meet with the wild beasts of the island, and the satyr shall cry to his fellow; the screech owl also shall rest there, and find for herself a place of rest."    )));

												wordMap.put("Scall", new KjvEntity("Scall", "a sore or scab",
												    List.of(
												        "Leviticus 13:30 - Then the priest shall see the plague: and, behold, if it be in sight deeper than the skin; and there be in it a yellow thin hair; then the priest shall pronounce him unclean: it is a dry scall, even a leprosy upon the head or beard.",
												        "Leviticus 13:31 - And if the priest look on the plague of the scall, and, behold, it be not in sight deeper than the skin, and that there is no black hair in it; then the priest shall shut up him that hath the plague of the scall seven days:",
												        "Leviticus 13:33 - He shall be shaven, but the scall shall he not shave; and the priest shall shut up him that hath the scall seven days more:"
												    )));

												wordMap.put("Scrip", new KjvEntity("Scrip", "a small bag made of skin",
												    List.of(
												        "1 Samuel 17:40 - And he took his staff in his hand, and chose him five smooth stones out of the brook, and put them in a shepherd's bag which he had, even in a scrip; and his sling was in his hand: and he drew near to the Philistine.",
												        "Matthew 10:10 - Nor scrip for your journey, neither two coats, neither shoes, nor yet staves: for the workman is worthy of his meat.",
												        "Luke 22:35 - And he said unto them, When I sent you without purse, and scrip, and shoes, lacked ye any thing? And they said, Nothing."
												    )));

												wordMap.put("Seethe", new KjvEntity("Seethe", "to cook by boiling",
												    List.of(
												        "Exodus 23:19 - The first of the firstfruits of thy land thou shalt bring into the house of the LORD thy God. Thou shalt not seethe a kid in his mother's milk.",
												        "Exodus 29:31 - And thou shalt take the ram of the consecration, and seethe his flesh in the holy place.",
												        "2 Kings 4:38 - And Elisha came again to Gilgal: and there was a dearth in the land; and the sons of the prophets were sitting before him: and he said unto his servant, Set on the great pot, and seethe pottage for the sons of the prophets."
												    )));

												wordMap.put("Selvedge", new KjvEntity("Selvedge", "the edge of woven fabric",
												    List.of(
												        "Exodus 36:11 - And he made loops of blue on the edge of one curtain from the selvedge in the coupling: likewise he made in the uttermost side of another curtain, in the coupling of the second.",
														"Exodus 26:4 - And thou shalt make loops of blue upon the edge of the one curtain from the selvedge in the coupling; and likewise shalt thou make in the uttermost edge of another curtain, in the coupling of the second."
												    )));

												wordMap.put("Sepulchre", new KjvEntity("Sepulchre", "a cave-like burial place",
												    List.of(
												        "Matthew 27:60 - And laid it in his own new sepulchre, which he had hewn out in the rock: and he rolled a great stone to the door of the sepulchre, and departed.",
												        "John 19:41 - Now in the place where he was crucified there was a garden; and in the garden a new sepulchre, wherein was never man yet laid.",
												        "Mark 16:2 - And very early in the morning the first day of the week, they came unto the sepulchre at the rising of the sun."
												    )));
												wordMap.put("Settle", new KjvEntity("Settle", "a raised platform",
													    List.of(
													        "Ezekiel 43:14 - And from the bottom upon the ground even to the lower settle shall be two cubits, and the breadth one cubit; and from the lesser settle even to the greater settle shall be four cubits, and the breadth one cubit.",
													        "Luke 21:14 - Settle it therefore in your hearts, not to meditate before what ye shall answer:",
													        "Ezekiel 43:17 - And the settle shall be fourteen cubits long and fourteen broad in the four squares thereof; and the border about it shall be half a cubit; and the bottom thereof shall be a cubit about; and his stairs shall look toward the east."
													    )));

													wordMap.put("Shekel", new KjvEntity("Shekel", "about 0.5 ounces",
													    List.of(
													        "Leviticus 27:25 - And all thy estimations shall be according to the shekel of the sanctuary: twenty gerahs shall be the shekel.",
													        "Exodus 30:13 - This they shall give, every one that passeth among them that are numbered, half a shekel after the shekel of the sanctuary: (a shekel is twenty gerahs:) an half shekel shall be the offering of the LORD.",
													        "Numbers 3:47 - Thou shalt even take five shekels apiece by the poll, after the shekel of the sanctuary shalt thou take them: (the shekel is twenty gerahs:)"
													    )));

													wordMap.put("Shekels", new KjvEntity("Shekels", "about 0.5 ounces",
													    List.of(
													        "Genesis 23:16 - And Abraham hearkened unto Ephron; and Abraham weighed to Ephron the silver, which he had named in the audience of the sons of Heth, four hundred shekels of silver, current money with the merchant.",
													        "Exodus 38:25 - And the silver of them that were numbered of the congregation was an hundred talents, and a thousand seven hundred and threescore and fifteen shekels, after the shekel of the sanctuary:",
													        "1 Samuel 17:5 - And he had an helmet of brass upon his head, and he was armed with a coat of mail; and the weight of the coat was five thousand shekels of brass."
													    )));

													wordMap.put("Shittim", new KjvEntity("Shittim", "acacia tree",
													    List.of(
													        "Exodus 25:10 - And they shall make an ark of shittim wood: two cubits and a half shall be the length thereof, and a cubit and a half the breadth thereof, and a cubit and a half the height thereof.",
													        "Exodus 26:15 - And thou shalt make boards for the tabernacle of shittim wood standing up.",
													        "Joshua 2:1 - And Joshua the son of Nun sent out of Shittim two men to spy secretly, saying, Go view the land, even Jericho. And they went, and came into an harlot's house, named Rahab, and lodged there."
													    )));

													wordMap.put("Simple", new KjvEntity("Simple", "ignorant",
													    List.of(
													        "Proverbs 1:4 - To give subtilty to the simple, to the young man knowledge and discretion.",
													        "Proverbs 1:22 - How long, ye simple ones, will ye love simplicity? and the scorners delight in their scorning, and fools hate knowledge?",
													        "Proverbs 9:4 - Whoso is simple, let him turn in hither: as for him that wanteth understanding, she saith to him,"
													    )));

													wordMap.put("Snuffed", new KjvEntity("Snuffed", "to inhale through the nose",
													    List.of(
													        "Jeremiah 14:6 - And the wild asses did stand in the high places, they snuffed up the wind like dragons; their eyes did fail, because there was no grass.",
													        "Malachi 1:13 - Ye said also, Behold, what a weariness is it! and ye have snuffed at it, saith the LORD of hosts; and ye brought that which was torn, and the lame, and the sick; thus ye brought an offering: should I accept this of your hand? saith the LORD."
													    )));

													wordMap.put("Sod", new KjvEntity("Sod", "boil",
													    List.of(
													        "Genesis 25:29 - And Jacob sod pottage: and Esau came from the field, and he was faint.",
													        "2 Chronicles 35:13 - And they roasted the passover with fire according to the ordinance: but the other holy offerings sod they in pots, and in caldrons, and in pans, and divided them speedily among all the people."
													    )));

													wordMap.put("Sodden", new KjvEntity("Sodden", "boil",
													    List.of(
													        "Exodus 12:9 - Eat not of it raw, nor sodden at all with water, but roast with fire; his head with his legs, and with the purtenance thereof.",
													        "Leviticus 6:28 - But the earthen vessel wherein it is sodden shall be broken: and if it be sodden in a brasen pot, it shall be both scoured, and rinsed in water.",
													        "1 Samuel 2:15 - Also before they burnt the fat, the priest's servant came, and said to the man that sacrificed, Give flesh to roast for the priest; for he will not have sodden flesh of thee, but raw."
													    )));

													wordMap.put("Sojourn", new KjvEntity("Sojourn", "to reside temporarily",
													    List.of(
													        "Genesis 12:10 - And there was a famine in the land: and Abram went down into Egypt to sojourn there; for the famine was grievous in the land.",
													        "Leviticus 19:33 - And if a stranger sojourn with thee in your land, ye shall not vex him.",
													        "Psalms 120:5 - Woe is me, that I sojourn in Mesech, that I dwell in the tents of Kedar!"
													    )));

													wordMap.put("Soothsayer", new KjvEntity("Soothsayer", "one who claims to foretell future events",
													    List.of(
													        "Joshua 13:22 - Balaam also the son of Beor, the soothsayer, did the children of Israel slay with the sword among them that were slain by them."
													    )));

													wordMap.put("Soothsayers", new KjvEntity("Soothsayers", "one who claims to foretell future events",
													    List.of(
													        "Daniel 2:27 - Daniel answered in the presence of the king, and said, The secret which the king hath demanded cannot the wise men, the astrologers, the magicians, the soothsayers, shew unto the king;",
													        "Daniel 4:7 - Then came in the magicians, the astrologers, the Chaldeans, and the soothsayers: and I told the dream before them; but they did not make known unto me the interpretation thereof.",
													        "Daniel 5:7 - The king cried aloud to bring in the astrologers, the Chaldeans, and the soothsayers. And the king spake, and said to the wise men of Babylon, Whosoever shall read this writing, and shew me the interpretation thereof, shall be clothed with scarlet, and have a chain of gold about his neck, and shall be the third ruler in the kingdom."
													    )));

													wordMap.put("soothsaying", new KjvEntity("soothsaying", "one who claims to foretell future events",
													    List.of(
													        "Acts 16:16 - And it came to pass, as we went to prayer, a certain damsel possessed with a spirit of divination met us, which brought her masters much gain by soothsaying:"
													    )));

													wordMap.put("Sop", new KjvEntity("Sop", "bread dipped in liquid before being eaten",
													    List.of(
													        "John 13:26 - Jesus answered, He it is, to whom I shall give a sop, when I have dipped it. And when he had dipped the sop, he gave it to Judas Iscariot, the son of Simon.",
													        "John 13:27 - And after the sop Satan entered into him. Then said Jesus unto him, That thou doest, do quickly.",
													        "John 13:30 - He then having received the sop went immediately out: and it was night."
													    )));

													wordMap.put("Stay", new KjvEntity("Stay", "cause to remain; support",
													    List.of(
													        "Isaiah 3:1 - For, behold, the Lord, the LORD of hosts, doth take away from Jerusalem and from Judah the stay and the staff, the whole stay of bread, and the whole stay of water,",
													        "Psalm 18:18 - They prevented me in the day of my calamity: but the LORD was my stay.",
													        "Song of Solomon 2:5 - Stay me with flagons, comfort me with apples: for I am sick of love."
													    )));

													wordMap.put("Stayed", new KjvEntity("Stayed", "cause to remain; support",
													    List.of(
													        "Isaiah 26:3 - Thou wilt keep him in perfect peace, whose mind is stayed on thee: because he trusteth in thee.",
													        "Haggai 1:10 - Therefore the heaven over you is stayed from dew, and the earth is stayed from her fruit.",
													        "Psalms 106:30 - Then stood up Phinehas, and executed judgment: and so the plague was stayed."
													    )));
													
													
													
													wordMap.put("Stead", new KjvEntity("Stead", "place",
														    List.of(
														        "Genesis 22:13 - And Abraham lifted up his eyes, and looked, and behold behind him a ram caught in a thicket by his horns: and Abraham went and took the ram, and offered him up for a burnt offering in the stead of his son.",
														        "1 Chronicles 1:47 - And when Hadad was dead, Samlah of Masrekah reigned in his stead.",
														        "Genesis 36:36 - And Hadad died, and Samlah of Masrekah reigned in his stead."
														    )));

														wordMap.put("Straightway", new KjvEntity("Straightway", "immediately",
														    List.of(
														        "Mark 1:10 - And straightway coming up out of the water, he saw the heavens opened, and the Spirit like a dove descending upon him:",
														        "Mark 1:18 - And straightway they forsook their nets, and followed him.",
														        "Matthew 14:27 - But straightway Jesus spake unto them, saying, Be of good cheer; it is I; be not afraid."
														    )));

														wordMap.put("Strait", new KjvEntity("Strait", "narrow; tight situation",
														    List.of(
														        "Matthew 7:14 - Because strait is the gate, and narrow is the way, which leadeth unto life, and few there be that find it.",
														        "Luke 13:24 - Strive to enter in at the strait gate: for many, I say unto you, will seek to enter in, and shall not be able.",
														        "Philippians 1:23 - For I am in a strait betwixt two, having a desire to depart, and to be with Christ; which is far better:"
														    )));

														wordMap.put("Strakes", new KjvEntity("Strakes", "a streak or stripe",
														    List.of(
														        "Genesis 30:37 - And Jacob took him rods of green poplar, and of the hazel and chesnut tree; and pilled white strakes in them, and made the white appear which was in the rods.",
														        "Leviticus 14:37 - And he shall look on the plague, and, behold, if the plague be in the walls of the house with hollow strakes, greenish or reddish, which in sight are lower than the wall;"    )));

														wordMap.put("Succour", new KjvEntity("Succour", "to help",
														    List.of(
														        "Hebrews 2:18 - For in that he himself hath suffered being tempted, he is able to succour them that are tempted.",
														        "2 Samuel 8:5 - And when the Syrians of Damascus came to succour Hadadezer king of Zobah, David slew of the Syrians two and twenty thousand men.",
														        "2 Samuel 18:3 - But the people answered, Thou shalt not go forth: for if we flee away, they will not care for us; neither if half of us die, will they care for us: but now thou art worth ten thousand of us: therefore now it is better that thou succour us out of the city."
														    )));

														wordMap.put("Succoured", new KjvEntity("Succoured", "to help",
														    List.of(
														        "2 Corinthians 6:2 - (For he saith, I have heard thee in a time accepted, and in the day of salvation have I succoured thee: behold, now is the accepted time; behold, now is the day of salvation.)",
														        "2 Samuel 21:17 - But Abishai the son of Zeruiah succoured him, and smote the Philistine, and killed him. Then the men of David sware unto him, saying, Thou shalt go no more out with us to battle, that thou quench not the light of Israel."    )));

														wordMap.put("Succourer", new KjvEntity("Succourer", "to help",
														    List.of(
														        "Romans 16:2 - That ye receive her in the Lord, as becometh saints, and that ye assist her in whatsoever business she hath need of you: for she hath been a succourer of many, and of myself also."
														    )));

														wordMap.put("Sunder", new KjvEntity("Sunder", "to separate, divide",
														    List.of(
														        "Nahum 1:13 - For now will I break his yoke from off thee, and will burst thy bonds in sunder.",
														        "Psalms 107:16 - For he hath broken the gates of brass, and cut the bars of iron in sunder.",
														        "Luke 12:46 - The lord of that servant will come in a day when he looketh not for him, and at an hour when he is not aware, and will cut him in sunder, and will appoint him his portion with the unbelievers."
														    )));

														wordMap.put("ASunder", new KjvEntity("ASunder", "to separate, divide",
														    List.of(
														        "Psalms 2:3 - Let us break their bands asunder, and cast away their cords from us.",
														        "Mark 5:4 - Because that he had been often bound with fetters and chains, and the chains had been plucked asunder by him, and the fetters broken in pieces: neither could any man tame him.",
														        "Acts 1:18 - Now this man purchased a field with the reward of iniquity; and falling headlong, he burst asunder in the midst, and all his bowels gushed out."
														    )));

														wordMap.put("Superfluous", new KjvEntity("Superfluous", "to be excessive, unnecessary",
														    List.of(
														        "2 Corinthians 9:1 - For as touching the ministering to the saints, it is superfluous for me to write to you:",
														        "Leviticus 22:23 - Either a bullock or a lamb that hath any thing superfluous or lacking in his parts, that mayest thou offer for a freewill offering; but for a vow it shall not be accepted.",
														        "Leviticus 21:18 - For whatsoever man he be that hath a blemish, he shall not approach: a blind man, or a lame, or he that hath a flat nose, or any thing superfluous,"
														    )));

														wordMap.put("Superfluity", new KjvEntity("Superfluity", "to be excessive, unnecessary",
														    List.of(
														        "James 1:21 - Wherefore lay apart all filthiness and superfluity of naughtiness, and receive with meekness the engrafted word, which is able to save your souls."    )));

														wordMap.put("Taches", new KjvEntity("Taches", "fasteners",
														    List.of(
														        "Exodus 26:6 - And thou shalt make fifty taches of gold, and couple the curtains together with the taches: and it shall be one tabernacle.",
														        "Exodus 26:11 - And thou shalt make fifty taches of brass, and put the taches into the loops, and couple the tent together, that it may be one.",
														        "Exodus 36:13 - And he made fifty taches of gold, and coupled the curtains one unto another with the taches: so it became one tabernacle."
														    )));

														wordMap.put("Talent", new KjvEntity("Talent", "OT: 3,000 shekels, 94 lbs; NT: 60 pounds",
														    List.of(
														        "Exodus 25:39 - Of a talent of pure gold shall he make it, with all these vessels.",
														        "Matthew 25:28 - Take therefore the talent from him, and give it unto him which hath ten talents.",
														        "Revelation 16:21 - And there fell upon men a great hail out of heaven, every stone about the weight of a talent: and men blasphemed God because of the plague of the hail; for the plague thereof was exceeding great."
														    )));

														wordMap.put("Teats", new KjvEntity("Teats", "the nipple",
														    List.of(
														        "Ezekiel 23:3 - And they committed whoredoms in Egypt; they committed whoredoms in their youth: there were their breasts pressed, and there they bruised the teats of their virginity.",
														        "Ezekiel 23:8 - Neither left she her whoredoms brought from Egypt: for in her youth they lay with her, and they bruised the teats of her virginity, and poured their whoredom upon her."
														    )));

														wordMap.put("Teraphim", new KjvEntity("Teraphim", "idol",
														    List.of(
														        "Hosea 3:4 - For the children of Israel shall abide many days without a king, and without a prince, and without a sacrifice, and without an image, and without an ephod, and without teraphim:",
														        "Judges 17:5 - And the man Micah had an house of gods, and made an ephod, and teraphim, and consecrated one of his sons, who became his priest.",
														        "Judges 18:18 - And these went into Micah's house, and fetched the carved image, the ephod, and the teraphim, and the molten image. Then said the priest unto them, What do ye?"
														    )));

														wordMap.put("Tetrarch", new KjvEntity("Tetrarch", "one of four rulers of a region",
														    List.of(
														        "Luke 3:1 - Now in the fifteenth year of the reign of Tiberius Caesar, Pontius Pilate being governor of Judaea, and Herod being tetrarch of Galilee, and his brother Philip tetrarch of Ituraea and of the region of Trachonitis, and Lysanias the tetrarch of Abilene,",
														        "Luke 9:7 - Now Herod the tetrarch heard of all that was done by him: and he was perplexed, because that it was said of some, that John was risen from the dead;",
														        "Matthew 14:1 - At that time Herod the tetrarch heard of the fame of Jesus,"
														    )));
														
														
														wordMap.put("Thee", new KjvEntity("Thee", "the second person, singular pronoun, 'you'; includes Thine, Thou, Thy",
															    List.of(
															        "Genesis 12:2 - And I will make of thee a great nation, and I will bless thee, and make thy name great; and thou shalt be a blessing:",
															        "Exodus 20:2 - I am the LORD thy God, which have brought thee out of the land of Egypt, out of the house of bondage.",
															        "John 21:17 - He saith unto him the third time, Simon, son of Jonas, lovest thou me? Peter was grieved because he said unto him the third time, Lovest thou me? And he said unto him, Lord, thou knowest all things; thou knowest that I love thee. Jesus saith unto him, Feed my sheep."
															    )));

															wordMap.put("Thence", new KjvEntity("Thence", "from that time, date, or place",
															    List.of(
															        "Genesis 2:10 - And a river went out of Eden to water the garden; and from thence it was parted, and became into four heads.",
															        "Matthew 4:21 - And going on from thence, he saw other two brethren, James the son of Zebedee, and John his brother, in a ship with Zebedee their father, mending their nets; and he called them.",
															        "Leviticus 22:27 - When a bullock, or a sheep, or a goat, is brought forth, then it shall be seven days under the dam; and from the eighth day and thenceforth it shall be accepted for an offering made by fire unto the LORD."
															    )));

															wordMap.put("Thenceforth", new KjvEntity("Thenceforth", "from that time, date, or place",
															    List.of(
															        "2 Chronicles 32:23 - And many brought gifts unto the LORD to Jerusalem, and presents to Hezekiah king of Judah: so that he was magnified in the sight of all nations from thenceforth.",
															        "John 19:12 - And from thenceforth Pilate sought to release him: but the Jews cried out, saying, If thou let this man go, thou art not Caesar's friend: whosoever maketh himself a king speaketh against Caesar.",
															        "Matthew 5:13 - Ye are the salt of the earth: but if the salt have lost his savour, wherewith shall it be salted? it is thenceforth good for nothing, but to be cast out, and to be trodden under foot of men."
															    )));

															wordMap.put("Thither", new KjvEntity("Thither", "there, toward that place",
															    List.of(
															        "Genesis 19:20 - Behold now, this city is near to flee unto, and it is a little one: Oh, let me escape thither, (is it not a little one?) and my soul shall live.",
															        "Luke 21:2 - And he saw also a certain poor widow casting in thither two mites.",
															        "John 11:8 - His disciples say unto him, Master, the Jews of late sought to stone thee; and goest thou thither again?"
															    )));

															wordMap.put("Thitherward", new KjvEntity("Thitherward", "there, toward that place",
															    List.of(
															        "Jeremiah 50:5 - They shall ask the way to Zion with their faces thitherward, saying, Come, and let us join ourselves to the LORD in a perpetual covenant that shall not be forgotten.",
															        "Judges 18:15 - And they turned thitherward, and came to the house of the young man the Levite, even unto the house of Micah, and saluted him.",
															        "Romans 15:24 - Whensoever I take my journey into Spain, I will come to you: for I trust to see you in my journey, and to be brought on my way thitherward by you, if first I be somewhat filled with your company."
															    )));

															wordMap.put("Timbrel", new KjvEntity("Timbrel", "any small musical instrument that is beat upon",
															    List.of(
															        "Exodus 15:20 - And Miriam the prophetess, the sister of Aaron, took a timbrel in her hand; and all the women went out after her with timbrels and with dances.",
															        "Psalm 81:2 - Take a psalm, and bring hither the timbrel, the pleasant harp with the psaltery.",
															        "Psalm 149:3 - Let them praise his name in the dance: let them sing praises unto him with the timbrel and harp."
															    )));

															wordMap.put("Timbrels", new KjvEntity("Timbrels", "any small musical instrument that is beat upon",
															    List.of(
															        "Exodus 15:20 - And Miriam the prophetess, the sister of Aaron, took a timbrel in her hand; and all the women went out after her with timbrels and with dances.",
															        "Judges 11:34 - And Jephthah came to Mizpeh unto his house, and, behold, his daughter came out to meet him with timbrels and with dances: and she was his only child; beside her he had neither son nor daughter.",
															        "Psalms 68:25 - The singers went before, the players on instruments followed after; among them were the damsels playing with timbrels."
															    )));

															wordMap.put("Tire", new KjvEntity("Tire", "attire, head-dress",
															    List.of(
															        "Ezekiel 24:17 - Forbear to cry, make no mourning for the dead, bind the tire of thine head upon thee, and put on thy shoes upon thy feet, and cover not thy lips, and eat not the bread of men."
															    )));

															wordMap.put("Tires", new KjvEntity("Tires", "attire, head-dress",
															    List.of(
															        "Isaiah 3:18 - In that day the Lord will take away the bravery of their tinkling ornaments about their feet, and their cauls, and their round tires like the moon,",
															        "Ezekiel 24:23 - And your tires shall be upon your heads, and your shoes upon your feet: ye shall not mourn nor weep; but ye shall pine away for your iniquities, and mourn one toward another."
															    )));

															wordMap.put("Tired", new KjvEntity("Tired", "attire, head-dress",
															    List.of(
															        "2 Kings 9:30 - And when Jehu was come to Jezreel, Jezebel heard of it; and she painted her face, and tired her head, and looked out at a window."
															    )));

															wordMap.put("Tithe", new KjvEntity("Tithe", "a tenth",
															    List.of(
															        "Deuteronomy 14:22 - Thou shalt truly tithe all the increase of thy seed, that the field bringeth forth year by year.",
															        "Leviticus 27:30 - And all the tithe of the land, whether of the seed of the land, or of the fruit of the tree, is the LORD'S: it is holy unto the LORD.",
															        "Nehemiah 13:12 - Then brought all Judah the tithe of the corn and the new wine and the oil unto the treasuries."
															    )));
	}
	
    	public List<String> getAllWords() 
    	{
    	    return wordMap.keySet()
    	                  .stream()
    	                  .sorted(String.CASE_INSENSITIVE_ORDER)
    	                  .toList();
    	}
    
	
	public KjvEntity getKjvWord(String word)
	{
		return wordMap.get(word);
	}
}
