package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.Verification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationDao extends JpaRepository<Verification, Integer> {
}
