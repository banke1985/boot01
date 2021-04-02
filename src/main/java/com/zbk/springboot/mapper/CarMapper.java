package com.zbk.springboot.mapper;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.zbk.springboot.entity.Car;

@Repository
public interface CarMapper {
	
	Collection<Car> All();
	
	Car Single(String id);

}
