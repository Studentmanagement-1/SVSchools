package com.zapcom.Studentmanagement.Config;

import com.zapcom.Studentmanagement.Models.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurations {

    @Bean
    public Student student(){
        return new Student("hari",23);
    }
}
