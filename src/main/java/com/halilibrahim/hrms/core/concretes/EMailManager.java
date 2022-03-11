package com.halilibrahim.hrms.core.concretes;

import com.halilibrahim.hrms.core.abstracts.EMailService;

import com.halilibrahim.hrms.entities.concretes.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
public class EMailManager implements EMailService {


    @Override
    public boolean CheckVerification(User user) throws Exception {

        System.out.println("Checking for Validity");

        return true;
    }
}
