package com.zsgs.theatrepass.screens.login;

import com.zsgs.theatrepass.datalayer.TheatrePassRepository;
import com.zsgs.theatrepass.dto.User;

class LoginViewModel {

	private LoginScreen view;

	public LoginViewModel(LoginScreen screen) {
		view = screen;
	}

	public void validateUser(String userName, String password) {
		User loggedInUser = TheatrePassRepository.getInstance().validate(userName,password);
		if (loggedInUser!=null) {
			view.navigateMovieList(loggedInUser);
		} else {
			view.showErroMessage("Invalid User name or Password");
		}
	}
}
