package com.zsgs.theatrepass.dto;

import java.util.List;

public class Ticket {
	private int ticketId;
	private int sceatNo;
	private int bookingId;
	private int totalAmount;
	private int bookedUserId;
	private int totalSeats;
	private List<Integer> seatNo;

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public List<Integer> getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(List<Integer> seatNo) {
		this.seatNo = seatNo;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getSceatNo() {
		return sceatNo;
	}

	public void setSceatNo(int sceatNo) {
		this.sceatNo = sceatNo;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public int getBookedUserId() {
		return bookedUserId;
	}

	public void setBookedUserId(int bookedUserId) {
		this.bookedUserId = bookedUserId;
	}
}
