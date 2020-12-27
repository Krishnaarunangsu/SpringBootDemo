/**
 * 
 */
package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.model.City;
import com.learning.service.ICityService;

/**
 * @author arunangsusahunarayan7
 *
 */
@RestController
public class MyController {

	@Autowired
    private ICityService cityService;

    @GetMapping(value = "/cities")
    public List<City> getCities() {

        List<City> cities = cityService.findAll();

        return cities;
    }
}
