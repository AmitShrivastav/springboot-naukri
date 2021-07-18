package com.refwise.naukri.naukri.service;

import com.refwise.naukri.naukri.dao.SkillRepository;
import com.refwise.naukri.naukri.dto.Job;
import com.refwise.naukri.naukri.entity.NaukriSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
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


    @Transactional(isolation = Isolation.SERIALIZABLE,propagation = Propagation.REQUIRED)
    public String addSkill(NaukriSkill naukriSkill)  {
        String response  = "Invalid Entry";

        if(naukriSkill.getSkill() != null && naukriSkill.getSkill().length()>0) {
            skillRepository.save(naukriSkill);
            response = "Successfully Added";
        }
        if(naukriSkill.getSkill().equalsIgnoreCase("Test")){
            throw new RuntimeException();
        }
        return response;
    }
}
