package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
}
