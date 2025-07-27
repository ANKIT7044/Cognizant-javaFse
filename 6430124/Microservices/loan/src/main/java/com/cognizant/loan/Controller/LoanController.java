package com.cognizant.loan.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.loan.Model.Loan;
@RestController
public class LoanController {

    @GetMapping("/loans/{number}")
    public Loan getLoanAccount(@PathVariable String number){
        return  new Loan(number,400000,3258,"Car",18);
    }

}
