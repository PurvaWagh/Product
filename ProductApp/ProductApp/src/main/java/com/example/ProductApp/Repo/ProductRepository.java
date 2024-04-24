package com.example.ProductApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProductApp.Entity.Product;

public interface ProductRepository extends JpaRepository<Product,String>{

}
