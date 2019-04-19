package org.ebook.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String getUserView(){
        return "user test";
    }
}
