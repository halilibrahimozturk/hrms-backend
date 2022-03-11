package com.halilibrahim.hrms.business.abstracts;

import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;

import com.halilibrahim.hrms.entities.concretes.MernisVerification;


import java.util.List;

public interface MernisVerificationService {
    DataResult<List<MernisVerification>> getAll();
    Result add(MernisVerification mernisverification);}
