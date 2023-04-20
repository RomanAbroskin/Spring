package ru.top.springboot.entiti;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;


@Data
@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column (name = "surname")
    private String surname;

    @OneToMany(mappedBy = "student")
    private List<Kurs> kurs;


}
