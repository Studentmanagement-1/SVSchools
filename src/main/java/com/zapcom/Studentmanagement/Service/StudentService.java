package com.zapcom.Studentmanagement.Service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String greetings(){
        System.out.println("welcome");
        return "hello";
    }

    public String greetings2(){
        System.out.println("welcome");
        return "how are you";
    }
}
