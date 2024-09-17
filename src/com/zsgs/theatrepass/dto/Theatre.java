package com.zsgs.theatrepass.dto;

import java.util.List;

public class Theatre {
	private int theatreId;
	private String name;
	private String address;
	private long locLat;
	private long loclong;
	private String noOfScreens;
	private List<Screen> noOfSeatsInScreens;

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getLocLat() {
		return locLat;
	}

	public void setLocLat(long locLat) {
		this.locLat = locLat;
	}

	public long getLoclong() {
		return loclong;
	}

	public void setLoclong(long loclong) {
		this.loclong = loclong;
	}

	public String getNoOfScreens() {
		return noOfScreens;
	}

	public void setNoOfScreens(String noOfScreens) {
		this.noOfScreens = noOfScreens;
	}

	public List<Screen> getNoOfSeatsInScreens() {
		return noOfSeatsInScreens;
	}

	public void setNoOfSeatsInScreens(List<Screen> noOfSeatsInScreens) {
		this.noOfSeatsInScreens = noOfSeatsInScreens;
	}
}
