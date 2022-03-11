package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.SystemVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemVerificationDao extends JpaRepository<SystemVerification, Integer> {
}