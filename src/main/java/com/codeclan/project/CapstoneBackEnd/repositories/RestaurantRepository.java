package com.codeclan.project.CapstoneBackEnd.repositories;

import com.codeclan.project.CapstoneBackEnd.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
