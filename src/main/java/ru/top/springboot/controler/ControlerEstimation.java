package ru.top.springboot.controler;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.top.springboot.entiti.Estimation;
import ru.top.springboot.repository.EstimationRepositoryImpl;
import java.util.List;

@RestController
@RequestMapping(value = "/test")
@RequiredArgsConstructor
public class ControlerEstimation {

    private final EstimationRepositoryImpl estimationRepository;

        @GetMapping
        public List<Estimation> allEstimations(){
            return estimationRepository.findAll();
        }

        @PostMapping
        public Estimation saveEstimation(@RequestBody Estimation estimation){
            return estimationRepository.save(estimation);
        }
    }




