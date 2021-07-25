package com.refwise.naukri.naukri.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;




@Aspect
@Configuration
public class NaukriCommonAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @After("execution(* com.refwise.naukri.naukri.service.SkillServiceImpl.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("After method:"+joinPoint.getSignature());
    }

}
