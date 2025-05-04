package com.example.veterinary.repository;

import com.example.veterinary.Entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}