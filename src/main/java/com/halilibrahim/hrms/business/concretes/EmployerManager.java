package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.EMailVerificationService;
import com.halilibrahim.hrms.business.abstracts.EmployerService;
import com.halilibrahim.hrms.core.concretes.EMailManager;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.EMailVerificationDao;
import com.halilibrahim.hrms.dataAccess.abstracts.EmployerDao;
import com.halilibrahim.hrms.dataAccess.abstracts.JobSeekerDao;
import com.halilibrahim.hrms.entities.concretes.EMailVerification;
import com.halilibrahim.hrms.entities.concretes.Employer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor

@Service
public class EmployerManager implements EmployerService {

    private final EmployerDao employerDao;


    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);

        return new SuccessResult("New user saved");
    }
}