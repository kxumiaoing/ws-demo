/*
 * An XML document type.
 * Localname: getUserResponse
 * Namespace: http://localhost:8080/ws/vo
 * Java type: com.xumiao.ws.vo.GetUserResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.xumiao.ws.vo.impl;
/**
 * A document containing one getUserResponse(@http://localhost:8080/ws/vo) element.
 *
 * This is a complex type.
 */
public class GetUserResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.xumiao.ws.vo.GetUserResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetUserResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETUSERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://localhost:8080/ws/vo", "getUserResponse");
    
    
    /**
     * Gets the "getUserResponse" element
     */
    public com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse getGetUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse target = null;
            target = (com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse)get_store().find_element_user(GETUSERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getUserResponse" element
     */
    public void setGetUserResponse(com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse getUserResponse)
    {
        generatedSetterHelperImpl(getUserResponse, GETUSERRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getUserResponse" element
     */
    public com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse addNewGetUserResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse target = null;
            target = (com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse)get_store().add_element_user(GETUSERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getUserResponse(@http://localhost:8080/ws/vo).
     *
     * This is a complex type.
     */
    public static class GetUserResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetUserResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
