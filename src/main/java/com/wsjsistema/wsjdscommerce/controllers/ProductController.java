package com.wsjsistema.wsjdscommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wsjsistema.wsjdscommerce.dto.ProductDTO;
import com.wsjsistema.wsjdscommerce.services.ProductService;

@RestController
@RequestMapping(value  = "/products")
public class ProductController {
	
	
	@Autowired
	private ProductService service;
	
	@GetMapping(value = "/{id}")
	public ProductDTO findyById(@PathVariable Long id) {

		ProductDTO dto = service.findById(id);
		return dto;
	}

	
	@GetMapping
	public Page<ProductDTO> findAll(Pageable pagenable){
		return service.findAll(pagenable);
	}
}
