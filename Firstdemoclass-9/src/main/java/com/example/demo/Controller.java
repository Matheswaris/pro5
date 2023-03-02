package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

@GetMapping("home")

public String get(@RequestParam String name,@RequestParam String dept)

{

return "hi " +name+" "+dept;

}

}


