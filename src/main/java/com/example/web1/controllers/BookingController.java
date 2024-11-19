package com.example.web1.controllers;

import com.example.web1.models.Booking;
import com.example.web1.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import java.time.LocalDateTime;

import java.util.List;

@Controller
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/create")
    public ResponseEntity<String> createBooking(@RequestBody Booking booking) {
        // Здесь вы можете сохранить бронирование в базе данных через сервис
        System.out.println("Бронирование создано: " + booking);
        return ResponseEntity.ok("Бронирование успешно создано");
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/booking")
    public String bookingPage() {
        return "booking"; // Имя HTML-файла без расширения (booking.html)
    }
}

