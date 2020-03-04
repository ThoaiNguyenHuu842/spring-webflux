package com.coke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coke.domain.Category;
import com.coke.repository.CategoryRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("qrpayment/categories")
public class CategoryController {
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping(value = "")
	public Flux<Category> get() {
		return categoryRepository.findAll();
	}
}
