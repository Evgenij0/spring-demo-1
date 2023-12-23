package com.example.pguti.spring.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@Data
@Table(name = "floor")

@NoArgsConstructor
public class DwellingFloor {

    @Transient
    private List<Flat> flatList;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "numberFloor", nullable = false)
    private int numberFloor;

}
