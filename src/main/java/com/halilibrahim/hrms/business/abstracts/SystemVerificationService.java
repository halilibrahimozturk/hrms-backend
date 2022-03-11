package com.halilibrahim.hrms.business.abstracts;

import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;

import com.halilibrahim.hrms.entities.concretes.Employer;
import com.halilibrahim.hrms.entities.concretes.SystemVerification;


import java.util.List;

public interface SystemVerificationService {
    DataResult<List<SystemVerification>> getAll();
    Result add(SystemVerification SystemVerification);

    Result verify(Employer employer);
}