package com.codewithazam;

public class Teacher {
    private String name;
    private Classes teach;

    public Teacher(String name, Classes classes) {
        this.name = name;
        this.teach = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Classes getTeach() {
        return teach;
    }

    public void setTeach(Classes teach) {
        this.teach = teach;
    }
}
