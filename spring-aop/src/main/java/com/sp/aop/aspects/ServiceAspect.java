package com.sp.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//Sinifin araya girip aspect islemlerini yapabilmesi icin kullanilmalidir.
@Aspect
@Component
public class ServiceAspect {
    //Herhangi bir kisitlama yapmamak icin * kullaniliyor.
    //Paketin altindaki tum siniflar icin * kullanilmistir.
    @Before("execution(* com.sp.aop.service.*.mesajVer(..))")
     public void mesajVerMetodundanOnce(JoinPoint joinPoint){

        System.out.println("mesajVerButonundanOnce Calisti Parametre :"+ joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
    @After("execution(* com.sp.aop.service.*.*(..))")
    public void mesajVerMetodundanSonra(JoinPoint joinPoint){

        System.out.println("mesajVerButonundanSonra Calisti Parametre :"+ joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());

    }


}
