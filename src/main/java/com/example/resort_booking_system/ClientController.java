package com.example.resort_booking_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private BookingSystem bookingSystem;

    @PostMapping("/makeReservation")
    public String makeReservation(@ModelAttribute Reservation reservation) {
        bookingSystem.createReservation(reservation.getGuestName(), reservation.getArrival(), reservation.getDeparture(), reservation.getTourId());
        return "redirect:/client.html";
    }
}