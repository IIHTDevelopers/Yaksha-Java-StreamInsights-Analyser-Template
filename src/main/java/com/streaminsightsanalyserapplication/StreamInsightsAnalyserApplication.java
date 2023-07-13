package com.streaminsightsanalyserapplication;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.streaminsightsanalyserapplication.repository.MovieDAO;
import com.streaminsightsanalyserapplication.repository.MovieDAOImpl;
import com.streaminsightsanalyserapplication.repository.MovieReviewDAO;
import com.streaminsightsanalyserapplication.repository.MovieReviewDAOImpl;
import com.streaminsightsanalyserapplication.repository.UserDAO;
import com.streaminsightsanalyserapplication.repository.UserDAOImpl;

public class StreamInsightsAnalyserApplication {
	private static final String DB_URL;
	private static final String DB_NAME;
	private static final String DB_USER;
	private static final String DB_PASSWORD;

	private static final String CREATE_DATABASE_QUERY = "CREATE DATABASE IF NOT EXISTS ";
	private static final String CREATE_MOVIE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS movie (id INT AUTO_INCREMENT PRIMARY KEY, "
			+ "name VARCHAR(255), genre VARCHAR(255), director VARCHAR(255), star_cast VARCHAR(255), "
			+ "length INT, certificate VARCHAR(255))";
	private static final String CREATE_USER_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS user (id INT AUTO_INCREMENT PRIMARY KEY, "
			+ "name VARCHAR(255), age INT, gender VARCHAR(255))";
	private static final String CREATE_MOVIE_REVIEW_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS movie_review "
			+ "(id INT AUTO_INCREMENT PRIMARY KEY, movie_id INT, user_id INT, review VARCHAR(255), rating INT)";

	private static final Scanner scanner = new Scanner(System.in);
	private static MovieDAO movieDAO;
	private static UserDAO userDAO;
	private static MovieReviewDAO movieReviewDAO;

	static {
		Properties properties = new Properties();
		try (InputStream inputStream = StreamInsightsAnalyserApplication.class.getClassLoader()
				.getResourceAsStream("application.properties")) {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		DB_URL = properties.getProperty("db.url");
		DB_NAME = properties.getProperty("db.database");
		DB_USER = properties.getProperty("db.username");
		DB_PASSWORD = properties.getProperty("db.password");
	}

	public static void main(String[] args) {
		initializeDAO();

		createDatabaseIfNotExists();
		createTablesIfNotExists();

		showOptions();
	}

	private static void initializeDAO() {
		movieDAO = new MovieDAOImpl(DB_URL + DB_NAME, DB_USER, DB_PASSWORD);
		userDAO = new UserDAOImpl(DB_URL + DB_NAME, DB_USER, DB_PASSWORD);
		movieReviewDAO = new MovieReviewDAOImpl(DB_URL + DB_NAME, DB_USER, DB_PASSWORD);
	}

	private static void createDatabaseIfNotExists() {
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connection.createStatement()) {
			statement.executeUpdate(CREATE_DATABASE_QUERY + DB_NAME);
			System.out.println("Database created successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void createTablesIfNotExists() {
		try (Connection connection = DriverManager.getConnection(DB_URL + DB_NAME, DB_USER, DB_PASSWORD);
				Statement statement = connection.createStatement()) {
			statement.executeUpdate(CREATE_MOVIE_TABLE_QUERY);
			statement.executeUpdate(CREATE_USER_TABLE_QUERY);
			statement.executeUpdate(CREATE_MOVIE_REVIEW_TABLE_QUERY);
			System.out.println("Tables created successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void showOptions() {
	}

	private static void addMovie() {
	}

	private static void addUser() {
	}

	private static void addMovieReview() {
	}

	private static void updateMovie() {
	}

	private static void updateUser() {
	}

	private static void getMovieDetails() {
	}

	private static void getUserDetails() {
	}

	private static void deleteMovie() {
	}

	private static void deleteUser() {
	}

	private static void getMostWatchedMovies() {
	}

	private static void sortMoviesByGenreCount() {
	}

	private static void getTopMoviesByAgeRange() {
	}

	private static void searchMoviesByDirectorAndRating() {
	}

	private static void getLowestRatedMovieByActor() {
	}

	private static void searchMoviesByGenreAndLength() {
	}
}
