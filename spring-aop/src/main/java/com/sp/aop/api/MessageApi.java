package com.sp.aop.api;

import com.sp.aop.service.MesajServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mesaj")
public class MessageApi {
    @Autowired
    private MesajServis mesajServis;

    @PostMapping
    public ResponseEntity<String> ornekMetod(@RequestBody String message){
        return ResponseEntity.ok(mesajServis.mesajVer(message));
    }
    @GetMapping
    public String deneme(){
        return "Calsiiyor.";
    }

}
