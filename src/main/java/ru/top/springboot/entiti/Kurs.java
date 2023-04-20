package ru.top.springboot.entiti;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Table(name ="kurs")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Kurs {
    @Id
    @Column(name ="id")
    private UUID id;

    @Column(name ="name")
    private String name;

    @ManyToOne
    @JoinColumn(name ="student_id", referencedColumnName = "id")
    private Student student;


}
