package com.jnit.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//http://localhost:8080/courseApp/hello
@Controller
public class HelloController {

	@GetMapping("/hello")
	public @ResponseBody String hello() {
		return "welcome to REST programming";
	}
}
