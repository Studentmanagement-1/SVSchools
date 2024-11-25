package com.zapcom.Studentmanagement.Service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String greetings(){
         System.out.println("good morning");
        System.out.println("good");
        return "hello";
    }

    public String greetings2(){
         System.out.println("good morning");
        System.out.println("good");
        return "how are you";
    }
}
