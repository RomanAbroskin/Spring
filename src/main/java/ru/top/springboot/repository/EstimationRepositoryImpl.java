package ru.top.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.top.springboot.entiti.Estimation;

import java.util.UUID;

public interface EstimationRepositoryImpl extends JpaRepository <Estimation, UUID>{

}
