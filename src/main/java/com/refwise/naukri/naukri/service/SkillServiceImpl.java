package com.refwise.naukri.naukri.service;

import com.refwise.naukri.naukri.dao.SkillRepository;
import com.refwise.naukri.naukri.dto.Job;
import com.refwise.naukri.naukri.entity.NaukriSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkillServiceImpl {

    @Autowired
    SkillRepository skillRepository;

    public List<NaukriSkill> getSkill() {
        List<NaukriSkill>  listNaukriSkill = new ArrayList<>();

        for(NaukriSkill naukri : skillRepository.findAll()){
            listNaukriSkill.add(naukri);
        }
    return listNaukriSkill;
    }

    public String delete(){
        try {
            skillRepository.deleteAll();
            return "Successfully Deleted";
        }catch (Exception e)
        {
            return "Issue in delete";
        }
    }


}
