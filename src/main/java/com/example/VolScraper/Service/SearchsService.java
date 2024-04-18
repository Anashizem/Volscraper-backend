package com.example.VolScraper.Service;

import com.example.VolScraper.Entity.Searchs;
import com.example.VolScraper.Repo.SearchsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SearchsService {
    private final SearchsRepository searchsRepository;
    @Autowired
    public SearchsService(SearchsRepository searchsRepository) {
        this.searchsRepository = searchsRepository;
    }

    public List<Searchs> getAllSearchs() {
        return searchsRepository.findAll();
    }

    public void saveSearchs(Searchs Searchs) {
        searchsRepository.save(Searchs);
    }
}
