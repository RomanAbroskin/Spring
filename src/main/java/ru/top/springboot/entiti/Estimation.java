package ru.top.springboot.entiti;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Table(name ="estimation")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Estimation {
    @Id
    @Column(name ="id")
    private UUID id;
    @Column(name = "ocenka")
    private String ocenka;

    @ManyToOne
    @JoinColumn(name ="kurs_id", referencedColumnName = "id")
    private Kurs kurs;


}
