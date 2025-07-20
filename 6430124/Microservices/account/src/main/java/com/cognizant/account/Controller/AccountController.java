package com.cognizant.account.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import  com.cognizant.account.Model.account;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public account getAccount(@PathVariable String number){
        return new account(number,"savings", 234343);
    }
}
