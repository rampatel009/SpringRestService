package com.websystique.springmvc.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "player")
public class Player {

	String name;
	String text;

	public Player(){
		
	}
	
	public Player(String name, String text) {
		this.name = name;
		this.text = text;
	}

	@XmlElement
	public String getName() {
		return name;
	}
	
	@XmlElement
	public String getText() {
		return text;
	}

}
