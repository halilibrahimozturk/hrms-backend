package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.WorkExperienceService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.WorkExperienceDao;
import com.halilibrahim.hrms.entities.concretes.WorkExperience;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class WorkExperienceManager implements WorkExperienceService {

    private final WorkExperienceDao workExperienceDao;

    @Override
    public DataResult<List<WorkExperience>> getAll() {
        return new SuccessDataResult<List<WorkExperience>>(this.workExperienceDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(WorkExperience workExperience) {
        this.workExperienceDao.save(workExperience);
        return new SuccessResult("New title added");
    }
}