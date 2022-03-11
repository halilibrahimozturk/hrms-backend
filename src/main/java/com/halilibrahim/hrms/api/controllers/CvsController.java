package com.halilibrahim.hrms.api.controllers;

import com.halilibrahim.hrms.business.abstracts.CvService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.Cv;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/cvs")
public class CvsController {


    private final CvService cvService;


    @GetMapping("/getAll")

    public DataResult<List<Cv>> getAll(){

        return this.cvService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Cv cv){
        return this.cvService.add(cv);

    }

}