package com.chian.audio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class indexController {

	@RequestMapping("/")
	public String index(){
		System.out.println("come here");
		return "fan";
	}
	
	@RequestMapping("getIndex")
	@ResponseBody
	public String getIndex(){
		return "this is my first jenkins project";
	}
		
	@RequestMapping("methodTwo")
	@ResponseBody
	public String methodTwo(){
		return "method two";
	}
	
}
