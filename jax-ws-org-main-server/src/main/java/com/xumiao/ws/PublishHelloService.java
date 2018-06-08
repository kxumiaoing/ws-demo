package com.xumiao.ws;

import com.xumiao.ws.service.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

public class PublishHelloService {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/jaxmain/services/HelloService",new HelloServiceImpl());
    }
}
