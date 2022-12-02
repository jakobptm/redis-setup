package com.example.redis.repository;

import com.example.redis.entity.Taxi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxiRepository extends CrudRepository<Taxi, String> {
}
