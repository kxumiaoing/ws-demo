package com.xumiao.ws.client;

import com.xumiao.ws.vo.User;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;

import javax.xml.namespace.QName;
import java.net.URL;

public class Axis1Client {
    public static void main(String[] args) throws Exception{
        System.out.println(sayHello("张三"));
        System.out.println(getUserInfo("张三",10));
        System.out.println(getUser("李四",11));
        System.out.println(getBlankUser("王五",12));
    }

    public static String sayHello(String msg) throws Exception{
        String endpoint = "http://localhost:8080/jwsorg/HelloService.jws";
        String namespace = "http://localhost:8080/jwsorg/HelloService.jws";
        String operationName = "sayHello";
        Service service = new Service();
        Call call = (Call) service.createCall();

        call.setTargetEndpointAddress(new URL(endpoint));
        call.setOperationName(new QName(namespace,operationName));

        String ret = (String) call.invoke(new Object[]{msg});

        return ret;
    }

    public static String getUserInfo(String name,int age) throws Exception{
        String endpoint = "http://localhost:8080/wsddorg/services/UserService";
        String namespace = "http://localhost:8080/wsddorg/services/UserService";
        String operationName = "getUserInfo";
        Service service = new Service();
        Call call = (Call) service.createCall();

        call.setTargetEndpointAddress(new URL(endpoint));
        call.setOperationName(new QName(namespace,operationName));
        call.registerTypeMapping(User.class,new QName("http://localhost:8080/ws/vo","User"),BeanSerializerFactory.class,BeanDeserializerFactory.class);

        String ret = (String) call.invoke(new Object[]{new User(name,age)});

        return ret;
    }

    public static User getUser(String name,int age) throws Exception{
        String endpoint = "http://localhost:8080/wsddorg/services/UserService";
        String namespace = "http://localhost:8080/wsddorg/services/UserService";
        String operationName = "getUser";
        Service service = new Service();
        Call call = (Call) service.createCall();

        call.setTargetEndpointAddress(new URL(endpoint));
        call.setOperationName(new QName(namespace,operationName));
        call.registerTypeMapping(User.class,new QName("http://localhost:8080/ws/vo","User"),BeanSerializerFactory.class,BeanDeserializerFactory.class);

        User ret = (User) call.invoke(new Object[]{name,age});

        return ret;
    }

    public static User getBlankUser(String name,int age) throws Exception{
        String endpoint = "http://localhost:8080/wsddorg/services/UserService";
        String namespace = "http://localhost:8080/wsddorg/services/UserService";
        String operationName = "getBlankUser";
        Service service = new Service();
        Call call = (Call) service.createCall();

        call.setTargetEndpointAddress(new URL(endpoint));
        call.setOperationName(new QName(namespace,operationName));
        call.registerTypeMapping(User.class,new QName("http://localhost:8080/ws/vo","User"),BeanSerializerFactory.class,BeanDeserializerFactory.class);

        User ret = (User) call.invoke(new Object[]{new User(name,age)});

        return ret;
    }
}
