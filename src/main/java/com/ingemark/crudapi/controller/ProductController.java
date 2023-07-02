package com.ingemark.crudapi.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ingemark.crudapi.dto.ProductRequest;
import com.ingemark.crudapi.entity.Product;
import com.ingemark.crudapi.service.ProductServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

	private final ProductServiceImpl productService;

	@GetMapping("/")
	public ResponseEntity<List<Product>> getProducts() {
		return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") Long productId) {
		return new ResponseEntity<>(productService.getProductById(productId), HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest) {
		return new ResponseEntity<>(productService.saveProduct(productRequest), HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable("id") Long productId, @RequestBody @Valid ProductRequest productRequest) {
		return new ResponseEntity<>(productService.updateProduct(productId, productRequest), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteProduct(@PathVariable("id") Long productId) {
		productService.deleteProduct(productId);
	}

	@DeleteMapping("/")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteProducts() {
		productService.deleteProducts();
	}

}
