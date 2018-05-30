/*
 * An XML document type.
 * Localname: getUserInfoResponse
 * Namespace: http://localhost:8080/ws/vo
 * Java type: com.xumiao.ws.vo.GetUserInfoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.xumiao.ws.vo.impl;
/**
 * A document containing one getUserInfoResponse(@http://localhost:8080/ws/vo) element.
 *
 * This is a complex type.
 */
public class GetUserInfoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.xumiao.ws.vo.GetUserInfoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetUserInfoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETUSERINFORESPONSE$0 = 
        new javax.xml.namespace.QName("http://localhost:8080/ws/vo", "getUserInfoResponse");
    
    
    /**
     * Gets the "getUserInfoResponse" element
     */
    public com.xumiao.ws.vo.GetUserInfoResponseDocument.GetUserInfoResponse getGetUserInfoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.xumiao.ws.vo.GetUserInfoResponseDocument.GetUserInfoResponse target = null;
            target = (com.xumiao.ws.vo.GetUserInfoResponseDocument.GetUserInfoResponse)get_store().find_element_user(GETUSERINFORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getUserInfoResponse" element
     */
    public void setGetUserInfoResponse(com.xumiao.ws.vo.GetUserInfoResponseDocument.GetUserInfoResponse getUserInfoResponse)
    {
        generatedSetterHelperImpl(getUserInfoResponse, GETUSERINFORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getUserInfoResponse" element
     */
    public com.xumiao.ws.vo.GetUserInfoResponseDocument.GetUserInfoResponse addNewGetUserInfoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.xumiao.ws.vo.GetUserInfoResponseDocument.GetUserInfoResponse target = null;
            target = (com.xumiao.ws.vo.GetUserInfoResponseDocument.GetUserInfoResponse)get_store().add_element_user(GETUSERINFORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getUserInfoResponse(@http://localhost:8080/ws/vo).
     *
     * This is a complex type.
     */
    public static class GetUserInfoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.xumiao.ws.vo.GetUserInfoResponseDocument.GetUserInfoResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetUserInfoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://localhost:8080/ws/vo", "return");
        
        
        /**
         * Gets the "return" element
         */
        public java.lang.String getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlString xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "return" element
         */
        public boolean isSetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0) != 0;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(java.lang.String xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
                }
                target.setStringValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlString xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "return" element
         */
        public void unsetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, 0);
            }
        }
    }
}
