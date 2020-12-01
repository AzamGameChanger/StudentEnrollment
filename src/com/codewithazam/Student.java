package com.codewithazam;

import java.util.ArrayList;

public class Student {
    private String name;
    private String grade;

    private Classes classes;
    private ArrayList<Classes> courses = new ArrayList<>();

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public void enroll(Classes newSubject){
        courses.add(newSubject);
    }

    public ArrayList<Classes> getSubjects() {
        ArrayList<Classes>enrolled= new ArrayList<>();
        for(Classes c: courses)
            enrolled.add(c);
        return enrolled;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

}
