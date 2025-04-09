package com.example.contact;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<String> handleContactForm(@RequestBody ContactForm form) {
        emailService.sendMail(form);
        return ResponseEntity.ok("Form submitted successfully!");
    }
}
