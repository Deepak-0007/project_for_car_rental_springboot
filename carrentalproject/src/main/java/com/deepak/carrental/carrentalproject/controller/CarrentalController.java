package com.deepak.carrental.carrentalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.carrental.carrentalproject.model.Carrental;
import com.deepak.carrental.carrentalproject.repository.Carrentalrepository;

@RestController
@RequestMapping("/cars")
public class CarrentalController {
	@Autowired
	Carrentalrepository car;
	@PostMapping("/save")
	public void saveBook(@RequestBody Carrental car1) {
	car.save(car1);
	}
	@GetMapping("/details")
	public List<Carrental> getdetails(){
		return car.findAll();
	}

}
