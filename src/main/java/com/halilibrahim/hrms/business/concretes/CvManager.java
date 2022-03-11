package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.CvService;
import com.halilibrahim.hrms.core.abstracts.CloudinaryService;
import com.halilibrahim.hrms.core.concretes.CloudinaryManager;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.CvDao;
import com.halilibrahim.hrms.entities.concretes.Cv;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CvManager implements CvService {

    private final CvDao cvDao;


    private final CloudinaryService cloudinaryService;


    @Override
    public DataResult<List<Cv>> getAll() {
        return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(), "Data viewed");

    }

    @Override
    public Result add(Cv cv) {
        this.cvDao.save(cv);


        cloudinaryService.uploadImage(cv);


        return new SuccessResult("New title added");
    }
}