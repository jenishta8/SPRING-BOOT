package com.example.JPAdemo.controller;

import com.example.JPAdemo.model.Student;
import com.example.JPAdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/students")
    public List<Student> getAllStudents(){
         return studentService.getAllStudents();
    }
    @GetMapping("/students/{rno}")
    public Student getStudentByRno(@PathVariable("rno") int rno) {
        return studentService.getStudentByRno(rno);
    }
    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "added succesfully";
    }
    @PutMapping("students")
    public String updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return "updated";
    }
    @DeleteMapping("students/{rno}")
    public String deleteStudent(@PathVariable("rno") int rno){
        studentService.deleteStudent(rno);
        return "deleted";
    }




}
