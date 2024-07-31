package com.springsecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceCotroller {

    @GetMapping("/myBalance")
    public String getBalanceDetails(){
        return "Here are the Balance details from the DB";
    }
}
