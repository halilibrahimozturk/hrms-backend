package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.EmployerService;
import com.halilibrahim.hrms.business.abstracts.SystemPersonnelService;
import com.halilibrahim.hrms.business.abstracts.VerificationService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.EmployerDao;
import com.halilibrahim.hrms.dataAccess.abstracts.SystemPersonnelDao;
import com.halilibrahim.hrms.dataAccess.abstracts.VerificationDao;
import com.halilibrahim.hrms.entities.concretes.Employer;
import com.halilibrahim.hrms.entities.concretes.SystemPersonnel;
import com.halilibrahim.hrms.entities.concretes.Verification;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class VerificationManager implements VerificationService {

    private final VerificationDao verificationDao;



    @Override
    public DataResult<List<Verification>> getAll() {
        return new SuccessDataResult<List<Verification>>(this.verificationDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(Verification verification) {
        this.verificationDao.save(verification);
        return new SuccessResult("New user saved");
    }
}