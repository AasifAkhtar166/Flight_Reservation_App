package com.flight.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight.entities.Reservation;
import com.flight.service.ReservationService;

@Controller
public class BookingController {
	
	@Autowired
	ReservationService reservationService;
	
	@RequestMapping("/bookingDetails")
	public String BookController() {
		return "BookingDetails";
	}
	
	@RequestMapping("/bookingSearch")
	public String bookingSearch(@RequestParam(name = "FLIGHT_ID", required = false, defaultValue = "-1")long id, ModelMap model) {
		try {
	        // Additional custom validation, if needed
	        if (id <= 0) {
	            model.addAttribute("msg", "Invalid or missing Booking ID");
	            return "BookingDetails";
	        }
	        Optional<Reservation> findCheckIn = reservationService.findByID(id);
	        
	        if (findCheckIn.isPresent()) {
	        	Reservation reservation = findCheckIn.get();
	        	model.addAttribute("reservation", reservation);
	            return "Booking";
	        }else{
	        	model.addAttribute("msg", "Booking ID Not Found: "+id);
	        	return "BookingDetails";
	        }
		} catch (Exception e) {
			e.printStackTrace();
			return "BookingDetails";
	    }
		

	}
	
	@RequestMapping("/navBar")
	public String navBar() {
		return"navBar";
	}
	

}
