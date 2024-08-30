package com.zsgs.theatrepass;

import com.zsgs.theatrepass.screens.LoginScreen;

public class TheatrePass { //Application Class : Starting point of an application
	
	private String appName = "Theatre Pass Application";

	private String appVersion = "0.0.1";
	
	public static void main(String arg[]) {
		System.out.println();
		LoginScreen loginScreen = new LoginScreen("ZSGS");
		loginScreen.onCreate(); //Launching the first screen as an instance(login screen)
	}
}
