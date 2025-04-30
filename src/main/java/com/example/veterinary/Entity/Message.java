package com.example.veterinary.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String senderName;
    private String recipientType; // "VET" or "OWNER"
    private String subject;

    @Column(length = 1000)
    private String body;

    private LocalDateTime sentAt;
}

