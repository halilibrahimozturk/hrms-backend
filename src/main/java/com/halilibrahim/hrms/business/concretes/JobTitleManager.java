package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.JobTitleService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.JobTitleDao;
import com.halilibrahim.hrms.entities.concretes.JobTitle;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class JobTitleManager implements JobTitleService {

    private final JobTitleDao jobTitleDao;



    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(JobTitle jobTitle) {
        this.jobTitleDao.save(jobTitle);
        return new SuccessResult("New title added");
    }
}