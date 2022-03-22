package com.example.demo.controllers;

import com.example.demo.domain.Location;
import com.example.demo.services.LocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public String addLocation(){
        return "Location";
    }

    @PostMapping("/locational")
    public String Register(@ModelAttribute("location") Location location){
        Long i = 1L;
        System.out.println(location);
        location.setId(i);
        i++;
        locationService.save(location);
        System.out.println("Process succeded!");
        return "welcome";
    }
}
