package org.example.securityyy.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactRestController {
    @GetMapping("/contact")
    public String getContactDetails() {
        return "Here are the contactdetails from db";
    }

}
