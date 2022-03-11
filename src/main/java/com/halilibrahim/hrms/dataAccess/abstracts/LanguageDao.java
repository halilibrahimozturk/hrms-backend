package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.Education;
import com.halilibrahim.hrms.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LanguageDao extends JpaRepository<Language,Integer> {

}
