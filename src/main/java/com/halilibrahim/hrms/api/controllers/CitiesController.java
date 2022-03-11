package com.halilibrahim.hrms.api.controllers;

import com.halilibrahim.hrms.business.abstracts.CityService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.City;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/cities")
public class CitiesController {


    private final CityService cityService;



    @GetMapping("/getAll")

    public DataResult<List<City>> getAll(){

        return this.cityService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody City city){
        return this.cityService.add(city);

    }

}