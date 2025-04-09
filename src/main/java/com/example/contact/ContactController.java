package com.example.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class ContactController {

    @Autowired
    private EmailService emailService;

 @PostMapping("/contact")
public String handleContactForm(@ModelAttribute ContactForm form) {
    emailService.sendMail(form);
    return "redirect:/thank-you.html"; // Load thank-you.html from src/main/resources/static
}

}
