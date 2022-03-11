package com.halilibrahim.hrms.core.adapters;

import com.halilibrahim.hrms.business.abstracts.VerificationService;
import com.halilibrahim.hrms.core.abstracts.MernisService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.verifications.mernis.LIWKPSPublicSoap;
import com.halilibrahim.hrms.entities.concretes.JobSeeker;
import com.halilibrahim.hrms.entities.concretes.Verification;

import java.util.List;

public class MernisServiceAdapter implements MernisService {



    @Override
    public boolean CheckIfRealPerson(JobSeeker jobSeeker) throws Exception {
        LIWKPSPublicSoap mernisVerification = new LIWKPSPublicSoap();





        return true;    }
}