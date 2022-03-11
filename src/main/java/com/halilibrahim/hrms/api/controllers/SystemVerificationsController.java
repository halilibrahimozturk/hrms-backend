package com.halilibrahim.hrms.api.controllers;


import com.halilibrahim.hrms.business.abstracts.SystemVerificationService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;

import com.halilibrahim.hrms.entities.concretes.Employer;
import com.halilibrahim.hrms.entities.concretes.SystemVerification;
import com.halilibrahim.hrms.entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/systemVerifications")
public class SystemVerificationsController {


    private final SystemVerificationService systemVerificationService;

    @GetMapping("/getAll")

    public DataResult<List<SystemVerification>> getAll(){

        return this.systemVerificationService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody SystemVerification systemVerification){
        return this.systemVerificationService.add(systemVerification);

    }



    @PostMapping("/verifyuser")
    public Result verify(@RequestBody Employer employer) throws Exception {


        return this.systemVerificationService.verify(employer);





    }

}