package com.example.demo.service.Impl;

import com.example.demo.entity.passenger;
import com.example.demo.mapper.passengerMapper;
import com.example.demo.service.passengerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class passengerImpl implements passengerInterface {

    @Autowired
    passengerMapper passengerMapper;
    @Override
    public List<passenger> select(String username) {
        List<passenger> passengers =new ArrayList<>();
        passengers=passengerMapper.select(username);

        return passengers;
    }

    @Override
    public boolean insertpassenger(passenger passenger) {
        if (passengerMapper.insertpassenger(passenger)>=1){
            return true;
        }
return false;
    }

    @Override
    public boolean update(passenger passenger) {
        if (passengerMapper.update(passenger)>=1){
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(passenger passenger) {
        if (passengerMapper.remove(passenger)>=1){
            return true;
        }
        return false;
    }
}
