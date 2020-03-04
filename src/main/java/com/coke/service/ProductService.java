package com.coke.service;

import com.coke.domain.Product;

import reactor.core.publisher.Flux;

public interface ProductService {
	Flux<Product> getProductByVM(String uuid);
}
