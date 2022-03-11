package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WorkExperienceDao extends JpaRepository<WorkExperience,Integer> {

}
