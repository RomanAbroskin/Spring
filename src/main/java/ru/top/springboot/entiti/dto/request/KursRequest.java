package ru.top.springboot.entiti.dto.request;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class KursRequest {
    private UUID student_id;
    private String name;

}
