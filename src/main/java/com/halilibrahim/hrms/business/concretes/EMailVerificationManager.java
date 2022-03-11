package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.EMailVerificationService;
import com.halilibrahim.hrms.business.abstracts.EmployerService;
import com.halilibrahim.hrms.business.abstracts.MernisVerificationService;
import com.halilibrahim.hrms.business.abstracts.SystemPersonnelService;
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
public class EMailVerificationManager implements EMailVerificationService {

    private final EMailVerificationDao emailverificationDao;







    @Override
    public DataResult<List<EMailVerification>> getAll() {
        return new SuccessDataResult<List<EMailVerification>>(this.emailverificationDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(EMailVerification emailverification) {
        this.emailverificationDao.save(emailverification);
        return new SuccessResult("New user saved");
    }

    @Override
    public Result verify(User user) {

        EMailVerification eMailVerification = new EMailVerification();
        eMailVerification.setEMailVerified(true);
        eMailVerification.setEMailCode("code");
        eMailVerification.setUserId(user.getId());
        eMailVerification.setId(123L);




        this.emailverificationDao.save(eMailVerification);
        return new SuccessResult("User which has id = "+ user.getId() +" is verified !");    }


}