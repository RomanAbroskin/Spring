package ru.top.springboot.controler;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.top.springboot.entiti.Student;
import ru.top.springboot.repository.StudentRepositoryImpl;


import java.util.List;


@RestController
@RequestMapping(value ="/test3")
@RequiredArgsConstructor
public class ControllerStudent {
        private final StudentRepositoryImpl studentRepository;

    @GetMapping
    public List<Student> allStudents(){
            return studentRepository.findAll();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentRepository.save(student);

    }

}
