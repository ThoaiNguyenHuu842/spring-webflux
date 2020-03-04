package com.coke.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.coke.domain.Stock;

import reactor.core.publisher.Flux;

public interface StockRepository extends ReactiveMongoRepository<Stock, Integer>{
	Flux<Stock> findByVmUUID(String uuid);
}
