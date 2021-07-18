package com.refwise.naukri.naukri.service.services;

import com.refwise.naukri.naukri.entity.Recruiter;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;


public interface RecruitmentService {

    default Optional<String> addRecruiter(Recruiter recruiter){
        return Optional.empty();
    }
    default Optional<List<Recruiter>> all(){  return Optional.empty();  }
    default Optional<Recruiter> getByName(String recruiterName){  return Optional.empty();  }
    default Optional<String> delete(Recruiter recruiter){  return Optional.empty();  }
}
