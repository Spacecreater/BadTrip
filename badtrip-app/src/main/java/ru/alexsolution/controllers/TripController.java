package ru.alexsolution.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alexsolution.entity.Trip;
import ru.alexsolution.services.TripService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trip")
@RequiredArgsConstructor
public class TripController {

    private final TripService service;

    @GetMapping
    private List<Trip> getAllTrips(){
        return service.getAllTrips();
    }

}
