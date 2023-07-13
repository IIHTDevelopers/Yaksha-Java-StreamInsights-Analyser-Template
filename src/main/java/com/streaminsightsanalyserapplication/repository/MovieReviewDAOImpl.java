package com.streaminsightsanalyserapplication.repository;

import java.util.List;

import com.streaminsightsanalyserapplication.model.MovieReview;

public class MovieReviewDAOImpl implements MovieReviewDAO {

	private String dbUrl = "";
	private String dbUser = "";
	private String dbPassword = "";

	public MovieReviewDAOImpl(String dbUrl, String dbUser, String dbPassword) {
		this.dbUrl = dbUrl;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
	}

	@Override
	public void addMovieReview(MovieReview movieReview) {
	}

	@Override
	public void updateMovieReview(MovieReview movieReview) {
	}

	@Override
	public MovieReview getMovieReviewById(int id) {
		return null;
	}

	@Override
	public void deleteMovieReview(int id) {
	}

	@Override
	public void deleteAllMovieReviews() {
	}

	@Override
	public List<MovieReview> getAllMovieReviews() {
		return null;
	}
}
