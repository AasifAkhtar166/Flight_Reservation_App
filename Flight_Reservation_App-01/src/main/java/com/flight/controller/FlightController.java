package com.flight.controller;

import java.util.Date;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight.entities.Flight;
import com.flight.repositories.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepo;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from")String from, @RequestParam("to")String to,
			@RequestParam("departureDate")@DateTimeFormat(pattern="dd-MM-yyyy")Date depatureDate, ModelMap model) {
		
		List<Flight> findFlights = flightRepo.findFlights(from, to, depatureDate);
		model.addAttribute("msg", findFlights);
		return "DisplayFlight";
	}
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId")Long flightId, ModelMap model) {
		
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		model.addAttribute("flight", flight);
		return "ShowReservation";
	}

}
