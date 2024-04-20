package com.example.VolScraper.Controller;
import java.util.List;
import com.example.VolScraper.Entity.Flight;
import com.example.VolScraper.Service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/flights")
public class FlightController {

    private final FlightService FlightService;
    @Autowired
    public FlightController(FlightService FlightService) {
        this.FlightService = FlightService;
    }
    @GetMapping
    public List<Flight> getLatestVolScrapes() {
        return FlightService.getLatestVolScrapes();
    }



}