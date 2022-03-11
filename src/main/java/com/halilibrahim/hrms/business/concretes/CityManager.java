package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.CityService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.CityDao;
import com.halilibrahim.hrms.entities.concretes.City;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class CityManager implements CityService {

    private final CityDao cityDao;


    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(City city) {
        this.cityDao.save(city);
        return new SuccessResult("New title added");
    }
}