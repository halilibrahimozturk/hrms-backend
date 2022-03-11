package com.halilibrahim.hrms.api.controllers;

import com.halilibrahim.hrms.business.abstracts.EmployerService;
import com.halilibrahim.hrms.business.abstracts.SystemPersonnelService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.ErrorDataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.Employer;
import com.halilibrahim.hrms.entities.concretes.SystemPersonnel;
import com.halilibrahim.hrms.entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/systempersonnels")
public class SystemPersonnelsController {


    private final SystemPersonnelService systemPersonnelService;


    @GetMapping("/getAll")

    public DataResult<List<SystemPersonnel>> getAll(){

        return this.systemPersonnelService.getAll();
    }
    @PostMapping(value="/add")
    public ResponseEntity<?> add(@Valid @RequestBody SystemPersonnel systemPersonnel) {

        return ResponseEntity.ok(this.systemPersonnelService.add(systemPersonnel)) ;
    }



    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException
            (MethodArgumentNotValidException exceptions){
        Map<String,String> validationErrors = new HashMap<String, String>();
        for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        ErrorDataResult<Object> errors
                = new ErrorDataResult<Object>(validationErrors,"Validation Errors !");
        return errors;
    }

}