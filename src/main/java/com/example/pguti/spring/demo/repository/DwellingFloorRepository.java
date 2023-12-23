package com.example.pguti.spring.demo.repository;

import com.example.pguti.spring.demo.entity.DwellingFloor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DwellingFloorRepository extends CrudRepository<DwellingFloor, Long> {
    List<DwellingFloor> findAll();

}
