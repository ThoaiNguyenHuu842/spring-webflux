package com.coke.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.coke.domain.Category;

import reactor.core.publisher.Flux;

public interface CategoryRepository extends ReactiveMongoRepository<Category, Integer>{
}
