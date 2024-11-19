package com.example.resort_booking_system;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class BookingSystem {
 
	
	 private static final String ADMIN_API_KEY = "admin123";
	  private Map < String, Tour > tours;
	  private Map < String, Reservation > reservations;
	  private Set < String > validApiKeys;

	  public BookingSystem() {
	    this.tours = new ConcurrentHashMap < > ();
	    this.reservations = new ConcurrentHashMap < > ();
	    this.validApiKeys = new HashSet < > ();
	    validApiKeys.add(ADMIN_API_KEY);
	    initializeSampleTours();
	  }

	  private void initializeSampleTours() {
	    addTour(new Tour("T1", "City Tour", "Explore the city highlights", 99.99,
	      LocalDate.now().plusDays(7), 20));
	    addTour(new Tour("T2", "Mountain Adventure", "Hiking in the mountains", 149.99,
	      LocalDate.now().plusDays(14), 15));
	  }

	  public List < Tour > getAllTours() {
	    return new ArrayList < > (tours.values());
	  }

	  public Optional < Tour > getTour(String tourId) {
	    return Optional.ofNullable(tours.get(tourId));
	  }

	  public String createReservation(String guestName, LocalDate arrival, LocalDate departure, String tourId) {
	    Tour tour = tours.get(tourId);
	    if (tour == null || tour.getBooked() >= tour.getCapacity()) {
	      throw new IllegalStateException("Tour not available");
	    }

	    String reference = generateReference();
	    Reservation reservation = new Reservation(reference, guestName, arrival, departure, tourId);
	    reservations.put(reference, reservation);
	    tour.incrementBooked();
	    return reference;
	  }

	  public void addTour(Tour tour) {
	    tours.put(tour.getId(), tour);
	  }

	  public void removeTour(String tourId, String apiKey) {
	    validateAdminAccess(apiKey);
	    tours.remove(tourId);
	  }

	  public List < Reservation > getAllReservations(String apiKey) {
	    validateAdminAccess(apiKey);
	    return new ArrayList < > (reservations.values());
	  }

	  private void validateAdminAccess(String apiKey) {
	    if (!validApiKeys.contains(apiKey)) {
	      throw new SecurityException("Invalid API key");
	    }
	  }

	  private String generateReference() {
	    return "RES" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
	  }
	
}