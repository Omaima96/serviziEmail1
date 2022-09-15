package co.develhope.serviziEmail1.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
    public class EmailService {

        @Autowired
        private JavaMailSender emailSender;


        public void sendTo(String email, String title, String text) {
            SimpleMailMessage sms = new SimpleMailMessage();
            sms.setTo(email);
            sms.setFrom("omaimam1396@gmail.com");
            sms.setSubject(title);
            sms.setText(text);
            emailSender.send(sms);
        }
    }

