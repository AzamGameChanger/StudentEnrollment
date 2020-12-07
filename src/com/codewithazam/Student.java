package com.codewithazam;

import java.util.ArrayList;

public class Student {
    private String name;
    private String grade;

    private ArrayList<Subject> enrolledSubjects = new ArrayList<>();

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public void enroll(Subject subject){
        enrolledSubjects.add(subject);
    }

    public ArrayList<Subject> getSubjects() {
        ArrayList<Subject>enrolled= new ArrayList<>();
        for(Subject e: enrolledSubjects)
            enrolled.add(e);
        return enrolled;
    }

    public String getName() {
        return name;
    }
    public String getGrade() {
        return grade;
    }

}
