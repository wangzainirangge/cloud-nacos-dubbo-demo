package com.example.cloudconsumer.controller;

import com.example.cloudapicommons.service.NacosService;
//import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/consumer")
public class TestController {


    //@DubboReference(loadbalance = "random")随机
    //@DubboReference(loadbalance = "roundrobin")//轮询
    @Reference
    private NacosService nacosService;

    @GetMapping(value = "/test01")
    public String test01(){
        System.out.println("consumer success");
        return nacosService.nameService("consumer request");
    }

}
