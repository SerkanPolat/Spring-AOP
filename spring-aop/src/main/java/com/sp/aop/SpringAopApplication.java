package com.sp.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//Projede Aspect kullanimini tanimlanir.
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringAopApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpringAopApplication.class,args);

    }
}
