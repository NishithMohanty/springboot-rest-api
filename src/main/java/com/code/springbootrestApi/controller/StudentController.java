package com.code.springbootrestApi.controller;

import com.code.springbootrestApi.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @GetMapping("/students")
    public ResponseEntity<Student> getStudent(){
        Student student =  new Student(1,"firstName","lastName");
     //   return new ResponseEntity<>(student,HttpStatus.OK);
        return ResponseEntity.ok()
                .header("custome-header","new header")
                .body(student);
    }

    // path variable example ... uri - localhost:8080/student/20
    @GetMapping("/student/{id}")
    public Student getStudentIdPathVariable(@PathVariable Integer id){
        return new Student(id,"firstName","lastName");
    }

    // Query param exmple ... uri - localhost:8080/student/query?id=20
    @GetMapping("/student/query")
    public Student getStudentIdQueryParam(@RequestParam(required=false) Integer id){
        return new Student(id,"firstName","lastName");
    }

    @PostMapping("/student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent( @RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }

    @PostMapping("/student/{id}/update")
  //  @ResponseStatus(HttpStatus.CREATED)
    public Student updateStudent( @RequestBody Student student, @PathVariable int id){
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        return student;
    }
}
