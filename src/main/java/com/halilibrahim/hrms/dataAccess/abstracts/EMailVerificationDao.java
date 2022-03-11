package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.EMailVerification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
//@Repository
public interface EMailVerificationDao extends JpaRepository<EMailVerification, Integer> {

}
