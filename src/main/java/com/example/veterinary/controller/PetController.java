package com.example.veterinary.controller;

import com.example.veterinary.Entity.Pet;
import com.example.veterinary.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pets")
@CrossOrigin
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping("/register-pet")
    public Pet registerPet(@RequestBody Pet pet, @RequestParam String ownerEmail) {
        return petService.savePet(pet, ownerEmail);
    }
}
