package com.test.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {


    public List<Student> findAllStudents() {
        return  List.of(
                new Student(
                        "xevasi",
                        "qozedze",
                        LocalDate.now(),
                        33,
                        "z1eza1zn1oz1adze20@gmail.com"
                )
        );
    }
}
