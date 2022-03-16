package com.halilibrahim.hrms.api.controllers;

import com.halilibrahim.hrms.business.abstracts.JobService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.Employer;
import com.halilibrahim.hrms.entities.concretes.Job;
import com.halilibrahim.hrms.entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/jobs")
@CrossOrigin
public class JobsController {


    private final JobService jobService;


    @GetMapping("/getAll")

    public DataResult<List<Job>> getAll(){

        return this.jobService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Job job){
        return this.jobService.add(job);

    }


    @GetMapping("/getByIsActive")
    public DataResult<List<Job>> getByIsActive(@RequestParam  boolean isActive){

        return this.jobService.getByIsActive(isActive);
    }




        @GetMapping("/getByIsActiveAndEmployer_Id")
        public DataResult<List<Job>> getByIsActiveAndEmployer_Id(@RequestParam  boolean isActive, long id){

            return this.jobService.getByIsActiveAndEmployer_Id(isActive,id);
        }


}