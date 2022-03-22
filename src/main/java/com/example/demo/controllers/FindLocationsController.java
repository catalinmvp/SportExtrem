package com.example.demo.controllers;


import com.example.demo.services.LocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/findlocations")
public class FindLocationsController {

    @Autowired
    private final LocationService locationService;

    public FindLocationsController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public String find(Model model){
        model.addAttribute("locations",locationService.findAll());
        return "FindLocations";
    }





}
