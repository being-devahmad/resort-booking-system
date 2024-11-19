package com.example.resort_booking_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private BookingSystem bookingSystem;

    @PostMapping("/addTour")
    public String addTour(@ModelAttribute Tour tour) {
        bookingSystem.addTour(tour);
        return "redirect:/admin.html";
    }

    @PostMapping("/removeTour")
    public String removeTour(@RequestParam String tourId, @RequestParam String apiKey) {
        bookingSystem.removeTour(tourId, apiKey);
        return "redirect:/admin.html";
    }
}