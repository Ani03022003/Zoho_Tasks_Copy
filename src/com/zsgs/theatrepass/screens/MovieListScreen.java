package com.zsgs.theatrepass.screens;

import com.zsgs.theatrepass.BaseScreen;

class MovieListScreen extends BaseScreen {
	public void onCreate() {
		if (hasNetworkConnection()) {
			System.out.println("Listing the Movie names");
		} else {
			System.out.println("Please check internet connection");
		}
	}
}
