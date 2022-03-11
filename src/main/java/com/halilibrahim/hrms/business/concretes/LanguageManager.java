package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.LanguageService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.LanguageDao;
import com.halilibrahim.hrms.entities.concretes.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class LanguageManager implements LanguageService {


    private final LanguageDao languageDao;


    @Override
    public DataResult<List<Language>> getAll() {
        return new SuccessDataResult<List<Language>>(languageDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(Language language) {
        languageDao.save(language);
        return new SuccessResult("New title added");
    }
}