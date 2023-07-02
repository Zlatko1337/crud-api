package com.ingemark.crudapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ingemark.crudapi.dto.ProductRequest;
import com.ingemark.crudapi.entity.Product;
import com.ingemark.crudapi.entity.mapper.ProductMapper;
import com.ingemark.crudapi.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

	private final ProductRepository repository;
	private final ProductMapper productMapper;

	@Override
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@Override
	public Product getProductById(long productId) {
		return repository.findById(productId).orElseThrow(EntityNotFoundException::new);
	}

	@Override
	public Product saveProduct(ProductRequest productRequest) {
		return repository.save(productMapper.mapToEntity(productRequest, null));
	}

	@Override
	public Product updateProduct(Long productId, ProductRequest productRequest) {
		this.getProductById(productId);
		return repository.save(productMapper.mapToEntity(productRequest, productId));
	}

	@Override
	public void deleteProduct(long productId) {
		repository.deleteById(productId);
	}

	@Override
	public void deleteProducts() {
		repository.deleteAll();
	}

}
