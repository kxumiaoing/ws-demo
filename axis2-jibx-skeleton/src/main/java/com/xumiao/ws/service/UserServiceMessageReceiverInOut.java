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
    private static final String _type_name0;

    static {
        org.jibx.runtime.IBindingFactory factory = null;
        String message = null;

        try {
            factory = org.jibx.runtime.BindingDirectory.getFactory("Axis2Vo",
                    "com.xumiao.ws.vo",
                    UserServiceMessageReceiverInOut.class.getClassLoader());

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
                    envelope = jibxReceiver0(msgContext.getEnvelope().getBody()
                                                       .getFirstElement(),
                            skel, getSOAPFactory(msgContext));
                } else
                 if ("getUserInfo".equals(methodName)) {
                    envelope = jibxReceiver1(msgContext.getEnvelope().getBody()
                                                       .getFirstElement(),
                            skel, getSOAPFactory(msgContext));
                } else
                 if ("getUser".equals(methodName)) {
                    envelope = jibxReceiver2(msgContext.getEnvelope().getBody()
                                                       .getFirstElement(),
                            skel, getSOAPFactory(msgContext));
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

    public org.apache.axiom.soap.SOAPEnvelope jibxReceiver0(
        org.apache.axiom.om.OMElement element,
        UserServiceSkeletonInterface skel,
        org.apache.axiom.soap.SOAPFactory factory)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = null;

        try {
            org.jibx.runtime.impl.UnmarshallingContext uctx = getNewUnmarshalContext(element);
            uctx.next();

            int index;
            com.xumiao.ws.vo.User args0 = null;

            if (uctx.isAt("http://localhost:8080/ws/vo", "args0")) {
                if (uctx.attributeBoolean(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil",
                            false)) {
                    uctx.skipElement();
                } else {
                    args0 = (com.xumiao.ws.vo.User) uctx.getUnmarshaller(_type_name0)
                                                        .unmarshal(new com.xumiao.ws.vo.User(),
                            uctx);

                    uctx.parsePastCurrentEndTag("http://localhost:8080/ws/vo",
                        "args0");
                }
            }

            envelope = factory.getDefaultEnvelope();

            org.apache.axiom.om.OMElement wrapper = factory.createOMElement("getBlankUserResponse",
                    "http://localhost:8080/ws/vo", "");

            wrapper.declareDefaultNamespace("http://localhost:8080/ws/vo");

            addMappingNamespaces(factory, wrapper,
                "http://localhost:8080/ws/vo", "");

            envelope.getBody().addChild(wrapper);

            com.xumiao.ws.vo.User result = skel.getBlankUser(args0);

            if (result == null) {
                // just skip optional element
            } else {
                if (bindingFactory == null) {
                    throw new RuntimeException(bindingErrorMessage);
                }

                org.apache.axiom.om.OMDataSource src = new org.apache.axis2.jibx.JiBXDataSource(result,
                        _type_name0, "return", "http://localhost:8080/ws/vo",
                        "", bindingNamespaceIndexes, bindingNamespacePrefixes,
                        bindingFactory);
                org.apache.axiom.om.OMElement child = factory.createOMElement(src);
                wrapper.addChild(child);
            }
        } catch (org.jibx.runtime.JiBXException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return envelope;
    }

    public org.apache.axiom.soap.SOAPEnvelope jibxReceiver1(
        org.apache.axiom.om.OMElement element,
        UserServiceSkeletonInterface skel,
        org.apache.axiom.soap.SOAPFactory factory)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = null;

        try {
            org.jibx.runtime.impl.UnmarshallingContext uctx = getNewUnmarshalContext(element);
            uctx.next();

            int index;
            com.xumiao.ws.vo.User args0 = null;

            if (uctx.isAt("http://localhost:8080/ws/vo", "args0")) {
                if (uctx.attributeBoolean(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil",
                            false)) {
                    uctx.skipElement();
                } else {
                    args0 = (com.xumiao.ws.vo.User) uctx.getUnmarshaller(_type_name0)
                                                        .unmarshal(new com.xumiao.ws.vo.User(),
                            uctx);

                    uctx.parsePastCurrentEndTag("http://localhost:8080/ws/vo",
                        "args0");
                }
            }

            envelope = factory.getDefaultEnvelope();

            org.apache.axiom.om.OMElement wrapper = factory.createOMElement("getUserInfoResponse",
                    "http://localhost:8080/ws/vo", "");

            wrapper.declareDefaultNamespace("http://localhost:8080/ws/vo");

            wrapper.declareNamespace(factory.createOMNamespace(
                    "http://localhost:8080/ws/vo", ""));

            envelope.getBody().addChild(wrapper);

            java.lang.String result = skel.getUserInfo(args0);

            org.apache.axiom.om.OMElement child = factory.createOMElement("return",
                    "http://localhost:8080/ws/vo", "");

            if (result == null) {
                org.apache.axiom.om.OMNamespace xsins = factory.createOMNamespace("http://www.w3.org/2001/XMLSchema-instance",
                        "xsi");
                child.declareNamespace(xsins);
                child.addAttribute("nil", "true", xsins);
            } else {
                child.setText(result.toString());
            }

            wrapper.addChild(child);
        } catch (org.jibx.runtime.JiBXException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return envelope;
    }

    public org.apache.axiom.soap.SOAPEnvelope jibxReceiver2(
        org.apache.axiom.om.OMElement element,
        UserServiceSkeletonInterface skel,
        org.apache.axiom.soap.SOAPFactory factory)
        throws org.apache.axis2.AxisFault {
        org.apache.axiom.soap.SOAPEnvelope envelope = null;

        try {
            org.jibx.runtime.impl.UnmarshallingContext uctx = getNewUnmarshalContext(element);
            uctx.next();

            int index;
            java.lang.String args0 = null;

            if (uctx.isAt("http://localhost:8080/ws/vo", "args0")) {
                if (uctx.attributeBoolean(
                            "http://www.w3.org/2001/XMLSchema-instance", "nil",
                            false)) {
                    uctx.skipElement();
                } else {
                    args0 = (java.lang.String) uctx.parseElementText("http://localhost:8080/ws/vo",
                            "args0");
                }
            }

            int args1 = 0;

            if (uctx.isAt("http://localhost:8080/ws/vo", "args1")) {
                args1 = (int) org.jibx.runtime.Utility.parseInt(uctx.parseElementText(
                            "http://localhost:8080/ws/vo", "args1"));
            } else {
                throw new org.apache.axis2.AxisFault(
                    "Missing required element {http://localhost:8080/ws/vo}args1");
            }

            envelope = factory.getDefaultEnvelope();

            org.apache.axiom.om.OMElement wrapper = factory.createOMElement("getUserResponse",
                    "http://localhost:8080/ws/vo", "");

            wrapper.declareDefaultNamespace("http://localhost:8080/ws/vo");

            addMappingNamespaces(factory, wrapper,
                "http://localhost:8080/ws/vo", "");

            envelope.getBody().addChild(wrapper);

            com.xumiao.ws.vo.User result = skel.getUser(args0, args1);

            if (result == null) {
                // just skip optional element
            } else {
                if (bindingFactory == null) {
                    throw new RuntimeException(bindingErrorMessage);
                }

                org.apache.axiom.om.OMDataSource src = new org.apache.axis2.jibx.JiBXDataSource(result,
                        _type_name0, "return", "http://localhost:8080/ws/vo",
                        "", bindingNamespaceIndexes, bindingNamespacePrefixes,
                        bindingFactory);
                org.apache.axiom.om.OMElement child = factory.createOMElement(src);
                wrapper.addChild(child);
            }
        } catch (org.jibx.runtime.JiBXException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
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
