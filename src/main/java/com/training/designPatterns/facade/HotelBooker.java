package com.training.designPatterns.facade;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class HotelBooker {
	public List<Hotel> getHotelFor(LocalDateTime from, LocalDateTime to) {
		// returns hotels available in the particular date range
		return Collections.emptyList();
	}
}
