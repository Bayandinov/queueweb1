package com.example.web1.services;

import com.example.web1.models.entity.Booking;
import com.example.web1.models.request.BookingRequest;
import com.example.web1.repositories.BookingRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Transactional
    public String saveBooking(BookingRequest bookingRequest) {
        Booking booking = new Booking(bookingRequest.getPurpose(), bookingRequest.getDataTime());
        if (bookingRepository.existsByDateTime (booking.getDateTime())) {
            throw new IllegalArgumentException("На выбранное время уже есть бронирование!");
        }
        System.out.println(bookingRequest.getPurpose());
        System.out.println(bookingRequest.getDataTime());
        bookingRepository.save(booking);
        return "Забронировано !!!";
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

//    public Booking createBooking(Booking booking) {
//        // Проверка на дублирование бронирования
//        if (bookingRepository.existsByDateTime (booking.getDateTime().toLocalDateTime())) {
//            throw new IllegalArgumentException("На выбранное время уже есть бронирование!");
//        }
//        // Сохраняем бронирование, если оно уникально
//        return bookingRepository.save(booking);
//    }
}
