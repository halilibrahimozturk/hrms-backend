package com.halilibrahim.hrms.business.abstracts;

import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.entities.concretes.User;
import com.halilibrahim.hrms.entities.dtos.UserWithVerificationDto;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserService {

    DataResult<List<User>> getAll();
    Result add(User user);


    DataResult <User> getById(long id);
    DataResult <User> getByEmail(String email);
    DataResult <User> getByJobTitle(String jobTitle);


    DataResult<List<User>> getAll(int pageNo, int pageSize);


    DataResult<List<User>> getAllSorted();
    DataResult <List<UserWithVerificationDto>> getUserWithVerificationDetails();


    DataResult<User> findByEmail(String email);
//
//    DataResult <User> getByUserCompanyName(String companyName);
//    DataResult <User> getByUserPhone_Number(String phoneNumber);
//    DataResult <User> getByUserWebSite(String web_site);
//
//    DataResult <User> getByUserIdentityNumber(long identityNumber);
//    DataResult <User> getByUserName(String name);
//    DataResult <User> getByUserSurname(String surname);
//    DataResult <User> getByUserYearOfBirth(String yearOfBirth);
//
//
//
//
//
//    DataResult <User> getByUserNameAndSurname(String name, String surname);
//
//
//    DataResult <List<User>> getByUserIdOrEmail(Long id, String eMail);
//
//
//    DataResult <List<User>> getByJobTitleIdIn(List<Long> jobTitle);
//
//    DataResult <List<User>> getByNameContains(String name);
//
//    DataResult <List<User>> getByUserCompanyNameStartsWith(String companyName);
//
//
//    DataResult <List<User>>
//    getByCompanyNameAndJobTitle_JobTitle(String companyName, long job_title_id);
}