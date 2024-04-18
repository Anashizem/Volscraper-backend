package com.example.VolScraper.Repo;

import com.example.VolScraper.Entity.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface FlightRepository extends MongoRepository<Flight, String> {}
