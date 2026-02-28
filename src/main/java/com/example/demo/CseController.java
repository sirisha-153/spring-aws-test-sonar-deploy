package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
    
    @GetMapping("/cseadd")
    public String addCSE(@RequestParam int a, @RequestParam int b) {
        int result = a + b;
        return "result added by 23mh1a05i7: " + result;
    }
}