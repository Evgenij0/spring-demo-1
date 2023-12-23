
package com.example.pguti.spring.demo.services;

import com.example.pguti.spring.demo.entity.DwellingFloor;
import com.example.pguti.spring.demo.repository.DwellingFloorRepository;
import com.example.pguti.spring.demo.repository.FlatsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DwellinaFloorService {
    private final DwellingFloorRepository dwellingRepository;
    private final FlatsRepository flatRepository;

    public void save(DwellingFloor dwellingFloor) {
        dwellingRepository.save(dwellingFloor);
    }

    public List<DwellingFloor> getAll() {
        List<DwellingFloor> temp = dwellingRepository.findAll();

        for (DwellingFloor floor : temp) {

            floor.setFlatList(flatRepository.findFlatsByNumberFloor(floor.getNumberFloor()));

        }

        return temp;
    }

    public DwellingFloor getById(Long id) {

        DwellingFloor floor = dwellingRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("no floor"));

        floor.setFlatList(flatRepository.findFlatsByNumberFloor(floor.getNumberFloor()));

        return floor;

    }

}

