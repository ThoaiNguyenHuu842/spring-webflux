package com.coke.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.coke.domain.Product;

import reactor.core.publisher.Flux;

public interface ProductRepository extends ReactiveMongoRepository<Product, Integer>{
	Flux<Product> findByCategoryId(int categoryId);
}
