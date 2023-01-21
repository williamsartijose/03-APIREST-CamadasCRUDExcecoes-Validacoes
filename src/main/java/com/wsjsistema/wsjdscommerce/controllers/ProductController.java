package com.wsjsistema.wsjdscommerce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value  = "/product")
public class ProductController {
	
	@GetMapping
	public String teste() {
		return "Ola mundo !";
	}

}
