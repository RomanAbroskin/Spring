package ru.top.springboot.servis;

import ru.top.springboot.entiti.Kurs;
import ru.top.springboot.entiti.dto.request.KursRequest;
import ru.top.springboot.entiti.dto.response.KursResponse;

import java.util.List;
import java.util.UUID;

public interface KursService {
    List<KursResponse> getAll();
    KursResponse findById(UUID id);
    KursResponse save(KursRequest dto);
}
