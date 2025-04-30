package com.example.veterinary.repository;

import com.example.veterinary.Entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByRecipientTypeOrderBySentAtDesc(String recipientType);
}
