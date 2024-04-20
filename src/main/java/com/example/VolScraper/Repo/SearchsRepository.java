package com.example.VolScraper.Repo;

import com.example.VolScraper.Entity.Searchs;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface SearchsRepository extends MongoRepository<Searchs, String> {
    Searchs findTopByOrderByIdDesc();

}
