package com.halilibrahim.hrms.api.controllers;

import com.halilibrahim.hrms.business.abstracts.JobTitleService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.JobTitle;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/jobTitles")
public class JobTitlesController {


    private final JobTitleService jobTitleService;


    @GetMapping("/getAll")

    public DataResult<List<JobTitle>> getAll(){

        return this.jobTitleService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody JobTitle jobTitle){
        return this.jobTitleService.add(jobTitle);

    }

}