package com.example.VolScraper.Service;
import com.example.VolScraper.Entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.VolScraper.Repo.FlightRepository;

import java.util.List;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public void saveFlight(Flight flight) {
        flightRepository.save(flight);
    }
}
