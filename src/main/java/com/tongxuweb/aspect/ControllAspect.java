package com.tongxuweb.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by higgs on 16/12/1.
 */
@Component
@Aspect
public class ControllAspect {


    @Before("execution(* com.tongxuweb.service.*.selectUserById(..))")
    private void pointCut11() {
        System.out.println("aaa1111aaa");
    }


    @After("execution(* com.tongxuweb.service.*.selectUserById(..))")
    private void pointCu11t11() {
        System.out.println("aaa1111aaa");
    }


    public ControllAspect() {

        System.out.println("aaaaaa");
    }

}
