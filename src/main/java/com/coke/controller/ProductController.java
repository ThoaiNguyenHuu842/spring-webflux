package com.coke.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coke.domain.Product;
import com.coke.repository.ProductRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("qrpayment/products")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping(value = "")
	public Flux<Product> get(@RequestParam Optional<Integer> categoryId) {
		if(categoryId.isPresent()) {
			return productRepository.findByCategoryId(categoryId.get());
		}
		return productRepository.findAll();
	}
}
