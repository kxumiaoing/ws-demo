
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.xumiao.ws.service.impl;

import com.xumiao.ws.service.UserService;
import com.xumiao.ws.vo.User;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-13T17:27:38.372+08:00
 * Generated source version: 3.2.4
 *
 */

@javax.jws.WebService(
                      portName = "UserServicePort",
                      targetNamespace = "http://localhost:8080/jaxb/services",
                      wsdlLocation = "http://localhost:8080/jaxb/services/UserService?wsdl",
                      endpointInterface = "com.xumiao.ws.service.UserService")

public class UserServiceImpl implements UserService {

    private static final Logger LOG = Logger.getLogger(UserServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.xumiao.ws.service.UserService#getBlankUser(com.xumiao.ws.vo.User user)*
     */
    public com.xumiao.ws.vo.User getBlankUser(com.xumiao.ws.vo.User user) {
        return user;
    }

    /* (non-Javadoc)
     * @see com.xumiao.ws.service.UserService#getUserInfo(com.xumiao.ws.vo.User user)*
     */
    public java.lang.String getUserInfo(com.xumiao.ws.vo.User user) {
        return "姓名：" + user.getName() + "，年龄：" + user.getAge();
    }

    /* (non-Javadoc)
     * @see com.xumiao.ws.service.UserService#getUser(java.lang.String name, int age)*
     */
    public com.xumiao.ws.vo.User getUser(java.lang.String name, int age) {
        User user = new User();

        user.setName(name);
        user.setAge(age);

        return user;
    }

}
