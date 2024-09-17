package com.zsgs.theatrepass.screens.login;

import java.util.Scanner;

import com.zsgs.theatrepass.BaseScreen;
import com.zsgs.theatrepass.dto.User;
import com.zsgs.theatrepass.screens.movielist.MovieListScreen;

public class LoginScreen extends BaseScreen {
	private LoginViewModel viewModel;

	public LoginScreen() {
		viewModel = new LoginViewModel(this);
	}

	public void onCreate() {
		if (hasNetworkConnection()) {
			System.out.println("Welcome to theatre pass application");
			
			System.out.println("\n\nPlease login to proceed.");
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nEnter the user name:");
			String userName = scanner.next();
			System.out.println("Enter the password:");
			String password = scanner.next();
			
			viewModel.validateUser(userName, password);
		} else {
			System.out.println("Please check internet connection");
		}
	}

	public void navigateMovieList(User loggedInUser) {
		System.out.println("Welcome "+loggedInUser.getName());
		MovieListScreen movieListScreen = new MovieListScreen();
		movieListScreen.onCreate();
	}
	
	public void showErroMessage(String message) {
		System.out.println(message);
	}
}
