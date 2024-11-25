package com.example.web1.repositories;

import com.example.web1.models.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    boolean existsByDateTime(LocalDateTime dateTime);
}

