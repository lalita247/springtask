package com.example.example1.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class Statecontroller {

        @GetMapping("get")
        public String getmap() {
            return "getmapping is working";
        }
    @PutMapping("put")
    public String putmap() {
        return "putmapping is working";
    }
    @PostMapping("post")
    public String postmap() {
        return "postmapping is working";
    }

}