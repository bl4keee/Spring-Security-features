<<<<<<< HEAD
package com.bartek.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/") 
	public String showHome() {
		return "home";
	}
}
=======
package com.bartek.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/") 
	public String showHome() {
		return "home";
	}
	
}
>>>>>>> 022810d4bb540b2c5252c252b364672f425af418
