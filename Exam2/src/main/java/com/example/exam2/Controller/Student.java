package com.example.exam2.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/student")
@Service
public class Student {
    ArrayList<Student> students =new  ArrayList<>();

    @GetMapping("/get")
    public ResponseEntity getStudent(){
        ArrayList<Student> student=student.getStudent.();
        if ()
        return

     }
    @PostMapping("/add")
     public RequestEntity addStudent(@RequestBody Student student ){
        if
    }

    @PutMapping("/update/{index}")
    public String updateStudent(@PathVariable int index, @RequestBody Student student) {
        students.set(index, student);
        return "Student update";


    }
    public


}

