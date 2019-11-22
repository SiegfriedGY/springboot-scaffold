package com.gengyu.springbootscaffold.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/general")
public class GeneralController {

    @GetMapping("/test01")
    public String test01(){
        return "test01";
    }

}
