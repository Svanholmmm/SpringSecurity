package org.example.securityyy.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
    @GetMapping("/myAccount")
    public String getAccountDetails() {
        return "Here are the accountdetails from db";
    }
}

