package com.xumiao.ws.client;

import com.xumiao.ws.vo.User;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.StringReader;
import java.net.URL;

public class CXFSoapClient {
    public static void main(String[] args) throws Exception {
        URL wsdlURL = new URL("http://localhost:8080/jaxb/services/UserService?wsdl");
        QName serviceName = new QName("http://localhost:8080/jaxb/services","UserSoapService");
        QName portName = new QName("http://localhost:8080/jaxb/services","UserServicePort");
        Service service = Service.create(wsdlURL,serviceName);
        Dispatch<Source> dispatch = service.createDispatch(portName,Source.class,Service.Mode.PAYLOAD);
        String getUserInfoPayload = "<ser:getUserInfo xmlns:ser=\"http://localhost:8080/jaxb/services\"><user><name>张三</name><age>10</age></user></ser:getUserInfo>";
        String getUserPayload = "<ser:getUser xmlns:ser=\"http://localhost:8080/jaxb/services\"><name>李四</name><age>11</age></ser:getUser>";
        String getBlankUserPayload = "<ser:getBlankUser xmlns:ser=\"http://localhost:8080/jaxb/services\"><user><name>王五</name><age>12</age></user></ser:getBlankUser>";

//        User user = new User("张三",10);
//        JAXBContext context = JAXBContext.newInstance(User.class);
//        Marshaller marshaller = context.createMarshaller();
//        StringWriter writer = new StringWriter();
//
//        marshaller.setProperty(Marshaller.JAXB_FRAGMENT,true);
//        marshaller.marshal(user,writer);
//
//        System.out.println(writer.toString());
//        User user = (User) context.createUnmarshaller().unmarshal(node);

        Source getUserInfoSource = new StreamSource(new StringReader(getUserInfoPayload));
        Source getUserInfoResponseSource = dispatch.invoke(getUserInfoSource);
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMResult getUserInfoResult = new DOMResult();
        XPath path = XPathFactory.newInstance().newXPath();

        transformer.transform(getUserInfoResponseSource, getUserInfoResult);

        NodeList nodeList = (NodeList) path.evaluate("//userInfo", getUserInfoResult.getNode(), XPathConstants.NODESET);

        System.out.println("=========================getUserInfo ======================== ");
        System.out.println(nodeList.item(0).getTextContent());

        Source getUserSource = new StreamSource(new StringReader(getUserPayload));
        Source getUserResponseSource = dispatch.invoke(getUserSource);
        DOMResult getUserResult = new DOMResult();

        transformer.transform(getUserResponseSource, getUserResult);

        nodeList = (NodeList) path.evaluate("//user", getUserResult.getNode(), XPathConstants.NODESET);

        JAXBContext context = JAXBContext.newInstance(User.class);
        User user = (User) context.createUnmarshaller().unmarshal(nodeList.item(0));

        System.out.println("=========================getUser ======================== ");
        System.out.println(user);

        /**
         *  can't invoke getUser and getBlankUser at same time because the name value of @XmlRootElement on User class affects JAXB unmarshalling.
         * */
//        Source getBlankUserSource = new StreamSource(new StringReader(getBlankUserPayload));
//        Source getBlankUserResponseSource = dispatch.invoke(getBlankUserSource);
//        DOMResult getBlankUserResult = new DOMResult();
//
//        transformer.transform(getBlankUserResponseSource, getBlankUserResult);
//
//        nodeList = (NodeList) path.evaluate("//blankUser", getBlankUserResult.getNode(), XPathConstants.NODESET);
//        user = (User) context.createUnmarshaller().unmarshal(nodeList.item(0));
//
//        System.out.println("=========================getBlankUser ======================== ");
//        System.out.println(user);
    }
}
