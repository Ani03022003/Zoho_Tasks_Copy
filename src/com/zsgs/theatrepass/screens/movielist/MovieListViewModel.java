package com.zsgs.theatrepass.screens.movielist;

import java.util.ArrayList;
import java.util.List;

class MovieListViewModel {
	
	private MovieListScreen movieListScreen;

	public MovieListViewModel(MovieListScreen movieListScreen) {
		this.movieListScreen = movieListScreen;
	}

	public List<String> getMovieList() {
		List<String> movieName =  new ArrayList<String>();
		movieName.add("Jailer");
		movieName.add("Goat");
		return movieName;
	}
	
	public void onMovieSelected(String movieName) {
		//getting movie details 
		//return movie details.
		movieListScreen.navigateToMovieDetails();
	}
	
	public void dontShowMovie(String movieName) {
		
	}

}
