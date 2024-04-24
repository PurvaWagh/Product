package com.example.ProductApp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ProductApp.Entity.Product;
import com.example.ProductApp.Repo.ProductRepository;

public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Optional<Product> getProductById(String id) {
        return productRepo.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepo.save(product);
    }

    public Product updateProduct(String id, Product product) {
        product.setId(id);
        return productRepo.save(product);
    }

    public void deleteProduct(String id) {
        productRepo.deleteById(id);
    }

}
