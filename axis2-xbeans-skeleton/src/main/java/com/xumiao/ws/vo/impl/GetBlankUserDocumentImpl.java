/*
 * An XML document type.
 * Localname: getBlankUser
 * Namespace: http://localhost:8080/ws/vo
 * Java type: com.xumiao.ws.vo.GetBlankUserDocument
 *
 * Automatically generated - do not modify.
 */
package com.xumiao.ws.vo.impl;
/**
 * A document containing one getBlankUser(@http://localhost:8080/ws/vo) element.
 *
 * This is a complex type.
 */
public class GetBlankUserDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.xumiao.ws.vo.GetBlankUserDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetBlankUserDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETBLANKUSER$0 = 
        new javax.xml.namespace.QName("http://localhost:8080/ws/vo", "getBlankUser");
    
    
    /**
     * Gets the "getBlankUser" element
     */
    public com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser getGetBlankUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser target = null;
            target = (com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser)get_store().find_element_user(GETBLANKUSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getBlankUser" element
     */
    public void setGetBlankUser(com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser getBlankUser)
    {
        generatedSetterHelperImpl(getBlankUser, GETBLANKUSER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getBlankUser" element
     */
    public com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser addNewGetBlankUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser target = null;
            target = (com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser)get_store().add_element_user(GETBLANKUSER$0);
            return target;
        }
    }
    /**
     * An XML getBlankUser(@http://localhost:8080/ws/vo).
     *
     * This is a complex type.
     */
    public static class GetBlankUserImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser
    {
        private static final long serialVersionUID = 1L;
        
        public GetBlankUserImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARGS0$0 = 
            new javax.xml.namespace.QName("http://localhost:8080/ws/vo", "args0");
        
        
        /**
         * Gets the "args0" element
         */
        public com.xumiao.ws.vo.User getArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.xumiao.ws.vo.User target = null;
                target = (com.xumiao.ws.vo.User)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "args0" element
         */
        public boolean isNilArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.xumiao.ws.vo.User target = null;
                target = (com.xumiao.ws.vo.User)get_store().find_element_user(ARGS0$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "args0" element
         */
        public boolean isSetArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ARGS0$0) != 0;
            }
        }
        
        /**
         * Sets the "args0" element
         */
        public void setArgs0(com.xumiao.ws.vo.User args0)
        {
            generatedSetterHelperImpl(args0, ARGS0$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "args0" element
         */
        public com.xumiao.ws.vo.User addNewArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.xumiao.ws.vo.User target = null;
                target = (com.xumiao.ws.vo.User)get_store().add_element_user(ARGS0$0);
                return target;
            }
        }
        
        /**
         * Nils the "args0" element
         */
        public void setNilArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.xumiao.ws.vo.User target = null;
                target = (com.xumiao.ws.vo.User)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (com.xumiao.ws.vo.User)get_store().add_element_user(ARGS0$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "args0" element
         */
        public void unsetArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ARGS0$0, 0);
            }
        }
    }
}
