package com.halilibrahim.hrms.business.abstracts;

import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.City;
import com.halilibrahim.hrms.entities.concretes.Cv;
import com.halilibrahim.hrms.entities.concretes.Education;
import com.halilibrahim.hrms.entities.concretes.Skill;

import java.util.List;

public interface SkillService {
    DataResult<List<Skill>> getAll();
    Result add(Skill skill);}