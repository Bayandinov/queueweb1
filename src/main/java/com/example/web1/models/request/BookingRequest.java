package com.example.web1.models.request;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookingRequest {
    private String purpose;
    private LocalDateTime  dataTime;

    public BookingRequest(String purpose, LocalDateTime  dateTime) {
        this.purpose = purpose;
        this.dataTime = dateTime;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public LocalDateTime  getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime  dataTime) {
        this.dataTime = dataTime;
    }
}
