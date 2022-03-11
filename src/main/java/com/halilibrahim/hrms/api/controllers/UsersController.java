package com.halilibrahim.hrms.api.controllers;

import com.halilibrahim.hrms.business.abstracts.UserService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.ErrorDataResult;
import com.halilibrahim.hrms.entities.concretes.User;
import com.halilibrahim.hrms.entities.dtos.UserWithVerificationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/api/users")
public class UsersController {


    private final UserService userService;



    @GetMapping("/getAll")

    public DataResult<List<User>> getAll(){

        return this.userService.getAll();
    }
    @PostMapping(value="/add")
    public ResponseEntity<?> add(@Valid @RequestBody User user) {

        return ResponseEntity.ok(this.userService.add(user)) ;
    }

    @GetMapping("/getById")
    public DataResult<User> getById(@RequestParam  long id){

        return this.userService.getById(id);
    }


    @GetMapping("/getAllByPage")

    DataResult<List<User>> getAll(int pageNo, int pageSize){

        return this.userService.getAll(pageNo,pageSize);
    }



    @GetMapping("/getAllAscending")

    public DataResult<List<User>> getAllSorted() {
        return this.userService.getAllSorted();

    }



    @GetMapping("/getUserWithVerificationDetails")

    public DataResult<List<UserWithVerificationDto>> getUserWithVerificationDetails() {
        return this.userService.getUserWithVerificationDetails();

    }

    @GetMapping("/findByEmail")

    public DataResult<User> findByEmail(@RequestBody String email) {
        return this.userService.findByEmail(email);

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