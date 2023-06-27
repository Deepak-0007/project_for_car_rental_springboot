package com.deepak.carrental.carrentalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.carrental.carrentalproject.model.Carrental;
import com.deepak.carrental.carrentalproject.repository.Carrentalrepository;
@CrossOrigin(origins="http://localhost:4200")
@RestController

@RequestMapping("/api/v1/")
public class CarrentalController {
	@Autowired
	Carrentalrepository car;
	@PostMapping("/cars")
	public void saveBook(@RequestBody Carrental car1) {
	car.save(car1);
	}
	@GetMapping("/cars")
	public List<Carrental> getdetails(){
		return car.findAll();
	}
	@GetMapping("/cars/{id}")
	public Carrental  getByCarrental(@PathVariable("id")Long id){
		return car.findById(id).get();
	}
	@PutMapping("/cars/{id}")
	public String UpdatePerson(@PathVariable("id")Long id,@PathVariable("name")String rental_name) {
	Carrental c1 = car.findById(id).get();
	c1.setRental_name(rental_name);
	car.save(c1);
	return "Updated "+id+" with "+rental_name;

	}
	@DeleteMapping("/cars/{id}")
	public String delteCarrental(@PathVariable("id")Long id) {
	car.deleteById(id);
	return "Deleted car with id :"+id;

	}
	
}
