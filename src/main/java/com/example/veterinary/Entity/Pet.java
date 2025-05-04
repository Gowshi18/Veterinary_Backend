package com.example.veterinary.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String petName;
    private String petType;
    private String breed;
    private String dob;
    private String gender;
    private double weight;
    private String color;

    @Lob
    @Column(length = 100000)
    private String petImage;

    private String medicalConditions;
    private String allergies;
    private boolean vaccinated;
    private boolean neutered;

    // 👇 Many pets to one user profile
    @ManyToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;
}