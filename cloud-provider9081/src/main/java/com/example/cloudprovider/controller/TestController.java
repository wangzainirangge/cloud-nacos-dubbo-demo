package com.example.cloudprovider.controller;


import com.example.cloudprovider.service.impl.ProviderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/provider")
public class TestController {


    @Autowired
    private ProviderServiceImpl providerService;

    @GetMapping(value = "/test01")
    public String test01(){
        return providerService.sayContext("aaa");
    }


    public void test02(){

    }

}
