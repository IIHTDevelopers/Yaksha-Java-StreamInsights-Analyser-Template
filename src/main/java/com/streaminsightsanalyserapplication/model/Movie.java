package com.streaminsightsanalyserapplication.model;

public class Movie {
	private int id;

	private String name;

	private String genre;

	private String director;

	private String starCast;

	private int length;

	private String certificate;

	public Movie() {
		super();
	}

	public Movie(String name, String genre, String director, String starCast, int length, String certificate) {
		super();
		this.name = name;
		this.genre = genre;
		this.director = director;
		this.starCast = starCast;
		this.length = length;
		this.certificate = certificate;
	}

	public Movie(int id, String name, String genre, String director, String starCast, int length, String certificate) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.director = director;
		this.starCast = starCast;
		this.length = length;
		this.certificate = certificate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getStarCast() {
		return starCast;
	}

	public void setStarCast(String starCast) {
		this.starCast = starCast;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", genre=" + genre + ", director=" + director + ", starCast="
				+ starCast + ", length=" + length + ", certificate=" + certificate + "]";
	}

}
