package com.gengyu.springbootscaffold.controller;

import com.gengyu.springbootscaffold.service.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/general")
public class GeneralController {

    @Autowired
    private GeneralService generalService;

    @GetMapping("/test01")
    public String test01(){
        return "test01";
    }

    @GetMapping("/test02")
    public void test02(){

    }

}
