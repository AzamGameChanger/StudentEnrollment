package com.codewithazam;

import java.util.ArrayList;

public class Enrolled {
    private String startDate;
    private String endDate;
    private Subject subject;

    private ArrayList<Student> students = new ArrayList<>();

    public Enrolled(String startDate, String endDate, Subject subject) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.subject = subject;
    }
    public void addStudents(Student student){
        students.add(student);
    }

    public int printNumberOfStudents() {
        return students.size();
    }

}
