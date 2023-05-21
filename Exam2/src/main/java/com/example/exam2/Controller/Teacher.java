package com.example.exam2.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/teacher")
public class Teacher {
    ArrayList <Teacher> teachers=new ArrayList<>();

    //read
    @GetMapping("/get")
    public ArrayList<Teacher> getTeacher(){
        return teachers;
    }

    //create
    @PostMapping("/add")
    public String  addTeacher(@RequestBody Teacher teacher){
        teachers.add(teacher);
        return "Teacher added!";
    }

    //update -  Put
    @PutMapping("/update/{index}")
    public String updateTeacher(@PathVariable int index, @RequestBody Teacher teacher) {
        teachers.set(index, teacher);
        return "Teacher update";
    }


    //delete
    @DeleteMapping("/delet/{index}")
    public String deleteTeacher(@PathVariable int index){
        teachers.remove(index);
        return "Teacher delete";
    }
}
