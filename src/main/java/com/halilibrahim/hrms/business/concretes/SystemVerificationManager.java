package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.SystemVerificationService;

import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.*;
import com.halilibrahim.hrms.entities.concretes.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class SystemVerificationManager implements SystemVerificationService {

    private final SystemVerificationDao systemVerificationDao;





    @Override
    public DataResult<List<SystemVerification>> getAll() {
        return new SuccessDataResult<List<SystemVerification>>(this.systemVerificationDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(SystemVerification SystemVerification) {
        this.systemVerificationDao.save(SystemVerification);
        return new SuccessResult("New user saved");
    }

    @Override
    public Result verify(Employer employer) {

        SystemVerification systemVerification = new SystemVerification();
        systemVerification.setSystemVerified(true);
        systemVerification.setUserId(employer.getId());
        systemVerification.setId(123L);




        this.systemVerificationDao.save(systemVerification);
        return new SuccessResult("User which has id = "+ employer.getId() +" is verified !");    }
}