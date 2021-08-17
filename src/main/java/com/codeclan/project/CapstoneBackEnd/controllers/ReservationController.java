package com.codeclan.project.CapstoneBackEnd.controllers;


import com.codeclan.project.CapstoneBackEnd.models.Reservation;
import com.codeclan.project.CapstoneBackEnd.repositories.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReservationController {

    @Autowired
    ReservationRepository reservationRepository;

    @GetMapping(value = "/reservations")
    public ResponseEntity<List<Reservation>> getAllReservations(){
        return new ResponseEntity<>(reservationRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "reservations/{id}")
    public ResponseEntity getReservationById(@PathVariable Long id){
        return new ResponseEntity(reservationRepository.findById(id), HttpStatus.OK);
    }
}
