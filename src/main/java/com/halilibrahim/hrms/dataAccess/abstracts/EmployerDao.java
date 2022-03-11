package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployerDao extends JpaRepository<Employer,Integer> {

}
