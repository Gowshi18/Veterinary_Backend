package com.example.veterinary.controller;

import com.example.veterinary.dto.MessageDTO;
import com.example.veterinary.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // Change this to your frontend URL
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/messages")
    public List<MessageDTO> getOwnerMessages() {
        return messageService.getMessagesForRecipient("OWNER");
    }

    @GetMapping("/vet-messages")
    public List<MessageDTO> getVetMessages() {
        return messageService.getMessagesForRecipient("VET");
    }
}
