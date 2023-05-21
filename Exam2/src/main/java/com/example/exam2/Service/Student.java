package com.example.exam2.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Service
public class Student {

    ArrayList<Student> students=new ArrayList<>();


    //read
    @GetMapping("/get")
    public ArrayList<Student> getStudent(){
        return students;
    }

    //create
    @PostMapping("/add")
    public String  addStudent(@RequestBody Student student){
        students.add(student);
        return "Student added!";
    }

    //update -  Put
    @PutMapping("/update/{index}")
    public String updateStudent(@PathVariable int index, @RequestBody Student student){
        students.set(index, student);
        return "Student update";
    }


    //delete
    @DeleteMapping("/delet/{index}")
    public String deleteStudent(@PathVariable int index){
        students.remove(index);
        return "Student delete";
    }

}


