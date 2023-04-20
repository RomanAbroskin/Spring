package ru.top.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.top.springboot.entiti.Student;

import java.util.UUID;

public interface StudentRepositoryImpl extends JpaRepository <Student, UUID>{


}
