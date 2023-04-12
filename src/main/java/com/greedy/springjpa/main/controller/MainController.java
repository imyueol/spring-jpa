package com.greedy.springjpa.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.greedy.springjpa.menu.dto.MenuDTO;

@Controller
public class MainController {
	
	@GetMapping(value = {"/", "/main"})
	public String main() {
		
		return "main/main";
	}
	

}
