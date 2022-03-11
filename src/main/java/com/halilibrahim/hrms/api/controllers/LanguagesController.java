package com.halilibrahim.hrms.api.controllers;

import com.halilibrahim.hrms.business.abstracts.LanguageService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/languages")
public class LanguagesController {


    private final LanguageService languageService;


    @GetMapping("/getAll")

    public DataResult<List<Language>> getAll(){

        return this.languageService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Language language){
        return this.languageService.add(language);

    }

}