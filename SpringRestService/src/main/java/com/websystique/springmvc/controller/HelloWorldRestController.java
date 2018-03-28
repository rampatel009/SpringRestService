package com.websystique.springmvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springmvc.domain.Player;

@RestController
public class HelloWorldRestController {

	@RequestMapping("/")
	public String welcome() {//Welcome page, non-rest
		return "Welcome to RestTemplate Example.";
	}

	@RequestMapping("/hello/{player}")
	public Player message(@PathVariable String player) {//REST Endpoint.

		Player msg = new Player(player, "Hello " + player);
		return msg;
	}

	
}
