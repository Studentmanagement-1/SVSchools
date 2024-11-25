package com.zapcom.Studentmanagement.Service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String greetings()
    {
        System.out.println("good morning");
        return "hello";
    }

    public String greetings2(){
        System.out.println("good morning");
        return "how are you";
    }
}
