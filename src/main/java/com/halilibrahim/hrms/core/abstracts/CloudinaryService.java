package com.halilibrahim.hrms.core.abstracts;

import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.Cv;
import com.halilibrahim.hrms.entities.concretes.JobSeeker;
import org.springframework.stereotype.Service;

@Service

public interface CloudinaryService {


    Result uploadImage(Cv cv);

}