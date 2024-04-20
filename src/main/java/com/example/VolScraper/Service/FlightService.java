package com.example.VolScraper.Service;
import com.example.VolScraper.Entity.Flight;
import com.example.VolScraper.Entity.Searchs;
import com.example.VolScraper.Repo.SearchsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.VolScraper.Repo.FlightRepository;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    private final FlightRepository flightRepository;
    @Autowired
    private SearchsRepository searchsRepository ;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public Iterable<Flight> listAll() {
        return  this.flightRepository.findAll();
    }
    public List<Flight> getLatestVolScrapes() {
        Searchs lastDemande = searchsRepository.findTopByOrderByIdDesc();
        if (lastDemande != null) {
            return flightRepository.findByDemande(lastDemande.getId());
        }
        return null;
    }

}
