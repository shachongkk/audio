package com.chian.audio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

	@RequestMapping("/")
	public String index(){
		System.out.println("come here");
		return "fan";
	}
	
}
