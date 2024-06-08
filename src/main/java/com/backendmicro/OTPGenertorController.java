package com.backendmicro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OTPGenertorController {


    @GetMapping
    public String demo()
    {
        return "hello world";
    }
    
}
