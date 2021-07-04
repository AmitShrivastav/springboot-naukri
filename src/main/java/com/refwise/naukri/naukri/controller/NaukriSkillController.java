package com.refwise.naukri.naukri.controller;

import com.refwise.naukri.naukri.entity.NaukriSkill;
import com.refwise.naukri.naukri.service.SkillServiceImpl;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NaukriSkillController {

    SkillServiceImpl skillService;

    public NaukriSkillController(SkillServiceImpl skillService){
     this.skillService = skillService;
    }

    @GetMapping(value = "/v1/skills",produces = "application/json")
    public List<NaukriSkill> allSkill() {
        return  skillService.getSkill();
    }

    @DeleteMapping(value = "/v1/skills",produces = "application/json")
    public String delete() {
        return  skillService.delete();
    }
}
