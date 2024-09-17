package com.zsgs.theatrepass.dto;

import java.util.List;

public class Screen {
	private int screenId;
	private int capacity;
	private int seatRow;
	private int seatColum;
	private int noOfShows;
	private List<Show> shows;

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSeatRow() {
		return seatRow;
	}

	public void setSeatRow(int seatRow) {
		this.seatRow = seatRow;
	}

	public int getSeatColum() {
		return seatColum;
	}

	public void setSeatColum(int seatColum) {
		this.seatColum = seatColum;
	}

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public List<Show> getShows() {
		return shows;
	}

	public void setShows(List<Show> shows) {
		this.shows = shows;
	}
}
