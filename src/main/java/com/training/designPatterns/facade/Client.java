package com.training.designPatterns.facade;

import java.time.LocalDateTime;

public class Client {
	public static void main(String[] args) {
		TravelFacade facade = new TravelFacade();
		facade.getFlightsAndHotels(LocalDateTime.of(2018, 3, 10, 5, 20), LocalDateTime.of(2018, 3, 30, 5, 20));
	}
}