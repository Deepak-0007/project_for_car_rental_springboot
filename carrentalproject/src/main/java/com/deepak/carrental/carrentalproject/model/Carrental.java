package com.deepak.carrental.carrentalproject.model;

import jakarta.persistence.*;

@Entity
@Table(name="carrental")

public class Carrental {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Carrental_rent")
	private long id;
	private String car_name;
	private int rent;
	private String rental_name;
	private double time;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public String getRental_name() {
		return rental_name;
	}
	public void setRental_name(String rental_name) {
		this.rental_name = rental_name;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public Carrental(String car_name, int rent, String rental_name, double time) {
		super();
		this.car_name = car_name;
		this.rent = rent;
		this.rental_name = rental_name;
		this.time = time;
	}
	public Carrental() {
		
	}
}
