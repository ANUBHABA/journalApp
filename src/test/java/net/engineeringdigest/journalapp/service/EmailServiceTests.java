package net.engineeringdigest.journalapp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {

    @Autowired
    private EmailService emailService;

    @Test
    void testSendMail(){
        emailService.sendEmail(
                "anubhaba74@gmail.com",
                "Testing Java mail sender",
                "Hello World!"
        );
    }
}
