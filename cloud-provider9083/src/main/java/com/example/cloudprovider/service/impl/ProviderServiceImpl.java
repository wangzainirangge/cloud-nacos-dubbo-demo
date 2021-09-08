package com.example.cloudprovider.service.impl;


import com.example.cloudapicommons.service.NacosService;
import org.apache.dubbo.config.annotation.Service;
//import org.apache.dubbo.config.annotation.DubboService;
//import org.springframework.stereotype.Service;

//@DubboService
@Service
public class ProviderServiceImpl implements NacosService {


    @Override
    public String sayContext(String content) {
        System.out.println(content);
        return "sayContext provider9083";
    }

    @Override
    public String nameService(String serviceName) {
        System.out.println(serviceName);
        return "nameService provider9083";
    }
}
