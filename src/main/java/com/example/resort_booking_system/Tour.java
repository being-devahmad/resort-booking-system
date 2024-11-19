package com.example.resort_booking_system;

//Tour.java
import java.time.LocalDate;

public class Tour {
private String id;
private String name;
private String description;
private double price;
private LocalDate date;
private int capacity;
private int booked;

public Tour(String id, String name, String description, double price, LocalDate date, int capacity) {
 this.id = id;
 this.name = name;
 this.description = description;
 this.price = price;
 this.date = date;
 this.capacity = capacity;
 this.booked = 0;
}

public String getId() {
 return id;
}
public String getName() {
 return name;
}
public String getDescription() {
 return description;
}
public double getPrice() {
 return price;
}
public LocalDate getDate() {
 return date;
}
public int getCapacity() {
 return capacity;
}
public int getBooked() {
 return booked;
}
public void incrementBooked() {
 this.booked++;
}
}