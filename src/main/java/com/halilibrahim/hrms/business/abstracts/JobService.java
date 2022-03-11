package com.halilibrahim.hrms.business.abstracts;

import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.Job;
import com.halilibrahim.hrms.entities.concretes.JobSeeker;
import com.halilibrahim.hrms.entities.concretes.User;

import java.util.List;

public interface JobService {
    DataResult<List<Job>> getAll();
    Result add(Job job);
    DataResult <List<Job>> getByIsActive(boolean isActive);

    DataResult <List<Job>> getByIsActiveAndEmployer_Id(boolean isActive , long id);

}