package com.training.designPatterns.facade;

import java.time.LocalDateTime;
import java.util.List;

public class TravelFacade {

	private HotelBooker hotelBooker;
	private FlightBooker flightBooker;

	public void getFlightsAndHotels(LocalDateTime from, LocalDateTime to) {
		List<Flight> flights = flightBooker.getFlightsFor(from, to);
		List<Hotel> hotels = hotelBooker.getHotelFor(from, to);
		// process and return
	}
}