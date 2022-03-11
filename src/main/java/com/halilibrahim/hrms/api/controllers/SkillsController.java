package com.halilibrahim.hrms.api.controllers;

import com.halilibrahim.hrms.business.abstracts.SkillService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.Skill;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/skills")
public class SkillsController {


    private final SkillService skillService;


    @GetMapping("/getAll")

    public DataResult<List<Skill>> getAll(){

        return this.skillService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Skill skill){
        return this.skillService.add(skill);

    }

}