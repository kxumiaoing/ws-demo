/*
 * An XML document type.
 * Localname: getUserInfo
 * Namespace: http://localhost:8080/ws/vo
 * Java type: com.xumiao.ws.vo.GetUserInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.xumiao.ws.vo.impl;
/**
 * A document containing one getUserInfo(@http://localhost:8080/ws/vo) element.
 *
 * This is a complex type.
 */
public class GetUserInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.xumiao.ws.vo.GetUserInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetUserInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETUSERINFO$0 = 
        new javax.xml.namespace.QName("http://localhost:8080/ws/vo", "getUserInfo");
    
    
    /**
     * Gets the "getUserInfo" element
     */
    public com.xumiao.ws.vo.GetUserInfoDocument.GetUserInfo getGetUserInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.xumiao.ws.vo.GetUserInfoDocument.GetUserInfo target = null;
            target = (com.xumiao.ws.vo.GetUserInfoDocument.GetUserInfo)get_store().find_element_user(GETUSERINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getUserInfo" element
     */
    public void setGetUserInfo(com.xumiao.ws.vo.GetUserInfoDocument.GetUserInfo getUserInfo)
    {
        generatedSetterHelperImpl(getUserInfo, GETUSERINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getUserInfo" element
     */
    public com.xumiao.ws.vo.GetUserInfoDocument.GetUserInfo addNewGetUserInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.xumiao.ws.vo.GetUserInfoDocument.GetUserInfo target = null;
            target = (com.xumiao.ws.vo.GetUserInfoDocument.GetUserInfo)get_store().add_element_user(GETUSERINFO$0);
            return target;
        }
    }
    /**
     * An XML getUserInfo(@http://localhost:8080/ws/vo).
     *
     * This is a complex type.
     */
    public static class GetUserInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.xumiao.ws.vo.GetUserInfoDocument.GetUserInfo
    {
        private static final long serialVersionUID = 1L;
        
        public GetUserInfoImpl(org.apache.xmlbeans.SchemaType sType)
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
