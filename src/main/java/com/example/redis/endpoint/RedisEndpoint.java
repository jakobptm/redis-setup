package com.example.redis.endpoint;

import com.example.redis.entity.Taxi;
import com.example.redis.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/taxi")
public class RedisEndpoint {

    @Autowired
    TaxiRepository repository;

    RedisEndpoint () {
    }

    @GetMapping
    public List<Taxi> getAllTaxis(){
        return (List<Taxi>) repository.findAll();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Taxi saveTaxi(){
        Taxi taxi = new Taxi(UUID.randomUUID().toString(), "Taxi", Taxi.Color.RED, 100, 4);
        return repository.save(taxi);
    }
}
