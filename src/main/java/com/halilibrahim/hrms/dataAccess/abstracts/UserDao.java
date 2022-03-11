package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.User;
import com.halilibrahim.hrms.entities.dtos.UserWithVerificationDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.JoinColumn;
import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {

    User getById(long id);
    User getByEmail(String email);
    User getByJobTitle(String jobTitle);




    @Query("Select new " +
            "com.halilibrahim.hrms.entities.dtos.UserWithVerificationDto" +
            "(u.id,v.verified)" +
            " From Verification v Inner Join v.user u")
    List<UserWithVerificationDto> getUserWithVerificationDetails();


    User findByEmail(String email);







}
