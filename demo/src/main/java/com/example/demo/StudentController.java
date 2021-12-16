package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
@RequestMapping("/")
public String hello() {
	return "hello Spring boot";
}
@RequestMapping("/add")
public String add() {
	return "hello springboot add method";
}
}

