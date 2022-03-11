package com.halilibrahim.hrms.business.abstracts;

import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;

import com.halilibrahim.hrms.entities.concretes.EMailVerification;
import com.halilibrahim.hrms.entities.concretes.JobSeeker;
import com.halilibrahim.hrms.entities.concretes.User;


import java.util.List;

public interface EMailVerificationService {
    DataResult<List<EMailVerification>> getAll();
    Result add(EMailVerification emailverification);
    Result verify(User user);
}