package com.example.ProductApp.Repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ProductApp.Entity.Product;

public interface ProductRepository extends MongoRepository<Product,String>{

}
