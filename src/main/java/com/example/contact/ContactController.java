package com.example.contact;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ContactController {

    @PostMapping("/contact")
    public String handleContactForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String subject,
            @RequestParam String message,
            Model model
    ) {
        // You can add attributes to the model if you want to pass data to the thank-you page
        model.addAttribute("userName", name);

        // Log or process the form data here
        System.out.println("Form submitted by: " + name);
        System.out.println("Email: " + email);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + message);

        // Redirect to thank-you page
        return "redirect:/thank-you.html";
    }
}
