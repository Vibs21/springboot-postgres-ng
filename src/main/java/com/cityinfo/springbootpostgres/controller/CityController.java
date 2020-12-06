package com.cityinfo.springbootpostgres.controller;

import com.cityinfo.springbootpostgres.exception.ResourceNotFoundException;
import com.cityinfo.springbootpostgres.model.Cityinfo;
import com.cityinfo.springbootpostgres.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/")
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping("cities")
    public List<Cityinfo> getAllCity() {
        return this.cityRepository.findAll();
    }

    @GetMapping("city/{id}")
    public ResponseEntity<Cityinfo> getCityById(@PathVariable(value = "id") Long cityId) throws ResourceNotFoundException {
        Cityinfo city = cityRepository.findById(cityId)
                .orElseThrow(() -> new ResourceNotFoundException("City with this id: " + cityId + " is not present in our Database"));
        return ResponseEntity.ok().body(city);
//        return ResponseEntity.ok().body(city);
    }

    @PostMapping("createcity")
    public Cityinfo createCity(@RequestBody Cityinfo cityinfo) {
        return this.cityRepository.save(cityinfo);
    }

    @PutMapping("city/{id}")
    public ResponseEntity<Cityinfo> updateCity(@PathVariable(value = "id") Long cityId, @Validated @RequestBody Cityinfo cityinfo) throws ResourceNotFoundException {
        Cityinfo city = cityRepository.findById(cityId)
                .orElseThrow(() -> new ResourceNotFoundException("City with this id: " + cityId + " is not present in our Database"));
        city.setCity(cityinfo.getCity());
        city.setColor(cityinfo.getColor());
        city.setEnddate(cityinfo.getEnddate());
        city.setPrice(cityinfo.getPrice());
        city.setStatus(cityinfo.getStatus());

        return ResponseEntity.ok(this.cityRepository.save(city));
    }

    @DeleteMapping("city/{id}")
    public Map<String, Boolean> deleteCity(@PathVariable(value = "id") Long cityId) throws ResourceNotFoundException {
        Cityinfo city = cityRepository.findById(cityId)
                .orElseThrow(() -> new ResourceNotFoundException("City with this id: " + cityId + " is not present in our Database"));
        this.cityRepository.delete(city);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
