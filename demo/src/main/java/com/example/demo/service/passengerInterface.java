package com.example.demo.service;

import com.example.demo.entity.passenger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface passengerInterface {
    List<passenger> select(String username);
    boolean insertpassenger(passenger passenger);
    boolean update(passenger passenger);
    boolean remove(passenger passenger);
}
