package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.Job;
import com.halilibrahim.hrms.entities.concretes.JobSeeker;
import com.halilibrahim.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobDao extends JpaRepository<Job,Integer> {


    Job getById(long id);


    List<Job> getByIsActive(boolean isActive);
    List<Job> getByIsActiveAndEmployer_Id(boolean isActive , long id);
}
