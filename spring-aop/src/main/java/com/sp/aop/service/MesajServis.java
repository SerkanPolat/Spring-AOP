package com.sp.aop.service;


import org.springframework.stereotype.Component;

@Component
public class MesajServis {
    public String mesajVer(String param){
        System.out.println("Metod Mesaj Veriyor : "+param);
        return param;
    }
}
