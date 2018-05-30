/**
 * UserServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package com.xumiao.ws.client;


/*
 *  UserServiceStub java implementation
 */
public class UserServiceStub extends org.apache.axis2.client.Stub
    implements UserService {
    private static int counter = 0;

    //http://localhost:8080/jibxske/services/UserService.UserServiceHttpSoap12Endpoint/
    private static final org.jibx.runtime.IBindingFactory bindingFactory;
    private static final String bindingErrorMessage;
    private static final int[] bindingNamespaceIndexes;
    private static final String[] bindingNamespacePrefixes;
    private static final String _type_name0;

    static {
        org.jibx.runtime.IBindingFactory factory = null;
        String message = null;

        try {
            factory = org.jibx.runtime.BindingDirectory.getFactory("Axis2Vo",
                    "com.xumiao.ws.vo", UserServiceStub.class.getClassLoader());

            message = null;
        } catch (Exception e) {
            message = e.getMessage();
        }

        bindingFactory = factory;
        bindingErrorMessage = message;

        _type_name0 = "{http://localhost:8080/ws/vo}:User";

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
            int nscount = 1;
            int usecount = nscount;

            if (xsiindex >= 0) {
                usecount++;
            }

            // allocate and initialize the arrays
            indexes = new int[usecount];
            prefixes = new String[usecount];

            indexes[0] = nsIndex("http://localhost:8080/ws/vo", nsuris);
            prefixes[0] = "";

            if (xsiindex >= 0) {
                indexes[nscount] = xsiindex;
                prefixes[nscount] = "xsi";
            }
        }

        bindingNamespaceIndexes = indexes;
        bindingNamespacePrefixes = prefixes;
    }

    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();
    private javax.xml.namespace.QName[] opNameArray = null;

    /**
     *Constructor that takes in a configContext
     */
    public UserServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public UserServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _serviceClient.getOptions()
                      .setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

        //Set the soap version
        _serviceClient.getOptions()
                      .setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
    }

    /**
     * Default Constructor
     */
    public UserServiceStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "http://localhost:8080/jibxske/services/UserService.UserServiceHttpSoap12Endpoint/");
    }

    /**
     * Default Constructor
     */
    public UserServiceStub() throws org.apache.axis2.AxisFault {
        this(
            "http://localhost:8080/jibxske/services/UserService.UserServiceHttpSoap12Endpoint/");
    }

    /**
     * Constructor taking the target endpoint
     */
    public UserServiceStub(java.lang.String targetEndpoint)
        throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
        "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("UserService" +
                getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[3];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://localhost:8080/ws/service", "getBlankUser"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://localhost:8080/ws/service", "getUserInfo"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "http://localhost:8080/ws/service", "getUser"));
        _service.addOperation(__operation);

        _operations[2] = __operation;
    }

    //populates the faults
    private void populateFaults() {
    }

    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        if (opNameArray == null) {
            return false;
        }

        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }

        return false;
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
     * Auto generated synchronous call method
     *
     * @see com.xumiao.ws.client.UserService#getBlankUser
     * @param args0
     */
    public com.xumiao.ws.vo.User getBlankUser(com.xumiao.ws.vo.User args0)
        throws java.rmi.RemoteException {
        // create message context
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            int _opIndex = 0;
            javax.xml.namespace.QName opname = _operations[_opIndex].getName();
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(opname);
            _operationClient.getOptions().setAction("urn:getBlankUser");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with the payload
            org.apache.axiom.soap.SOAPEnvelope env = createEnvelope(_operationClient.getOptions());
            org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions()
                                                                                   .getSoapVersionURI());
            org.apache.axiom.om.OMElement wrapper = factory.createOMElement("getBlankUser",
                    "http://localhost:8080/ws/vo", "");

            wrapper.declareDefaultNamespace("http://localhost:8080/ws/vo");

            addMappingNamespaces(factory, wrapper,
                "http://localhost:8080/ws/vo", "");

            env.getBody().addChild(wrapper);

            org.apache.axiom.om.OMElement child;

            if (args0 == null) {
                // just skip optional element
            } else {
                if (bindingFactory == null) {
                    throw new RuntimeException(bindingErrorMessage);
                }

                org.apache.axiom.om.OMDataSource src = new org.apache.axis2.jibx.JiBXDataSource(args0,
                        _type_name0, "args0", "http://localhost:8080/ws/vo",
                        "", bindingNamespaceIndexes, bindingNamespacePrefixes,
                        bindingFactory);
                child = factory.createOMElement(src);

                wrapper.addChild(child);
            }

            // add SOAP headers
            _serviceClient.addHeadersToEnvelope(env);

            // set that envelope on the message context
            _messageContext.setEnvelope(env);

            // add the message context to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.om.OMElement _response = _returnMessageContext.getEnvelope()
                                                                           .getBody()
                                                                           .getFirstElement();

            if ((_response != null) &&
                    "getBlankUserResponse".equals(_response.getLocalName()) &&
                    "http://localhost:8080/ws/vo".equals(
                        _response.getNamespace().getNamespaceURI())) {
                org.jibx.runtime.impl.UnmarshallingContext uctx = getNewUnmarshalContext(_response);
                uctx.parsePastStartTag("http://localhost:8080/ws/vo",
                    "getBlankUserResponse");

                int index;
                com.xumiao.ws.vo.User return0 = null;

                if (uctx.isAt("http://localhost:8080/ws/vo", "return")) {
                    if (uctx.attributeBoolean(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil", false)) {
                        uctx.skipElement();
                    } else {
                        return0 = (com.xumiao.ws.vo.User) uctx.getUnmarshaller(_type_name0)
                                                              .unmarshal(new com.xumiao.ws.vo.User(),
                                uctx);

                        uctx.parsePastCurrentEndTag("http://localhost:8080/ws/vo",
                            "return");
                    }
                }

                return return0;
            } else {
                throw new org.apache.axis2.AxisFault(
                    "Missing expected return wrapper element {http://localhost:8080/ws/vo}getBlankUserResponse");
            }
        } catch (Exception e) {
            Exception outex = convertException(e);

            // should never happen, but just in case
            throw new RuntimeException("Unexpected exception type: " +
                outex.getClass().getName(), outex);
        } finally {
            _messageContext.getTransportOut().getSender()
                           .cleanup(_messageContext);
        }
    }

    /**
     * Auto generated synchronous call method
     *
     * @see com.xumiao.ws.client.UserService#getUserInfo
     * @param args0
     */
    public java.lang.String getUserInfo(com.xumiao.ws.vo.User args0)
        throws java.rmi.RemoteException {
        // create message context
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            int _opIndex = 1;
            javax.xml.namespace.QName opname = _operations[_opIndex].getName();
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(opname);
            _operationClient.getOptions().setAction("urn:getUserInfo");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with the payload
            org.apache.axiom.soap.SOAPEnvelope env = createEnvelope(_operationClient.getOptions());
            org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions()
                                                                                   .getSoapVersionURI());
            org.apache.axiom.om.OMElement wrapper = factory.createOMElement("getUserInfo",
                    "http://localhost:8080/ws/vo", "");

            wrapper.declareDefaultNamespace("http://localhost:8080/ws/vo");

            addMappingNamespaces(factory, wrapper,
                "http://localhost:8080/ws/vo", "");

            env.getBody().addChild(wrapper);

            org.apache.axiom.om.OMElement child;

            if (args0 == null) {
                // just skip optional element
            } else {
                if (bindingFactory == null) {
                    throw new RuntimeException(bindingErrorMessage);
                }

                org.apache.axiom.om.OMDataSource src = new org.apache.axis2.jibx.JiBXDataSource(args0,
                        _type_name0, "args0", "http://localhost:8080/ws/vo",
                        "", bindingNamespaceIndexes, bindingNamespacePrefixes,
                        bindingFactory);
                child = factory.createOMElement(src);

                wrapper.addChild(child);
            }

            // add SOAP headers
            _serviceClient.addHeadersToEnvelope(env);

            // set that envelope on the message context
            _messageContext.setEnvelope(env);

            // add the message context to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.om.OMElement _response = _returnMessageContext.getEnvelope()
                                                                           .getBody()
                                                                           .getFirstElement();

            if ((_response != null) &&
                    "getUserInfoResponse".equals(_response.getLocalName()) &&
                    "http://localhost:8080/ws/vo".equals(
                        _response.getNamespace().getNamespaceURI())) {
                org.jibx.runtime.impl.UnmarshallingContext uctx = getNewUnmarshalContext(_response);
                uctx.parsePastStartTag("http://localhost:8080/ws/vo",
                    "getUserInfoResponse");

                int index;
                java.lang.String return0 = null;

                if (uctx.isAt("http://localhost:8080/ws/vo", "return")) {
                    if (uctx.attributeBoolean(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil", false)) {
                        uctx.skipElement();
                    } else {
                        return0 = (java.lang.String) uctx.parseElementText("http://localhost:8080/ws/vo",
                                "return");
                    }
                }

                return return0;
            } else {
                throw new org.apache.axis2.AxisFault(
                    "Missing expected return wrapper element {http://localhost:8080/ws/vo}getUserInfoResponse");
            }
        } catch (Exception e) {
            Exception outex = convertException(e);

            // should never happen, but just in case
            throw new RuntimeException("Unexpected exception type: " +
                outex.getClass().getName(), outex);
        } finally {
            _messageContext.getTransportOut().getSender()
                           .cleanup(_messageContext);
        }
    }

    /**
     * Auto generated synchronous call method
     *
     * @see com.xumiao.ws.client.UserService#getUser
     * @param args0
     * @param args1
     */
    public com.xumiao.ws.vo.User getUser(java.lang.String args0, int args1)
        throws java.rmi.RemoteException {
        // create message context
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            int _opIndex = 2;
            javax.xml.namespace.QName opname = _operations[_opIndex].getName();
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(opname);
            _operationClient.getOptions().setAction("urn:getUser");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            // create SOAP envelope with the payload
            org.apache.axiom.soap.SOAPEnvelope env = createEnvelope(_operationClient.getOptions());
            org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient.getOptions()
                                                                                   .getSoapVersionURI());
            org.apache.axiom.om.OMElement wrapper = factory.createOMElement("getUser",
                    "http://localhost:8080/ws/vo", "");

            wrapper.declareDefaultNamespace("http://localhost:8080/ws/vo");

            wrapper.declareNamespace(factory.createOMNamespace(
                    "http://localhost:8080/ws/vo", ""));

            env.getBody().addChild(wrapper);

            org.apache.axiom.om.OMElement child;

            if (args0 == null) {
                // just skip optional element
            } else {
                child = factory.createOMElement("args0",
                        "http://localhost:8080/ws/vo", "");
                child.setText(args0);

                wrapper.addChild(child);
            }

            child = factory.createOMElement("args1",
                    "http://localhost:8080/ws/vo", "");
            child.setText(org.jibx.runtime.Utility.serializeInt(args1));

            wrapper.addChild(child);

            // add SOAP headers
            _serviceClient.addHeadersToEnvelope(env);

            // set that envelope on the message context
            _messageContext.setEnvelope(env);

            // add the message context to the operation client
            _operationClient.addMessageContext(_messageContext);

            // execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.om.OMElement _response = _returnMessageContext.getEnvelope()
                                                                           .getBody()
                                                                           .getFirstElement();

            if ((_response != null) &&
                    "getUserResponse".equals(_response.getLocalName()) &&
                    "http://localhost:8080/ws/vo".equals(
                        _response.getNamespace().getNamespaceURI())) {
                org.jibx.runtime.impl.UnmarshallingContext uctx = getNewUnmarshalContext(_response);
                uctx.parsePastStartTag("http://localhost:8080/ws/vo",
                    "getUserResponse");

                int index;
                com.xumiao.ws.vo.User return0 = null;

                if (uctx.isAt("http://localhost:8080/ws/vo", "return")) {
                    if (uctx.attributeBoolean(
                                "http://www.w3.org/2001/XMLSchema-instance",
                                "nil", false)) {
                        uctx.skipElement();
                    } else {
                        return0 = (com.xumiao.ws.vo.User) uctx.getUnmarshaller(_type_name0)
                                                              .unmarshal(new com.xumiao.ws.vo.User(),
                                uctx);

                        uctx.parsePastCurrentEndTag("http://localhost:8080/ws/vo",
                            "return");
                    }
                }

                return return0;
            } else {
                throw new org.apache.axis2.AxisFault(
                    "Missing expected return wrapper element {http://localhost:8080/ws/vo}getUserResponse");
            }
        } catch (Exception e) {
            Exception outex = convertException(e);

            // should never happen, but just in case
            throw new RuntimeException("Unexpected exception type: " +
                outex.getClass().getName(), outex);
        } finally {
            _messageContext.getTransportOut().getSender()
                           .cleanup(_messageContext);
        }
    }

    private Exception convertException(Exception ex)
        throws java.rmi.RemoteException {
        if (ex instanceof org.apache.axis2.AxisFault) {
            org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) ex;
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    try {
                        // first create the actual exception
                        String exceptionClassName = (String) faultExceptionClassNameMap.get(faultElt.getQName());
                        Class exceptionClass = Class.forName(exceptionClassName);
                        Exception e = (Exception) exceptionClass.newInstance();

                        // build the message object from the details
                        String messageClassName = (String) faultMessageMap.get(faultElt.getQName());
                        Class messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt, messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new Class[] { messageClass });
                        m.invoke(e, new Object[] { messageObject });

                        return e;
                    } catch (ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    } catch (InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } else if (ex instanceof RuntimeException) {
            throw (RuntimeException) ex;
        } else if (ex instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException) ex;
        } else {
            throw org.apache.axis2.AxisFault.makeFault(ex);
        }
    }
}
