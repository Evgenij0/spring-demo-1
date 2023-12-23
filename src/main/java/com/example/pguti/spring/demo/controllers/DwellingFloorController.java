package com.example.pguti.spring.demo.controllers;

import com.example.pguti.spring.demo.entity.DwellingFloor;
import com.example.pguti.spring.demo.services.DwellinaFloorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/floors")
public class DwellingFloorController {
    @Autowired
    private DwellinaFloorService dwellingService;

    @PostMapping()
    public void save(@RequestBody DwellingFloor floor) {
        log.info("Create new floor: {}", floor);
        dwellingService.save(floor);
    }

    @GetMapping()
    public List<DwellingFloor> getAllFloors() {
        return dwellingService.getAll();
    }

    @GetMapping("/{id}")
    public DwellingFloor getFloor(@PathVariable("id") Long id) {
        return dwellingService.getById(id);
    }

}
