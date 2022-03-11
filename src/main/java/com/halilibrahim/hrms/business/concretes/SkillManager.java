package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.SkillService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.SkillDao;
import com.halilibrahim.hrms.entities.concretes.Skill;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class SkillManager implements SkillService {

    private final SkillDao skillDao;



    @Override
    public DataResult<List<Skill>> getAll() {
        return new SuccessDataResult<List<Skill>>(this.skillDao.findAll(),"Data viewed");

    }

    @Override
    public Result add(Skill skill) {
        this.skillDao.save(skill);
        return new SuccessResult("New title added");
    }
}