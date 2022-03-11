package com.halilibrahim.hrms.business.concretes;

import com.halilibrahim.hrms.business.abstracts.UserService;
import com.halilibrahim.hrms.core.utilities.results.DataResult;
import com.halilibrahim.hrms.core.utilities.results.Result;
import com.halilibrahim.hrms.core.utilities.results.SuccessDataResult;
import com.halilibrahim.hrms.core.utilities.results.SuccessResult;
import com.halilibrahim.hrms.dataAccess.abstracts.UserDao;
import com.halilibrahim.hrms.entities.concretes.User;
import com.halilibrahim.hrms.entities.dtos.UserWithVerificationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class UserManager implements UserService {

    private final UserDao userDao;



    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data viewed");

    }
    @Override
    public Result add(User user) {
        this.userDao.save(user);

        return new SuccessResult("New user saved");
    }

    @Override
    public DataResult<User> getById(long id) {
        return new
                SuccessDataResult<User>
                (this.userDao.getById(id),"Data viewed");
    }

    @Override
    public DataResult<User> getByEmail(String email) {
        return new
                SuccessDataResult<User>
                (this.userDao.getByEmail(email),"Data viewed");    }

    @Override
    public DataResult<User> getByJobTitle(String jobTitle) {
        return new
                SuccessDataResult<User>
                (this.userDao.getByJobTitle(jobTitle),"Data viewed");    }

    @Override
    public DataResult<List<User>> getAll(int pageNo, int pageSize) {

        Pageable pageable = PageRequest.of(pageNo-1,pageSize);

        return new
                SuccessDataResult<List<User>> (this.userDao.findAll(pageable).getContent());
    }

    @Override
    public DataResult<List<User>> getAllSorted() {

        Sort sort = Sort.by(Sort.Direction.ASC,"id");
        return new SuccessDataResult<List<User>> (this.userDao.findAll(sort));
    }

    @Override
    public DataResult<List<UserWithVerificationDto>> getUserWithVerificationDetails() {
        return new SuccessDataResult<List<UserWithVerificationDto>>(this.userDao.getUserWithVerificationDetails(),"Data viewed");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Data viewed");
    }


}