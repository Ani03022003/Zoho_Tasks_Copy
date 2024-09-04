package com.zsgs.theatrepass.screens.movielist;

import java.util.List;

import com.zsgs.theatrepass.BaseScreen;
import com.zsgs.theatrepass.screens.theatrelistscreen.TheatreListScreen;

public class MovieListScreen extends BaseScreen {
	
	private MovieListViewModel movieListViewModel;
	
	public MovieListScreen(){
		movieListViewModel = new MovieListViewModel(this);
	}
	
	public void onCreate() {
		if (hasNetworkConnection()) {
			System.out.println("Listing the Movie names");
		} else {
			System.out.println("Please check internet connection");
		}
		printMovieName(movieListViewModel.getMovieList());
	}

	private void printMovieName(List<String> movieList) {
		//Movies listing 
		//getting choice from the user
	}
	
	public void navigateToMovieDetails() {
		TheatreListScreen theatreListScreen = new TheatreListScreen();
		theatreListScreen.onCreate();
	}

	public void successfullyBlockListed() {
		//Movies listing without blocked movie name.
	}

	public void showErrorMessage() {
		//show error message.
	}
	
}
