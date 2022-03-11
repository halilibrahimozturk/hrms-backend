package com.halilibrahim.hrms.api.controllers;

import com.halilibrahim.hrms.business.abstracts.WorkExperienceService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.WorkExperience;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/workExperiences")
public class WorkExperiencesController {


    private final WorkExperienceService workExperienceService;


    @GetMapping("/getAll")

    public DataResult<List<WorkExperience>> getAll(){

        return this.workExperienceService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody WorkExperience workExperience){
        return this.workExperienceService.add(workExperience);

    }

}