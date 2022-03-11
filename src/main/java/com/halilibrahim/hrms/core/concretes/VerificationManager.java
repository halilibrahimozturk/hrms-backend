package com.halilibrahim.hrms.core.concretes;

import com.halilibrahim.hrms.core.abstracts.EMailService;

import com.halilibrahim.hrms.entities.concretes.User;



public class VerificationManager implements EMailService {


    @Override
    public boolean CheckVerification(User user) throws Exception {



        return true;
    }
}
