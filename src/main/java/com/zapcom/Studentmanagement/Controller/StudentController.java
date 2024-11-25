package com.zapcom.Studentmanagement.Controller;

import com.zapcom.Studentmanagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @Autowired
    private StudentService service;

    @GetMapping("/greet")
    public String greetings(){
        return service.greetings();
    }

    @GetMapping("/greet2")
    public String greetings2(){
        return "Good Morning";
    }

}