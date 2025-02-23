package com.example.JPAdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student
{
    @Id
    private int rno;
    private String name;
    private String gender;
    private String technology;
    public int getRno() { return rno; }
    public void setRno(int rno) { this.rno = rno; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getTechnology() { return technology; }
    public void setTechnology(String technology) { this.technology = technology; }

    @Override
    public String toString() {
        return "Student{rno=" + rno + ", name='" + name + "', gender='" + gender + "', technology='" + technology + "'}";
    }
}

