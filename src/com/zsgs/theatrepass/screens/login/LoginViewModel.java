package com.zsgs.theatrepass.screens.login;

class LoginViewModel {

	private LoginScreen view;

	public LoginViewModel(LoginScreen screen) {
		view = screen;
	}

	private String userName = "ZSGS";

	private String userPassword = "admin";

	public void validateUser(String userName, String password) {
		if (this.userName.equals(userName) && this.userPassword.equals(password)) {
			view.navigateMovieList();
		} else {
			view.showErroMessage("Invalid User name or Password");
		}
	}
}
