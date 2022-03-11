package com.halilibrahim.hrms.core.concretes;

import com.halilibrahim.hrms.core.abstracts.MernisService;
import com.halilibrahim.hrms.core.utilities.verifications.mernis.LIWKPSPublicSoap;
import com.halilibrahim.hrms.entities.concretes.JobSeeker;

public class MernisManager implements MernisService {

    @Override
    public boolean CheckIfRealPerson(JobSeeker jobSeeker) throws Exception {
        System.out.println("Checking for Validity");


        LIWKPSPublicSoap mernis = new LIWKPSPublicSoap();
        try {
            if(mernis.TCKimlikNoDogrula(
                    jobSeeker.getIdentityNumber(),
                    jobSeeker.getName(),
                    jobSeeker.getSurname(),
                    jobSeeker.getYearOfBirth()



            ))
            {

                System.out.println("Valid person!");




            }
            else
            {

                System.out.println("Not a valid person!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Validation Error!");

        }






        return mernis.TCKimlikNoDogrula(
                jobSeeker.getIdentityNumber(),
                jobSeeker.getName(),
                jobSeeker.getSurname(),
                jobSeeker.getYearOfBirth()
        );
    }
}