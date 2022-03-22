package com.example.demo.services;

import com.example.demo.domain.Location;

import java.util.List;


public interface LocationService {
    Location save(Location location);
    List<Location> findAll();
}
