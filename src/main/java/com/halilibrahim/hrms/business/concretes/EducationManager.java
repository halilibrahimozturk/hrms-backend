package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.EducationService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.EducationDao;
import com.halilibrahim.hrms.entities.concretes.Education;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor

@Service
public class EducationManager implements EducationService {

    private final EducationDao educationDao;



    @Override
    public DataResult<List<Education>> getAll() {
        return new SuccessDataResult<List<Education>>(this.educationDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(Education education) {
        this.educationDao.save(education);
        return new SuccessResult("New title added");
    }
}