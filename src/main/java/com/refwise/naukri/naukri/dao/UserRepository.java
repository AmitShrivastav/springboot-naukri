package com.refwise.naukri.naukri.dao;

import com.refwise.naukri.naukri.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}