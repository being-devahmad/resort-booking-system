# Resort Booking System using SPRING BOOT

This project is a **Resort Booking System** built using **Spring Boot**. It features an admin panel for managing tours and a user interface where customers can browse and reserve bookings.

---

## Features  

### Admin Panel  
- Add new tours with details such as destination, price, and availability.  
- Remove tours to keep the list up to date.  
- Manage tour availability status.  

### User Interface  
- View a list of available tours with comprehensive details.  
- Search for tours based on criteria such as destination or date.  
- Reserve bookings for the desired tours.

---

## Technologies Used  
- **Spring Boot**: Backend framework for managing the application logic.  
- **Spring Data JPA**: For database interactions.  
- **Thymeleaf**: Templating engine for rendering dynamic content.  
- **H2 Database**: For quick setup and testing (can be replaced with MySQL or PostgreSQL).  
- **Bootstrap**: For responsive and attractive UI design.  
- **Maven**: Build tool for dependency management.  

---

## Installation and Setup  

1. **Clone the Repository**:  
   Clone the project from GitHub using the following command:  
   ```bash
   git clone https://github.com/your-username/resort-booking-system.git
   cd resort-booking-system



2. **Configure the database**:  
   Update the application.properties file with your database credentials
   Example for H2 Database (default):
   
   ```bash
   
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driver-class-name=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
   
 

  3. **Run the application**:  
   Update the application.properties file with your database credentials
   Example for H2 Database (default):
   
   ```bash
   
     mvn spring-boot:run
   

