package com.ingemark.crudapi.service;

import java.util.List;
import com.ingemark.crudapi.dto.ProductRequest;
import com.ingemark.crudapi.entity.Product;

public interface ProductService {

	List<Product> getProducts();

	Product getProductById(long productId);

	Product saveProduct(ProductRequest productRequest);

	Product updateProduct(Long id, ProductRequest productRequest);

	void deleteProduct(long productId);

	void deleteProducts();

}
