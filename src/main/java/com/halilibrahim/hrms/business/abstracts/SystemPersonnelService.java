package com.halilibrahim.hrms.business.abstracts;

import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.Employer;
import com.halilibrahim.hrms.entities.concretes.SystemPersonnel;

import java.util.List;

public interface SystemPersonnelService {
    DataResult<List<SystemPersonnel>> getAll();
    Result add(SystemPersonnel systemPersonnel);}