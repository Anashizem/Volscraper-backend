package com.example.VolScraper.Controller;

import com.example.VolScraper.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.VolScraper.Service.UserService;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService flightService) {
        this.userService = flightService;
    }

    @GetMapping
    public List<User> getAllFlights() {
        return userService.getAllUser();
    }

    @PostMapping
    public void addFlight(@RequestBody User user) {
        userService.saveUser(user);
    }
}
