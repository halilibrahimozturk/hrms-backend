package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.EmployerService;
import com.halilibrahim.hrms.business.abstracts.MernisVerificationService;
import com.halilibrahim.hrms.business.abstracts.SystemPersonnelService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.EmployerDao;
import com.halilibrahim.hrms.dataAccess.abstracts.MernisVerificationDao;
import com.halilibrahim.hrms.dataAccess.abstracts.SystemPersonnelDao;
import com.halilibrahim.hrms.dataAccess.abstracts.VerificationDao;
import com.halilibrahim.hrms.entities.concretes.Employer;
import com.halilibrahim.hrms.entities.concretes.MernisVerification;
import com.halilibrahim.hrms.entities.concretes.SystemPersonnel;
import com.halilibrahim.hrms.entities.concretes.Verification;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class MernisVerificationManager implements MernisVerificationService {

    private final MernisVerificationDao mernisverificationDao;






    @Override
    public DataResult<List<MernisVerification>> getAll() {
        return new SuccessDataResult<List<MernisVerification>>(this.mernisverificationDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(MernisVerification mernisverification) {
        this.mernisverificationDao.save(mernisverification);
        return new SuccessResult("New user saved");
    }
}
