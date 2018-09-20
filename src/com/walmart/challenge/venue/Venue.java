package com.walmart.challenge.venue;

import com.walmart.challenge.ticket.service.TicketService;
import com.walmart.challenge.ticket.service.TicketServiceImpl;

public class Venue {
	
	private TicketService ticketService;
	private int totalSeats;
	
	public Venue(int totalSeats) {
		this.ticketService = new TicketServiceImpl();
		this.totalSeats = totalSeats;
	}
	
	
}
