package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.JobSeekerService;
import com.halilibrahim.hrms.core.abstracts.MernisService;
import com.halilibrahim.hrms.core.concretes.EMailManager;
import com.halilibrahim.hrms.core.concretes.MernisManager;
import com.halilibrahim.hrms.core.utilities.results.*;
import com.halilibrahim.hrms.dataAccess.abstracts.JobSeekerDao;
import com.halilibrahim.hrms.entities.concretes.JobSeeker;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;





    private MernisService mernisService;


    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(JobSeeker jobSeeker) {



        try {




            if(mernisService.CheckIfRealPerson(jobSeeker)){

                this.jobSeekerDao.save(jobSeeker);




                return new SuccessResult("New user saved");


            }else{
                System.out.println("Couldn't saved");

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception E : Couldn't saved");


        }







        return new SuccessResult("New user saved");

    }






}