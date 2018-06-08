package com.xumiao.ws.service.impl;

import com.xumiao.ws.service.HelloService;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(endpointInterface = "com.xumiao.ws.service.HelloService",targetNamespace = "http://localhost:8080/ws/services",serviceName = "HelloService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String msg) {
        return "hello, " + msg;
    }
}
