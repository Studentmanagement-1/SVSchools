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
        System.out.println("namasthe22");
        System.out.println("namasthe12");
        return service.greetings();
    }

    @GetMapping("/greet2")
    public String greetings2(){
         System.out.println("namasthe22");
        System.out.println("namasthe12");
        return "Good Morning";
    }
    @GetMapping("/greet3")
    public String greetings3(){
        System.out.println("namasthe22");
        System.out.println("namasthe12");
        return "Good Morning";
    }
    @GetMapping("/greet3")
    public String greetings6(){
        System.out.println("namasthe26");
        System.out.println("namasthe16");
        return "Good Morning";
    }
    @GetMapping("/greet7")
    public String greetings7(){
        System.out.println("namasthe36");
        System.out.println("namasthe36");
        return "Good Morning";
    }

}
