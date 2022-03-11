package com.halilibrahim.hrms.business.abstracts;

import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.JobSeeker;
import com.halilibrahim.hrms.entities.concretes.Verification;

import java.util.List;


public interface VerificationService {
    DataResult<List<Verification>> getAll();
    Result add(Verification verification);}

