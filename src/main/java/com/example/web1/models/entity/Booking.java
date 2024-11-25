package com.example.web1.models.entity;

import jakarta.persistence.*; // Или javax.persistence.*
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date_time")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime dateTime;
    @Column(name = "purpose")
    private String purpose;

    public Booking(){}

    public Booking(String purpose, LocalDateTime  dataTime) {
        this.purpose = purpose;
        this.dateTime = dataTime;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public LocalDateTime  getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime  dateTime) {
        this.dateTime = dateTime;
    }
}
