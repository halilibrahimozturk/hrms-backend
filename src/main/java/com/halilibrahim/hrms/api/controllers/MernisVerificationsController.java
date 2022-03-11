package com.halilibrahim.hrms.api.controllers;


import com.halilibrahim.hrms.business.abstracts.MernisVerificationService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;

import com.halilibrahim.hrms.entities.concretes.MernisVerification;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/mernisverifications")
public class MernisVerificationsController {


    private final MernisVerificationService mernisverificationService;


    @GetMapping("/getAll")

    public DataResult<List<MernisVerification>> getAll(){

        return this.mernisverificationService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody MernisVerification mernisverification){
        return this.mernisverificationService.add(mernisverification);

    }

}