package com.example.VolScraper.Repo;

import com.example.VolScraper.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {}
