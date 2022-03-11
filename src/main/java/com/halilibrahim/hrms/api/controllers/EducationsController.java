package com.halilibrahim.hrms.api.controllers;

import com.halilibrahim.hrms.business.abstracts.EducationService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.Education;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/educations")
public class EducationsController {


    private final EducationService educationService;


    @GetMapping("/getAll")

    public DataResult<List<Education>> getAll(){

        return this.educationService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Education education){
        return this.educationService.add(education);

    }

}