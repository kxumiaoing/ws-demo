/*
 * An XML document type.
 * Localname: getBlankUserResponse
 * Namespace: http://localhost:8080/ws/vo
 * Java type: com.xumiao.ws.vo.GetBlankUserResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.xumiao.ws.vo.impl;
/**
 * A document containing one getBlankUserResponse(@http://localhost:8080/ws/vo) element.
 *
 * This is a complex type.
 */
public class GetBlankUserResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.xumiao.ws.vo.GetBlankUserResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetBlankUserResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBLANKUSERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://localhost:8080/ws/vo", "getBlankUserResponse");
    
    
    /**
     * Gets the "getBlankUserResponse" element
     */
    public com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse getGetBlankUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse target = null;
            target = (com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse)get_store().find_element_user(GETBLANKUSERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getBlankUserResponse" element
     */
    public void setGetBlankUserResponse(com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse getBlankUserResponse)
    {
        generatedSetterHelperImpl(getBlankUserResponse, GETBLANKUSERRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getBlankUserResponse" element
     */
    public com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse addNewGetBlankUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse target = null;
            target = (com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse)get_store().add_element_user(GETBLANKUSERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getBlankUserResponse(@http://localhost:8080/ws/vo).
     *
     * This is a complex type.
     */
    public static class GetBlankUserResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetBlankUserResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://localhost:8080/ws/vo", "return");
        
        
        /**
         * Gets the "return" element
         */
        public com.xumiao.ws.vo.User getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.xumiao.ws.vo.User target = null;
                target = (com.xumiao.ws.vo.User)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
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
                com.xumiao.ws.vo.User target = null;
                target = (com.xumiao.ws.vo.User)get_store().find_element_user(RETURN$0, 0);
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
        public void setReturn(com.xumiao.ws.vo.User xreturn)
        {
            generatedSetterHelperImpl(xreturn, RETURN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "return" element
         */
        public com.xumiao.ws.vo.User addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.xumiao.ws.vo.User target = null;
                target = (com.xumiao.ws.vo.User)get_store().add_element_user(RETURN$0);
                return target;
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
                com.xumiao.ws.vo.User target = null;
                target = (com.xumiao.ws.vo.User)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (com.xumiao.ws.vo.User)get_store().add_element_user(RETURN$0);
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
