package com.codewithazam;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student amin = new Student("Amin", "Senior");
        amin.enroll(Subject.MATH);
        amin.enroll(Subject.COMPUTER_SCIENCE);
        amin.enroll(Subject.ENGLISH);
        System.out.println("Amin's subjects : " + amin.getSubjects());

        Student khoja = new Student("Khoja", "Freshman");
        khoja.enroll(Subject.MATH);

        Teacher aLex = new Teacher("ALex", Subject.MATH);
        Teacher john = new Teacher("John", Subject.MATH);

        Subjects math = new Subjects(Subject.MATH, 100);
        math.addTeachers(aLex);
        math.addTeachers(john);
        System.out.println("Math teachers : " + math.getTeachers());

        Enrolled enrolled = new Enrolled("01-01-2000","02-02-1144", Subject.MATH);
        enrolled.addStudents(amin);
        enrolled.addStudents(khoja);
        System.out.println(enrolled.printNumberOfStudents());











    }
}
