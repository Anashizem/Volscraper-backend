package com.example.VolScraper.Controller;
import com.example.VolScraper.Entity.Searchs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.VolScraper.Service.SearchsService;
import java.util.List;

@RestController
@RequestMapping("/searchs")
public class SearchsController {
    private SearchsService searchsService;
    @Autowired
    public SearchsController(SearchsService searchsService) {
        this.searchsService = searchsService;
    }

    @GetMapping
    public List<Searchs> getAllFlights() {
        return searchsService.getAllSearchs();
    }

    @PostMapping
    public void addFlight(@RequestBody Searchs Searchs) {
        searchsService.saveSearchs(Searchs);
    }

}
