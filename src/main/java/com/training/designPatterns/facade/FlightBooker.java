package com.training.designPatterns.facade;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class FlightBooker{ 
	public List<Flight> getFlightsFor(LocalDateTime from, LocalDateTime to)   {  
		//returns flights available in the particular date range
		return Collections.emptyList();
	}
}