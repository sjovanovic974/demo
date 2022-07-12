package com.example.demo.config;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student joeDoe = new Student(
                    "Joe Doe",
                    "joe.doe@gmail.com",
                    LocalDate.of(1982, Month.MARCH, 6)
            );

            Student alex = new Student(
                    "Alex Strong",
                    "alex.strong@gmail.com",
                    LocalDate.of(1988, Month.APRIL, 12)
            );

            repository.saveAll(List.of(joeDoe, alex));
        };
    }
}
