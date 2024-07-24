package com.incedo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/kamalesh")
public class PracticeController {

	@GetMapping("/loves")
	public @ResponseBody String getdata()
	{
		return "Java";
	}
	
}
