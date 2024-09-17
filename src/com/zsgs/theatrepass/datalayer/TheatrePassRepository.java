package com.zsgs.theatrepass.datalayer;

import com.zsgs.theatrepass.dto.User;

public class TheatrePassRepository {
	
	private User loggedInuser;
	private static TheatrePassRepository repository;
	
	private TheatrePassRepository() {
		
	}
	
	public static TheatrePassRepository getInstance() {
		
		if(repository == null) {
			repository = new TheatrePassRepository();
		}
		
		return repository;
	}

	public User validate(String userName, String password) {
		if (userName.equals("ZSGS") && password.equals("admin")) {
			User user = new User();
			user.setName(userName);
			user.setEmailId("zsgs@zsgs.in");
			user.setPhoneNo(1234567890);
			//SQL Query 
			loggedInuser = user;
			return user;
		}
		return null;
	}
	
	public User loggedInuserDetail() {
		return loggedInuser;
	}
}
