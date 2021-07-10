package com.refwise.naukri.naukri.controller;

import com.refwise.naukri.naukri.entity.NaukriSkill;
import com.refwise.naukri.naukri.service.SkillServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NaukriSkillController {

    SkillServiceImpl skillService;

    public NaukriSkillController(SkillServiceImpl skillService){
     this.skillService = skillService;
    }

    @GetMapping(value = "/v1/skills",produces = "application/json")
    public ResponseEntity<List<NaukriSkill>> allSkill() {
        return  new ResponseEntity<List<NaukriSkill>>(skillService.getSkill(), HttpStatus.OK);
    }

    @DeleteMapping(value = "/v1/skills",produces = "application/json")
    public ResponseEntity<String> delete() {
        return  new ResponseEntity<String>(skillService.delete(),HttpStatus.OK);
    }

    @PostMapping(value = "/v1/skills",produces = "application/json")
    public ResponseEntity<String> addSkill(@RequestBody NaukriSkill naukriSkill ) {
        return  new ResponseEntity<String>(skillService.addSkill(naukriSkill),HttpStatus.OK);
    }
}
