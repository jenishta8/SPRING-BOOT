package com.example.StudentCRUD.service;

import com.example.StudentCRUD.model.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList<>(
            Arrays.asList(
            new Student(1, "Jeni", "CS"),
            new Student(2, "Jeni", "IT")
        )
    );
   public List<Student> getStudents() {
      return students;
    }

    public Student getStdByRno(int rollno) {
        int index=0;
        boolean flag=false;
        for(int i = 0; i<students.size(); i++){
            if(students.get(i).getRno()==rollno){
                index=i;
                flag=true;
                break;
            }

        }
        if(flag)
          return students.get(index);
        else
            return new Student(0,"","");
    }

    public void addStudent(Student student) {
      students.add(student);
    }
    public String updateStudent(Student student) {
         int index=0;
         boolean flag=false;
         for(int i=0;i<students.size();i++){
             if(students.get(i).getRno()==student.getRno()){
                   index=i;
                   flag=true;
                   break;
             }
         }
         if(!flag)return "No such element";
         else
             students.set(index, student);
             return "Updation is done";
    }

    public String deleteStudent(int rno) {
        int index=0;
        boolean flag=false;
        for(int i = 0; i<students.size(); i++){
            if(students.get(i).getRno()==rno){
                index=i;
                flag=true;
                break;
            }
        }
        if(flag) {
            students.remove(index);
            return "deleted succesfully";
        }
        else
            return "No such student exist";
    }
}
