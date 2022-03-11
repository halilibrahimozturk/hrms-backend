package com.halilibrahim.hrms.api.controllers;


import com.halilibrahim.hrms.business.abstracts.VerificationService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;

import com.halilibrahim.hrms.entities.concretes.Verification;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/verifications")
public class VerificationsController {


    private final VerificationService verificationService;



    @GetMapping("/getAll")

    public DataResult<List<Verification>> getAll(){

        return this.verificationService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Verification verification){
        return this.verificationService.add(verification);

    }

}