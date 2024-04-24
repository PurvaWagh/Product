package com.example.ProductApp.Entity;

public class Rating {
	private String userId;
    private int rating;
    private String comment;
	public Rating() {
		super();
	}
	public Rating(String userId, int rating, String comment) {
		super();
		this.userId = userId;
		this.rating = rating;
		this.comment = comment;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
    
}
