package com.deepak.carrental.carrentalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.carrental.carrentalproject.model.Carrental;

@Repository
public interface Carrentalrepository extends JpaRepository<Carrental,Long> {

}
