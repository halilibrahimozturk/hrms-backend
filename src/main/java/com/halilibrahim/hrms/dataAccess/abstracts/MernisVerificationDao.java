package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.MernisVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MernisVerificationDao extends JpaRepository<MernisVerification, Integer> {
}
