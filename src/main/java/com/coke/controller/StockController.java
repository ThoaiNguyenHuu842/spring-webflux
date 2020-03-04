package com.coke.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coke.domain.Product;
import com.coke.service.ProductService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("qrpayment/vm")
public class StockController {
	@Autowired
	private ProductService productService;

	@GetMapping(value = "{uuid}/products")
	public Flux<Product> get(@PathVariable String uuid) {
		return productService.getProductByVM(uuid);
	}
}
