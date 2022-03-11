package com.halilibrahim.hrms.business.abstracts;

import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.City;
import com.halilibrahim.hrms.entities.concretes.Cv;
import com.halilibrahim.hrms.entities.concretes.Education;
import com.halilibrahim.hrms.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    DataResult<List<Language>> getAll();
    Result add(Language language);}