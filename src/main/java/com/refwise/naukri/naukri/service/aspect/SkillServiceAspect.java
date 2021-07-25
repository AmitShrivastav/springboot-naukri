package com.refwise.naukri.naukri.service.aspect;

import com.refwise.naukri.naukri.entity.NaukriSkill;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SkillServiceAspect {

    /**
     *
     * Expression in Advice consider as pointcut
     */
    /*@Before(value = "execution(* com.refwise.naukri.naukri.service.SkillServiceImpl.*(..)) and args(naukriSkill)")
    public void beforeAdvice(JoinPoint joinPoint, NaukriSkill naukriSkill) {
        System.out.println("Before method:" + joinPoint.getSignature());
        //System.out.println("Creating Skill with skill name - " + naukriSkill.getSkill() + ", second location - " + naukriSkill.getLocation() );
    }*/

   /* @Before(value = "execution(* com.refwise.naukri.naukri.service.SkillServiceImpl.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Before method:" + joinPoint.getSignature());
        //System.out.println("Creating Skill with skill name - " + naukriSkill.getSkill() + ", second location - " + naukriSkill.getLocation() );
    }*/
    @Before(value = "execution(* com.refwise.naukri.naukri.service.*.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Before method:" + joinPoint.getSignature());
        //System.out.println("Creating Skill with skill name - " + naukriSkill.getSkill() + ", second location - " + naukriSkill.getLocation() );
    }



}
