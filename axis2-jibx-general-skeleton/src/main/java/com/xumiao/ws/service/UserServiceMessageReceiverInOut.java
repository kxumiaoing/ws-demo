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
    //
    private static final org.jibx.runtime.IBindingFactory bindingFactory;
    private static final String bindingErrorMessage;
    private static final int[] bindingNamespaceIndexes;
    private static final String[] bindingNamespacePrefixes;

    static {
        org.jibx.runtime.IBindingFactory factory = null;
        String message = null;

        try {
            factory = org.jibx.runtime.BindingDirectory.getFactory("Vo",
                    "com.xumiao.ws.vo",
                    UserServiceMessageReceiverInOut.class.getClassLoader());

            message = null;
        } catch (Exception e) {
            message = e.getMessage();
        }

        bindingFactory = factory;
        bindingErrorMessage = message;

        int[] indexes = null;
        String[] prefixes = null;

        if (factory != null) {
            // check for xsi namespace included
            String[] nsuris = factory.getNamespaces();
            int xsiindex = nsuris.length;

            while ((--xsiindex >= 0) &&
                    !"http://www.w3.org/2001/XMLSchema-instance".equals(
                        nsuris[xsiindex]))
                ;

            // get actual size of index and prefix arrays to be allocated
            int nscount = 0;
            int usecount = nscount;

            if (xsiindex >= 0) {
                usecount++;
            }

            // allocate and initialize the arrays
            indexes = new int[usecount];
            prefixes = new String[usecount];

            if (xsiindex >= 0) {
                indexes[nscount] = xsiindex;
                prefixes[nscount] = "xsi";
            }
        }

        bindingNamespaceIndexes = indexes;
        bindingNamespacePrefixes = prefixes;
    }

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
                    com.xumiao.ws.vo.GetBlankUserResponse getBlankUserResponse = null;
                    com.xumiao.ws.vo.GetBlankUser wrappedParam = (com.xumiao.ws.vo.GetBlankUser) fromOM(msgContext.getEnvelope()
                                                                                                                  .getBody()
                                                                                                                  .getFirstElement(),
                            com.xumiao.ws.vo.GetBlankUser.class);

                    getBlankUserResponse = skel.getBlankUser(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getBlankUserResponse, false,
                            new javax.xml.namespace.QName(
                                "http://localhost:8080/ws/vo",
                                "getBlankUserResponse"));
                } else
                 if ("getUserInfo".equals(methodName)) {
                    com.xumiao.ws.vo.GetUserInfoResponse getUserInfoResponse = null;
                    com.xumiao.ws.vo.GetUserInfo wrappedParam = (com.xumiao.ws.vo.GetUserInfo) fromOM(msgContext.getEnvelope()
                                                                                                                .getBody()
                                                                                                                .getFirstElement(),
                            com.xumiao.ws.vo.GetUserInfo.class);

                    getUserInfoResponse = skel.getUserInfo(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getUserInfoResponse, false,
                            new javax.xml.namespace.QName(
                                "http://localhost:8080/ws/vo",
                                "getUserInfoResponse"));
                } else
                 if ("getUser".equals(methodName)) {
                    com.xumiao.ws.vo.GetUserResponse getUserResponse = null;
                    com.xumiao.ws.vo.GetUser wrappedParam = (com.xumiao.ws.vo.GetUser) fromOM(msgContext.getEnvelope()
                                                                                                        .getBody()
                                                                                                        .getFirstElement(),
                            com.xumiao.ws.vo.GetUser.class);

                    getUserResponse = skel.getUser(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getUserResponse, false,
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

    private static int nsIndex(String uri, String[] uris) {
        for (int i = 0; i < uris.length; i++) {
            if (uri.equals(uris[i])) {
                return i;
            }
        }

        throw new IllegalArgumentException("Namespace " + uri +
            " not found in binding directory information");
    }

    private static void addMappingNamespaces(
        org.apache.axiom.soap.SOAPFactory factory,
        org.apache.axiom.om.OMElement wrapper, String nsuri, String nspref) {
        String[] nss = bindingFactory.getNamespaces();

        for (int i = 0; i < bindingNamespaceIndexes.length; i++) {
            int index = bindingNamespaceIndexes[i];
            String uri = nss[index];
            String prefix = bindingNamespacePrefixes[i];

            if (!nsuri.equals(uri) || !nspref.equals(prefix)) {
                wrapper.declareNamespace(factory.createOMNamespace(uri, prefix));
            }
        }
    }

    private static org.jibx.runtime.impl.UnmarshallingContext getNewUnmarshalContext(
        org.apache.axiom.om.OMElement param)
        throws org.jibx.runtime.JiBXException {
        if (bindingFactory == null) {
            throw new RuntimeException(bindingErrorMessage);
        }

        org.jibx.runtime.impl.UnmarshallingContext ctx = (org.jibx.runtime.impl.UnmarshallingContext) bindingFactory.createUnmarshallingContext();
        org.jibx.runtime.IXMLReader reader = new org.jibx.runtime.impl.StAXReaderWrapper(param.getXMLStreamReaderWithoutCaching(),
                "SOAP-message", true);
        ctx.setDocument(reader);
        ctx.toTag();

        return ctx;
    }

    private org.apache.axiom.om.OMElement mappedChild(Object value,
        org.apache.axiom.om.OMFactory factory) {
        org.jibx.runtime.IMarshallable mrshable = (org.jibx.runtime.IMarshallable) value;
        org.apache.axiom.om.OMDataSource src = new org.apache.axis2.jibx.JiBXDataSource(mrshable,
                bindingFactory);

        return factory.createOMElement(src);
    }

    private static Object fromOM(org.apache.axiom.om.OMElement param, Class type)
        throws org.apache.axis2.AxisFault {
        try {
            org.jibx.runtime.impl.UnmarshallingContext ctx = getNewUnmarshalContext(param);

            return ctx.unmarshalElement(type);
        } catch (Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private org.apache.axiom.om.OMElement toOM(
        com.xumiao.ws.vo.GetBlankUserResponse param,
        org.apache.axiom.soap.SOAPFactory factory, boolean optimizeContent) {
        if (param instanceof org.jibx.runtime.IMarshallable) {
            if (bindingFactory == null) {
                throw new RuntimeException(bindingErrorMessage);
            }

            return (mappedChild(param, factory));
        } else if (param == null) {
            throw new RuntimeException(
                "Cannot bind null value of type com.xumiao.ws.vo.GetBlankUserResponse");
        } else {
            throw new RuntimeException(
                "No JiBX <mapping> defined for class com.xumiao.ws.vo.GetBlankUserResponse");
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.xumiao.ws.vo.GetBlankUserResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName) {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, factory, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.xumiao.ws.vo.GetUserInfoResponse param,
        org.apache.axiom.soap.SOAPFactory factory, boolean optimizeContent) {
        if (param instanceof org.jibx.runtime.IMarshallable) {
            if (bindingFactory == null) {
                throw new RuntimeException(bindingErrorMessage);
            }

            return (mappedChild(param, factory));
        } else if (param == null) {
            throw new RuntimeException(
                "Cannot bind null value of type com.xumiao.ws.vo.GetUserInfoResponse");
        } else {
            throw new RuntimeException(
                "No JiBX <mapping> defined for class com.xumiao.ws.vo.GetUserInfoResponse");
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.xumiao.ws.vo.GetUserInfoResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName) {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, factory, optimizeContent));
        }

        return envelope;
    }

    private org.apache.axiom.om.OMElement toOM(
        com.xumiao.ws.vo.GetUserResponse param,
        org.apache.axiom.soap.SOAPFactory factory, boolean optimizeContent) {
        if (param instanceof org.jibx.runtime.IMarshallable) {
            if (bindingFactory == null) {
                throw new RuntimeException(bindingErrorMessage);
            }

            return (mappedChild(param, factory));
        } else if (param == null) {
            throw new RuntimeException(
                "Cannot bind null value of type com.xumiao.ws.vo.GetUserResponse");
        } else {
            throw new RuntimeException(
                "No JiBX <mapping> defined for class com.xumiao.ws.vo.GetUserResponse");
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        com.xumiao.ws.vo.GetUserResponse param, boolean optimizeContent,
        javax.xml.namespace.QName elementQName) {
        org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();

        if (param != null) {
            envelope.getBody().addChild(toOM(param, factory, optimizeContent));
        }

        return envelope;
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
