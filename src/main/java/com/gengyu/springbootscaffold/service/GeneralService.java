package com.gengyu.springbootscaffold.service;

import org.springframework.stereotype.Service;

@Service
public class GeneralService {

    static {
        System.out.println("This is static block!!!!!========================");
    }

}
