package com.halilibrahim.hrms.api.controllers;

import com.halilibrahim.hrms.business.abstracts.JobSeekerService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.ErrorDataResult;
import com.halilibrahim.hrms.entities.concretes.JobSeeker;
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
@RequestMapping("/api/jobSeekers")
public class JobSeekersController {


    private final JobSeekerService jobSeekerService;


    @GetMapping("/getAll")

    public DataResult<List<JobSeeker>> getAll(){

        return this.jobSeekerService.getAll();
    }
    @PostMapping(value="/add")
    public ResponseEntity<?> add(@Valid @RequestBody JobSeeker jobSeeker) {

        return ResponseEntity.ok(this.jobSeekerService.add(jobSeeker)) ;
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