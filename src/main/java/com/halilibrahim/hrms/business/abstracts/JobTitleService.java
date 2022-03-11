package com.halilibrahim.hrms.business.abstracts;

import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {
    DataResult<List<JobTitle>> getAll();
    Result add(JobTitle jobTitle);}