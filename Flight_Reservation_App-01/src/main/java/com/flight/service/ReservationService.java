package com.flight.service;

import java.util.Optional;

import com.flight.dto.ReservationRequest;
import com.flight.entities.Reservation;

public interface ReservationService {
	
	Reservation bookFlight(ReservationRequest request);

	Optional<Reservation> findByID(long id);

}
