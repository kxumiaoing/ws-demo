/**
 * UserServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package com.xumiao.ws.service;


/**
 *  UserServiceMessageReceiverInOut message receiver
 */
public class UserServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            UserServiceSkeletonInterface skel = (UserServiceSkeletonInterface) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("getBlankUser".equals(methodName)) {
                    com.xumiao.ws.vo.GetBlankUserResponse getBlankUserResponse7 = null;
                    com.xumiao.ws.vo.GetBlankUser wrappedParam = (com.xumiao.ws.vo.GetBlankUser) fromOM(msgContext.getEnvelope()
                                                                                                                  .getBody()
                                                                                                                  .getFirstElement(),
                            com.xumiao.ws.vo.GetBlankUser.class);

                    getBlankUserResponse7 = skel.getBlankUser(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getBlankUserResponse7, false,
                            new javax.xml.namespace.QName(
                                "http://localhost:8080/ws/vo",
                                "getBlankUserResponse"));
                } else
                 if ("getUserInfo".equals(methodName)) {
                    com.xumiao.ws.vo.GetUserInfoResponse getUserInfoResponse9 = null;
                    com.xumiao.ws.vo.GetUserInfo wrappedParam = (com.xumiao.ws.vo.GetUserInfo) fromOM(msgContext.getEnvelope()
                                                                                                                .getBody()
                                                                                                                .getFirstElement(),
                            com.xumiao.ws.vo.GetUserInfo.class);

                    getUserInfoResponse9 = skel.getUserInfo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getUserInfoResponse9, false,
                            new javax.xml.namespace.QName(
                                "http://localhost:8080/ws/vo",
                                "getUserInfoResponse"));
                } else
                 if ("getUser".equals(methodName)) {
                    com.xumiao.ws.vo.GetUserResponse getUserResponse11 = null;
                    com.xumiao.ws.vo.GetUser wrappedParam = (com.xumiao.ws.vo.GetUser) fromOM(msgContext.getEnvelope()
                                                                                                        .getBody()
                                                                                                        .getFirstElement(),
                            com.xumiao.ws.vo.GetUser.class);

                    getUserResponse11 = skel.getUser(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getUserResponse11, false,
                            new javax.xml.namespace.QName(
                                "http://localhost:8080/ws/vo", "getUserResponse"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        com.xumiao.ws.vo.GetBlankUser param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.xumiao.ws.vo.GetBlankUser.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.xumiao.ws.vo.GetBlankUserResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.xumiao.ws.vo.GetBlankUserResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.xumiao.ws.vo.GetUserInfo param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.xumiao.ws.vo.GetUserInfo.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.xumiao.ws.vo.GetUserInfoResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.xumiao.ws.vo.GetUserInfoResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(com.xumiao.ws.vo.GetUser param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.xumiao.ws.vo.GetUser.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        com.xumiao.ws.vo.GetUserResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(com.xumiao.ws.vo.GetUserResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.xumiao.ws.vo.GetBlankUserResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.xumiao.ws.vo.GetBlankUserResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.xumiao.ws.vo.GetBlankUserResponse wrapgetBlankUser() {
        com.xumiao.ws.vo.GetBlankUserResponse wrappedElement = new com.xumiao.ws.vo.GetBlankUserResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.xumiao.ws.vo.GetUserInfoResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.xumiao.ws.vo.GetUserInfoResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.xumiao.ws.vo.GetUserInfoResponse wrapgetUserInfo() {
        com.xumiao.ws.vo.GetUserInfoResponse wrappedElement = new com.xumiao.ws.vo.GetUserInfoResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.xumiao.ws.vo.GetUserResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    com.xumiao.ws.vo.GetUserResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private com.xumiao.ws.vo.GetUserResponse wrapgetUser() {
        com.xumiao.ws.vo.GetUserResponse wrappedElement = new com.xumiao.ws.vo.GetUserResponse();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (com.xumiao.ws.vo.GetBlankUser.class.equals(type)) {
                return com.xumiao.ws.vo.GetBlankUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.xumiao.ws.vo.GetBlankUserResponse.class.equals(type)) {
                return com.xumiao.ws.vo.GetBlankUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.xumiao.ws.vo.GetUser.class.equals(type)) {
                return com.xumiao.ws.vo.GetUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.xumiao.ws.vo.GetUserInfo.class.equals(type)) {
                return com.xumiao.ws.vo.GetUserInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.xumiao.ws.vo.GetUserInfoResponse.class.equals(type)) {
                return com.xumiao.ws.vo.GetUserInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (com.xumiao.ws.vo.GetUserResponse.class.equals(type)) {
                return com.xumiao.ws.vo.GetUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
