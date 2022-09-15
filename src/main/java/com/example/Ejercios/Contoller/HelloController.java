package com.example.Ejercios.Contoller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holamundo")
public class HelloController {
    @Value("${app.message}")
    String message;
   //@Value("${app.varenv}")
    //String name;
    @GetMapping("/hello")
    public String hello(){
        return "hola"+message;
    }
}
