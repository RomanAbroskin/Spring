package ru.top.springboot.controler;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.top.springboot.entiti.Kurs;
import ru.top.springboot.entiti.dto.request.KursRequest;
import ru.top.springboot.entiti.dto.response.KursResponse;
import ru.top.springboot.servis.KursService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/test2")
@RequiredArgsConstructor
public class ControlerKurs {
    private final KursService kursService;

    @GetMapping
    public List<Kurs> kursList(@PathVariable(value = "id")UUID kursId){
        return null;
    }

    @PostMapping
    public KursResponse saveKurs(@RequestBody KursRequest dto){
     return kursService.save(dto);
    }
}
