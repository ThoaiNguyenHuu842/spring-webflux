package com.coke.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coke.domain.Product;
import com.coke.repository.ProductRepository;
import com.coke.repository.StockRepository;
import com.coke.service.ProductService;

import reactor.core.publisher.Flux;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private StockRepository stockRepository;
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Flux<Product> getProductByVM(String uuid) {
		return stockRepository.findByVmUUID(uuid).flatMap(s -> productRepository.findById(s.getProductId()).map(p -> {
			p.setQuantity(s.getQuantity());
			return p;
		}));
	}

}
