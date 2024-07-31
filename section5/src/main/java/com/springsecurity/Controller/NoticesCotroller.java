package com.springsecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesCotroller {

    @GetMapping("/notices")
    public String getNotices(){
        return "Here are the Notices details from the DB";
    }
}
