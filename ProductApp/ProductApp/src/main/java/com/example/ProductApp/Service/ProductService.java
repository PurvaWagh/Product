package com.example.ProductApp.Service;

import java.util.List;
import java.util.Optional;

import com.example.ProductApp.Entity.Product;

public interface ProductService {
	List<Product> getAllProducts();
	Optional<Product> getProductById(String id);
	Product createProduct(Product product);
	Product updateProduct(String id, Product product);
	void deleteProduct(String id);
}
