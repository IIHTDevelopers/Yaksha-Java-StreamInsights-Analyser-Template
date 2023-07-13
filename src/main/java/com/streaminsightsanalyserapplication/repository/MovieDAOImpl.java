package com.streaminsightsanalyserapplication.repository;

import java.util.List;

import com.streaminsightsanalyserapplication.model.Movie;

public class MovieDAOImpl implements MovieDAO {

	private final String dbUrl;
	private final String dbUser;
	private final String dbPassword;

	public MovieDAOImpl(String dbUrl, String dbUser, String dbPassword) {
		this.dbUrl = dbUrl;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
	}

	@Override
	public void addMovie(Movie movie) {
	}

	@Override
	public void updateMovie(Movie movie) {
	}

	@Override
	public Movie getMovieById(int id) {
		return null;
	}

	@Override
	public void deleteMovie(int id) {
	}

	@Override
	public List<Movie> getMostWatchedMovies() {
		return null;
	}

	@Override
	public List<Movie> sortMoviesByGenreCount() {
		return null;
	}

	@Override
	public List<Movie> getTopMoviesByAgeRange(int minAge, int maxAge, int limit) {
		return null;
	}

	@Override
	public List<Movie> searchMoviesByDirectorAndRating(String director, int rating) {
		return null;
	}

	@Override
	public Movie getLowestRatedMovieByActor(String actor) {
		return null;
	}

	@Override
	public List<Movie> searchMoviesByGenreAndLength(String genre, int maxLength) {
		return null;
	}

	@Override
	public void deleteAllMovies() {
	}

	@Override
	public List<Movie> getAllMovies() {
		return null;
	}
}
