package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.Education;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EducationDao extends JpaRepository<Education,Integer> {

}
