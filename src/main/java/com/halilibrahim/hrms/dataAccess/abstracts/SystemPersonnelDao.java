package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.SystemPersonnel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemPersonnelDao extends JpaRepository<SystemPersonnel,Integer> {
}
