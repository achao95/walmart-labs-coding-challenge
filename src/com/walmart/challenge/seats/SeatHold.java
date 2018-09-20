package com.walmart.challenge.seats;

import java.util.Random;

public class SeatHold {
	
	/**
	 * Seat hold id is a randomly generated integer value.
	 * */
	private int seatHoldId;
	private Random random;
	
	private String customerEmail;
	
	public SeatHold(String customerEmail) {
		this.random = new Random();
		this.seatHoldId = random.nextInt();
		this.customerEmail = customerEmail;
	}
	
	public int getSeatHoldId() {
		return this.seatHoldId;
	}
	
	public String getCustomerEmail() {
		return this.customerEmail;
	}
	
}
