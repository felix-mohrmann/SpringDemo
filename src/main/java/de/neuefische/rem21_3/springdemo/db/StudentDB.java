package de.neuefische.rem21_3.springdemo.db;

import de.neuefische.rem21_3.springdemo.model.Student;

import java.util.List;

public class StudentDB {

    private List<Student> students;

    public StudentDB(List<Student> studentArray) {
        this.students = studentArray;
    }

    public List<Student> list() {
        return students;
    }
}