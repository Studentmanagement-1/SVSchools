package com.zapcom.Studentmanagement.Service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public String greetings(){
      System.out.println("Thanks namasthe");
        return "hello";
    }

    public String greetings2(){
        String a="porapo";
        System.out.println(a);
        return "how are you";
    }
    public String greetings4(){
        int a=8%7;
        System.out.println(a);
        return "how are you";
    }
    public String greetings5(){
        System.out.println("Thanks namasthe");
        return "how are you";
    }
}
