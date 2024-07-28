package com.springsecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansCotroller {

    @GetMapping("/myLoans")
    public String getLoansDetails(){
        return "Here are the Loans details from the DB";
    }
}
