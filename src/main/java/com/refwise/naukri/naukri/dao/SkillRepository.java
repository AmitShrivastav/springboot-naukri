package com.refwise.naukri.naukri.dao;

import com.refwise.naukri.naukri.entity.NaukriSkill;
import org.springframework.data.repository.CrudRepository;



public interface SkillRepository extends CrudRepository<NaukriSkill, Integer> {
    NaukriSkill findBySkill(String skill);
}
