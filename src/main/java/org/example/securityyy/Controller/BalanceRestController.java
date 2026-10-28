package org.example.securityyy.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceRestController {
    @GetMapping("/myBalance")
    public String getBalanceDetails() {
        return "Here are the balancedetails from db";
    }

}
