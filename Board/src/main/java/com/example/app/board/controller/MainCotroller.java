package com.example.app.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class MainCotroller {
	@GetMapping("/say")
	public String sayHello(Model model) {
		model.addAttribute("say","Hello");
		return "sample";
	}
	
}
