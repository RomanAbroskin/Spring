package ru.top.springboot.entiti.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;
@Builder
@Data
public class KursResponse {
    private String name;
    private UUID student_id;
    private UUID kurs_id;
}
