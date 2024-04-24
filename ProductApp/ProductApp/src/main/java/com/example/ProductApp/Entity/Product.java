package com.example.ProductApp.Entity;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Document(collection = "products")
public class Product {
	@Id
    private String id;
    private String name;
    private String description;
    private double price;
    private List<String> categories;
    private List<Map<String, String>> attributes;
    private Availability availability;
    private List<Rating> ratings;
	public Product() {
		super();
	}
	public Product(String id, String name, String description, double price, List<String> categories,
			List<Map<String, String>> attributes, Availability availability, List<Rating> ratings) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.categories = categories;
		this.attributes = attributes;
		this.availability = availability;
		this.ratings = ratings;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public List<Map<String, String>> getAttributes() {
		return attributes;
	}
	public void setAttributes(List<Map<String, String>> attributes) {
		this.attributes = attributes;
	}
	public Availability getAvailability() {
		return availability;
	}
	public void setAvailability(Availability availability) {
		this.availability = availability;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
    

}
