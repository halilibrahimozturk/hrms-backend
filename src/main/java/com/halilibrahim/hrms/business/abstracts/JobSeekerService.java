package com.halilibrahim.hrms.business.abstracts;

import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    DataResult<List<JobSeeker>> getAll();
    Result add(JobSeeker jobSeeker);




}