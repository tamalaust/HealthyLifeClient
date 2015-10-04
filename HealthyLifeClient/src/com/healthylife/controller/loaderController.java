package com.healthylife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loaderController {
	
	@RequestMapping("/")
	public String loader()
	{
		return "index";
		
	}

}
