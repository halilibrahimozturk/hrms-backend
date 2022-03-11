package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CvDao extends JpaRepository<Cv,Integer> {

}
