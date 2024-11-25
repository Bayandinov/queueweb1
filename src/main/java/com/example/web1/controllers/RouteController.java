package com.example.web1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouteController {

    @GetMapping("/booking")
    public String bookingPage() {
        return "booking"; // Имя HTML-файла без расширения (booking.html)
    }
}
