package com.zsgs.theatrepass.screens.theatrelistscreen;

import com.zsgs.theatrepass.BaseScreen;

public class TheatreListScreen extends BaseScreen {
	private TheatreListViewModel viewModel;
	
	public TheatreListScreen(){
		viewModel = new TheatreListViewModel(this);
	}

	public void onCreate() {
		
	}

}
