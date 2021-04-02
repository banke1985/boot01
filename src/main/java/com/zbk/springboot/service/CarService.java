package com.zbk.springboot.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zbk.springboot.entity.Car;
import com.zbk.springboot.mapper.CarMapper;

@Service
public class CarService {
	
	@Autowired
	CarMapper carMapper;
	
	public Collection<Car> FindAll(){
		return carMapper.All();
	}
	
	public Car FindCar(String id) {
		return carMapper.Single(id);
	}

}
