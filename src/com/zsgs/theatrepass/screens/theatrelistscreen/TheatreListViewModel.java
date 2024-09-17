package com.zsgs.theatrepass.screens.theatrelistscreen;

import com.zsgs.theatrepass.datalayer.TheatrePassRepository;
import com.zsgs.theatrepass.dto.User;

class TheatreListViewModel {

	private TheatreListScreen view;

	public TheatreListViewModel(TheatreListScreen theatreListScreen) {
		view = theatreListScreen;
	}
	
	public void onCreate() {
		User currentUser = TheatrePassRepository.getInstance().loggedInuserDetail();
	}

}
