package com.zsgs.theatrepass.screens;

import java.util.Scanner;

import com.zsgs.theatrepass.BaseScreen;

public class LoginScreen extends BaseScreen {

	public LoginScreen(String name) {
		userName = name;
	}

	private String userName = "ZSGS";
	private String userPassword = "admin";

	public void onCreate() {
		if (hasNetworkConnection()) {
			System.out.println("Welcome to theatre pass application");
			System.out.println("\n\nPlease login to proceed.");
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nEnter the user name:");
			String userName = scanner.next();
			System.out.println("Enter the password:");
			String password = scanner.next();
			if (validateUser(userName, password)) {
				MovieListScreen movieListScreen = new MovieListScreen();
				movieListScreen.onCreate();
			} else {
				System.out.println("Enter valid user name or password");
			}
		} else {
			System.out.println("Please check internet connection");
		}
	}

	private boolean validateUser(String userName, String password) {
		return this.userName.equals(userName) && this.userPassword.equals(password);
	}

	protected static class Listener {

	}
}
