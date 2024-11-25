package com.zapcom.Studentmanagement.Service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String greetings(){
      System.out.println("Thanks namasthe");
        return "hello";
    }

    public String greetings2(){
        System.out.println("Thanks namasthe");
        return "how are you";
    }
}
