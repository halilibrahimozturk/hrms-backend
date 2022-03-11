package com.halilibrahim.hrms.business.abstracts;

import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.City;
import com.halilibrahim.hrms.entities.concretes.Cv;
import com.halilibrahim.hrms.entities.concretes.WorkExperience;

import java.util.List;

public interface WorkExperienceService {
    DataResult<List<WorkExperience>> getAll();
    Result add(WorkExperience workExperience);}