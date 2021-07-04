package com.refwise.naukri.naukri.controller;


import com.refwise.naukri.naukri.dto.Job;
import com.refwise.naukri.naukri.service.HelloWorldImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    /*@Autowired field*/
    HelloWorldImpl hello;

    /** Constructor injection **/
    public HelloWorld(HelloWorldImpl hello){
        this.hello = hello;
    }


    @GetMapping(value = "/hello",produces = "application/json")
    public String hello(@RequestParam(value = "name") String name) {
        return String.format("Hello %s!", hello.add(name));
    }

    @PostMapping(value = "/v1/addskill")
    public Job addSkill(@RequestParam String skill, @RequestParam String location ){
        return hello.getJobDesc(skill,location);
    }




}
