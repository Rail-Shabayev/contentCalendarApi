package com.rail.calendar.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController("/value")
public class HomeController {

    @GetMapping("/")
    public String home() {
        return null;
    }
}
