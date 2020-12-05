package com.codewithazam;

public class Main {

    public static void main(String[] args) {
        Student amin = new Student("Amin", "Senior");
        amin.enroll(Subject.MATH);
        amin.enroll(Subject.COMPUTER_SCIENCE);
        System.out.println(amin.getSubjects());

        Teacher aLex = new Teacher("ALex", Subject.MATH);
        Teacher john = new Teacher("John", Subject.MATH);

        Subjects math = new Subjects(Subject.MATH, 100);
        math.addTeachers(aLex);
        math.addTeachers(john);
        System.out.println(math.getTeachers());


    }
}
