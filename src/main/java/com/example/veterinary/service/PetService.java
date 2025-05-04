package com.example.veterinary.service;

import com.example.veterinary.Entity.Pet;
import com.example.veterinary.Entity.UserProfile;
import com.example.veterinary.repository.PetRepository;
import com.example.veterinary.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;

    public Pet savePet(Pet pet, String ownerEmail) {
        UserProfile userProfile = userProfileRepository.findByEmail(ownerEmail)
                .orElseThrow(() -> new RuntimeException("User not found with email: " + ownerEmail));
        pet.setUserProfile(userProfile);
        return petRepository.save(pet);
    }
}