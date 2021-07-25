package com.refwise.naukri.naukri.service;

import com.refwise.naukri.naukri.dao.SkillRepository;
import com.refwise.naukri.naukri.dto.Job;
import com.refwise.naukri.naukri.entity.NaukriSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldImpl {

 @Autowired
 SkillRepository skillRepository;

    public String add(String name){
        String response = "";
        if(name != null && name.length()>0){
            response =  "not empty";
        }else {
            response ="Empty";
        }
        return response;
    }

    public Job getJobDesc(String skill, String location){
        Job job = new Job();
        if(skill != null && skill.equalsIgnoreCase("Java")){
            job.setCompany("TCS");
            job.setJobLocation("Bangalore");
            job.setJobSkill("Java SpringBoot, Microservice");
            job.setSalary(10000);
        }
        //skillRepository.findAll();
        System.out.println("*******************All*****************");
        for (NaukriSkill skillRepository : skillRepository.findAll()) {
            System.out.println(skillRepository.toString());
        }
        System.out.println("*******************End*****************");

        System.out.println("*******************Single Skill*****************");
        NaukriSkill naukriSkillBySkill = skillRepository.findBySkill(skill);
        System.out.println(naukriSkillBySkill.toString());
        System.out.println("*******************End*****************");

        return  job;
    }



}
