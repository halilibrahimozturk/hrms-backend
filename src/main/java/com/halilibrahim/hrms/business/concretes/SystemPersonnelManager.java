package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.EmployerService;
import com.halilibrahim.hrms.business.abstracts.SystemPersonnelService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.EmployerDao;
import com.halilibrahim.hrms.dataAccess.abstracts.SystemPersonnelDao;
import com.halilibrahim.hrms.entities.concretes.Employer;
import com.halilibrahim.hrms.entities.concretes.SystemPersonnel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class SystemPersonnelManager implements SystemPersonnelService {

    private final SystemPersonnelDao systemPersonnelDao;





    @Override
    public DataResult<List<SystemPersonnel>> getAll() {
        return new SuccessDataResult<List<SystemPersonnel>>(this.systemPersonnelDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(SystemPersonnel systemPersonnel) {
        this.systemPersonnelDao.save(systemPersonnel);
        return new SuccessResult("New user saved");
    }
}