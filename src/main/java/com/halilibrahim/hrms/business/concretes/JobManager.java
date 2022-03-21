package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.JobService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.JobDao;
import com.halilibrahim.hrms.entities.concretes.Job;
import com.halilibrahim.hrms.entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class JobManager implements JobService {

    private final JobDao jobDao;


    @Override
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<List<Job>>(this.jobDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(Job job) {
        this.jobDao.save(job);
        return new SuccessResult("New title added");
    }

    @Override
    public DataResult<List<Job>> getByIsActive(boolean isActive) {
        return new
                SuccessDataResult<List<Job>>
                (this.jobDao.getByIsActive(isActive),"Data viewed");    }

    @Override
    public DataResult<Job> getById(long id) {
        return new
                SuccessDataResult<Job>
                (this.jobDao.getById(id),"Data viewed");
    }






    @Override
    public DataResult<List<Job>> getByIsActiveAndEmployer_Id(boolean isActive , long id) {
        return new
                SuccessDataResult<List<Job>>
                (this.jobDao.getByIsActiveAndEmployer_Id(isActive,id),"Data viewed");    }

}