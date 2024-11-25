package com.example.web1.controllers;

import com.example.web1.models.entity.Booking;
import com.example.web1.models.request.BookingRequest;
import com.example.web1.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;


//    @GetMapping("/log/action-logs")
//    public MessageResponse<List<ActionLog>> getActionLogs(
//            @RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
//            @RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) throws IOException {
//
//        return MessageResponse.of(actionLogService.getActionLogs(startDate, endDate));
//    }

    @PostMapping("/create")
    public Booking createBooking(@RequestBody BookingRequest bookingRequest) {
        // Логика сохранения бронирования
        return bookingService.saveBooking(bookingRequest);
    }



//        try {
//            Booking savedBooking = bookingService.createBooking(booking);
//            return ResponseEntity.ok(savedBooking);
//        } catch (IllegalArgumentException e) {
//            new RuntimeException("adfdasf");
//        }


        // Здесь вы можете сохранить бронирование в базе данных через сервис
       // System.out.println("Бронирование создано: " + booking);
        //return ResponseEntity.ok("Бронирование успешно создано");


    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

//    @GetMapping("/booking")
//    public String bookingPage() {
//        return "booking"; // Имя HTML-файла без расширения (booking.html)
//    }
}

