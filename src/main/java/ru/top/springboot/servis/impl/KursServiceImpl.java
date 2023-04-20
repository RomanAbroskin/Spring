package ru.top.springboot.servis.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.top.springboot.entiti.Kurs;
import ru.top.springboot.entiti.Student;
import ru.top.springboot.entiti.dto.request.KursRequest;
import ru.top.springboot.entiti.dto.response.KursResponse;
import ru.top.springboot.repository.KursRepositoryImpl;
import ru.top.springboot.repository.StudentRepositoryImpl;
import ru.top.springboot.servis.KursService;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class KursServiceImpl implements KursService {

    private final KursRepositoryImpl kursRepository;
    private final StudentRepositoryImpl studentRepository;


    @Override
    public List<KursResponse> getAll() {
        return null;
    }

    @Override
    public KursResponse findById(UUID id) {
        return null;
    }

    @Override
    public KursResponse save(KursRequest dto) {

        Student student = studentRepository.findById(dto.getStudent_id())
                .orElseThrow(()-> new NoSuchElementException(
                        String.format("No",dto.getStudent_id())
                ));

        Kurs kurs = Kurs.builder()
                .id(UUID.randomUUID())
                .name(dto.getName())
                .student(student)
                .build();

        kursRepository.save(kurs);

        return KursResponse.builder()
                .kurs_id(kurs.getId())
                .student_id(dto.getStudent_id())
                .name(kurs.getName())
                .build();
    }
}
