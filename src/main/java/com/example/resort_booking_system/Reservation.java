package com.example.resort_booking_system;

import java.time.LocalDate;
import java.util.Objects;

public class Reservation {
    private final String reference;
    private final String guestName;
    private final LocalDate arrival;
    private final LocalDate departure;
    private final String tourId;
    private final LocalDate bookingDate;

    public Reservation(String reference, String guestName, LocalDate arrival, LocalDate departure, String tourId) {
        this.reference = reference;
        this.guestName = guestName;
        this.arrival = arrival;
        this.departure = departure;
        this.tourId = tourId;
        this.bookingDate = LocalDate.now();
    }

    public String getReference() {
        return reference;
    }

    public String getGuestName() {
        return guestName;
    }

    public LocalDate getArrival() {
        return arrival;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    public String getTourId() {
        return tourId;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(reference, that.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reference='" + reference + '\'' +
                ", guestName='" + guestName + '\'' +
                ", arrival=" + arrival +
                ", departure=" + departure +
                ", tourId='" + tourId + '\'' +
                ", bookingDate=" + bookingDate +
                '}';
    }
}