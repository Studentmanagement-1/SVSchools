package com.zapcom.Studentmanagement.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/greet")
    public String greetings(){
        return "hello";
    }

}
