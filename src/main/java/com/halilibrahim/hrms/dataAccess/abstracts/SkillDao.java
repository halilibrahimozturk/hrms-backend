package com.halilibrahim.hrms.dataAccess.abstracts;

import com.halilibrahim.hrms.entities.concretes.Skill;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillDao extends JpaRepository<Skill,Integer> {

}
