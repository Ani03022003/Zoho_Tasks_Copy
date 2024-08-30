package com.zsgs.theatrepass;

public abstract class BaseScreen {
	

	protected boolean hasNetworkConnection() {
		return checkConnection(); // Write logic for checking Internet access
	}
	
	private boolean checkConnection() {
		return true; // Write logic for check Internet access
	}
}
