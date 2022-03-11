package com.halilibrahim.hrms.core.abstracts;

import com.halilibrahim.hrms.entities.concretes.JobSeeker;
import com.halilibrahim.hrms.entities.concretes.User;
import org.springframework.stereotype.Service;

@Service
public interface EMailService {

    boolean CheckVerification(User user) throws Exception;



}
