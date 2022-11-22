package com.hungermadra.firstAPI.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping(value = "/")
    public String getPage(){
        return "Hello From Our API";
    }
}
