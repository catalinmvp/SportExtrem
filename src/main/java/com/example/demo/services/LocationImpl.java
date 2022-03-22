package com.example.demo.services;

import com.example.demo.domain.Location;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationImpl implements LocationService {
   private final LocationRepo locationRepo;

   List<Location> locations = new ArrayList();

    public LocationImpl(LocationRepo locationRepo) {
        this.locationRepo = locationRepo;
    }


    @Override
    public Location save(Location location) {
        locations.add(location);
        return locationRepo.save(location);
    }

    @Override
    public List<Location> findAll() {
        return locations;
    }
}
