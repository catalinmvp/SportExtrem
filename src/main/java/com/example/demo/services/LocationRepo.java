package com.example.demo.services;

import com.example.demo.domain.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepo extends CrudRepository<Location, Long> {
    Location findLocationByCountry(String country);
}
