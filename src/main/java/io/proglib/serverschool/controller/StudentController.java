package io.proglib.serverschool.controller;

import io.proglib.serverschool.eniti.Student;
import io.proglib.serverschool.repository.StudentRepository;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

//    @Autowired
//    public StudentController(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }

/*

    @PostMapping
    public Student create(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping(path="/{id}")
    public Student findById(@PathVariable Long id){
        return studentRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }*/
}
