package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calc {
    @GetMapping("/sum/{a}/{b}")
    public  Integer sumOfTwo(@PathVariable Integer a, @PathVariable Integer b)
    {
        return  a+b;
    }
    @GetMapping("/min/{a}/{b}")
    public  Integer minOfTwo(@PathVariable Integer a, @PathVariable Integer b)
    {
        return  a-b;
    }
}
