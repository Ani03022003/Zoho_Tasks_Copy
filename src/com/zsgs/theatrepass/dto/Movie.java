package com.zsgs.theatrepass.dto;

import java.util.List;

public class Movie {
	private int movieId;
	private String movieName;
	private String movieReleaseDate;
	private String movieDescription;
	private String movieDirector;
	private String sensorCertifiedAs;
	private List<String> movieActors;
	private boolean isReleased;// is this key needed?

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(String movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public List<String> getMovieActors() {
		return movieActors;
	}

	public void setMovieActors(List<String> movieActors) {
		this.movieActors = movieActors;
	}

	public boolean isReleased() {
		return isReleased;
	}

	public void setReleased(boolean isReleased) {
		this.isReleased = isReleased;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
}
