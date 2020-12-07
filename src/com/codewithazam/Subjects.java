package com.codewithazam;

import java.util.ArrayList;

public class Subjects {
    private Subject  subject;
    private int courseCode;

    private ArrayList<String> teachers = new ArrayList<String>();

    public Subjects(Subject  subject, int courseCode) {
        this.subject = subject;
        this.courseCode = courseCode;
    }

    public void addTeachers(Teacher teacher){
        if(teacher.getSubject() == subject)
            teachers.add(teacher.getName());
    }

    public ArrayList<String> getTeachers(){
        ArrayList<String> listOfTeachers = new ArrayList<>();
        for(String t: teachers)
            listOfTeachers.add(t);
        return listOfTeachers;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getCourseCode(){
        return courseCode;
    }
}
