package de.neuefische.rem21_3.springdemo.controller;

import de.neuefische.rem21_3.springdemo.db.StudentDB;
import de.neuefische.rem21_3.springdemo.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class StudentController {

    @GetMapping("/world")
    public List<Student> getStudents() {
        Student student1 = new Student("Peter", 341);
        Student student2 = new Student("Michael", 999);

        StudentDB studentDB = new StudentDB(List.of(student1, student2));

        return studentDB.list();
    }

    @PostMapping ("/hello")
    public String helloPost(@RequestBody String name) {
        return String.format("Hello %s!", name);
    }

    @PutMapping
    public String helloPut(@RequestBody String name) {
        //create data

        return String.format("Hello %s!", name);
    }

    @DeleteMapping
    public String helloDelete(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
