package com.example.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(ContactForm form) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("sudheerbabujsb@gmail.com");
        message.setSubject("New Contact Form Submission: " + form.getSubject());
        message.setText("Name: " + form.getName() + "\nEmail: " + form.getEmail() + "\nMessage:\n" + form.getMessage());

        mailSender.send(message);
    }
}
