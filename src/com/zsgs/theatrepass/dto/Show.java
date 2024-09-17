package com.zsgs.theatrepass.dto;

import java.util.List;

public class Show {
	private int screenId;
	private int showTiming;
	private int movieId;
	private int ticketFare;
	private List<Ticket> bookedTickets;

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getShowTiming() {
		return showTiming;
	}

	public void setShowTiming(int showTiming) {
		this.showTiming = showTiming;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public List<Ticket> getBookedTickets() {
		return bookedTickets;
	}

	public void setBookedTickets(List<Ticket> bookedTickets) {
		this.bookedTickets = bookedTickets;
	}

	public int getTicketFare() {
		return ticketFare;
	}

	public void setTicketFare(int ticketFare) {
		this.ticketFare = ticketFare;
	}
}
