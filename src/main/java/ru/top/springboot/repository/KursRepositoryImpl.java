package ru.top.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.top.springboot.entiti.Kurs;

import java.util.UUID;

public interface KursRepositoryImpl extends JpaRepository <Kurs, UUID> {

}
