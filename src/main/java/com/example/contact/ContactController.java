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
    public String handleContactForm(@ModelAttribute ContactForm form, Model model) {
        emailService.sendMail(form);
        model.addAttribute("name", form.getName());
        return "thank-you"; // This will load thank-you.html from src/main/resources/templates if using Thymeleaf
    }
}
