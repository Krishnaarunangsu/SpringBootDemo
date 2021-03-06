/**
 * 
 */
package com.learning.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.model.City;
import com.learning.service.ICityService;

/**
 * @author arunangsusahunarayan7
 *
 */
@Service
public class CityService implements ICityService {

	@Override
	public List<City> findAll() {
		// TODO Auto-generated method stub
		List<City> cities = new ArrayList<City>();
		//var cities = new ArrayList<City>();
		
		cities.add(new City(1L, "Bratislava", 432000));
        cities.add(new City(2L, "Budapest", 1759000));
        cities.add(new City(3L, "Prague", 1280000));
        cities.add(new City(4L, "Warsaw", 1748000));
        cities.add(new City(5L, "Los Angeles", 3971000));
        cities.add(new City(6L, "New York", 8550000));
        cities.add(new City(7L, "Edinburgh", 464000));
        cities.add(new City(8L, "Berlin", 3671000));
		
        return cities;
	}

}
