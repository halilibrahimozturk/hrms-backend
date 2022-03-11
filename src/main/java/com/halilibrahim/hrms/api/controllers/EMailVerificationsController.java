package com.halilibrahim.hrms.api.controllers;


import com.halilibrahim.hrms.business.abstracts.EMailVerificationService;
import com.halilibrahim.hrms.core.abstracts.EMailService;
import com.halilibrahim.hrms.core.concretes.EMailManager;
import com.halilibrahim.hrms.core.concretes.MernisManager;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;

import com.halilibrahim.hrms.entities.concretes.EMailVerification;
import com.halilibrahim.hrms.entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/emailverifications")
public class EMailVerificationsController {


    private final EMailVerificationService emailverificationService;



    private EMailService eMailService;

    @GetMapping("/getAll")

    public DataResult<List<EMailVerification>> getAll(){

        return this.emailverificationService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody EMailVerification emailverification){
        return this.emailverificationService.add(emailverification);

    }

    @PostMapping("/verifyuser")
    public Result verify(@RequestBody User user) throws Exception {


        if(eMailService.CheckVerification(user)){

            return this.emailverificationService.verify(user);

        }
        else
            return null;




    }

}