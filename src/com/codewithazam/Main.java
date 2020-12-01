package com.codewithazam;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Amin", "Freshman");
        student1.enroll(Classes.ENGLISH);
        student1.enroll(Classes.MATH);
        student1.enroll(Classes.COMPUTER_SCIENCE);
        Teacher teacher = new Teacher("John", Classes.MATH);
        System.out.println("Name : " + student1.getName() + "\nSubjects : " + student1.getSubjects());
        System.out.println(teacher.getTeach() + " teacher's name is : " + teacher.getName());
    }
}
