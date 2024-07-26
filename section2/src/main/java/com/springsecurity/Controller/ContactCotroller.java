package com.springsecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactCotroller {

    @GetMapping("/contacts")
    public String getContactDetails(){
        return "Here are the Contact details from the DB";
    }
}
