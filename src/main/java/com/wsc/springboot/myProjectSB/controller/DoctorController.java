package com.wsc.springboot.myProjectSB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
	
	@GetMapping("/doctor/1")
	@ResponseBody
	public String affiche1() {
		return "William Hartnell";
	}
	
	@GetMapping("/doctor/10")
	@ResponseBody
	public String affiche10() {
		return "David Tennant";
	}
	
	@GetMapping("/doctor/13")
	@ResponseBody
	public String affiche13() {
		return "Jodie Whittaker";
	}
}