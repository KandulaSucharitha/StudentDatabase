package com.restapi.studentdatabase.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.StringReader;

@Entity
@Table(name = "student")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Student Name")
    private String name;
    @Column(name = "Student Percentage")
    private String  percent;
    @Column(name = "Student Branch")
    private String branch;



    public Student(String name, String percent, String branch){
        this.name = name;
        this.percent = percent;
        this.branch = branch;
    }


    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getPercent(){
        return percent;
    }
    public void setPercent(String percent){
        this.percent = percent;
    }

    public String getBranch(){
        return branch;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
}
