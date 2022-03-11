package com.halilibrahim.hrms.core.abstracts;

import com.halilibrahim.hrms.entities.concretes.JobSeeker;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Service
public interface MernisService {

    boolean CheckIfRealPerson(JobSeeker jobSeeker) throws Exception;



}