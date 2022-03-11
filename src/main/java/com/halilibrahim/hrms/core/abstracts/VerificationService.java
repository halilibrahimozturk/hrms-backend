package com.halilibrahim.hrms.core.abstracts;

import com.halilibrahim.hrms.entities.concretes.User;
import org.springframework.stereotype.Service;

@Service
public interface VerificationService {

    boolean CheckVerification(User user) throws Exception;



}
