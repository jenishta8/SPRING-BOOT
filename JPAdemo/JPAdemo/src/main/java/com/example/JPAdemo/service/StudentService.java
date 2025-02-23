package com.example.JPAdemo.service;

import com.example.JPAdemo.model.Student;
import com.example.JPAdemo.repository.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public List<Student> getAllStudents()
    {
        return studentRepo.findAll();
    }
    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteStudent(int rno) {
        studentRepo.deleteById(rno);
    }

    public Student getStudentByRno(int rno) {
        return studentRepo.findById(rno).orElse(new Student());
    }
}
