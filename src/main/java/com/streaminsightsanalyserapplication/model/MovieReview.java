package com.streaminsightsanalyserapplication.model;

public class MovieReview {
	private int id;

	private int movieId;

	private int userId;

	private String review;

	private int rating;

	public MovieReview() {
		super();
	}

	public MovieReview(int movieId, int userId, String review, int rating) {
		super();
		this.movieId = movieId;
		this.userId = userId;
		this.review = review;
		this.rating = rating;
	}

	public MovieReview(int id, int movieId, int userId, String review, int rating) {
		super();
		this.id = id;
		this.movieId = movieId;
		this.userId = userId;
		this.review = review;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "MovieReview [id=" + id + ", movieId=" + movieId + ", userId=" + userId + ", review=" + review
				+ ", rating=" + rating + "]";
	}
}
