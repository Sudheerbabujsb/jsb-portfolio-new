package com.example.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@RestController
@CrossOrigin
public class ContactController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/contact")
    public ResponseEntity<String> handleContact(@RequestBody ContactForm form) {
        emailService.sendMail(form);
        return ResponseEntity.ok("Success");
    }
}

