/*
 * An XML document type.
 * Localname: getUser
 * Namespace: http://localhost:8080/ws/vo
 * Java type: com.xumiao.ws.vo.GetUserDocument
 *
 * Automatically generated - do not modify.
 */
package com.xumiao.ws.vo.impl;
/**
 * A document containing one getUser(@http://localhost:8080/ws/vo) element.
 *
 * This is a complex type.
 */
public class GetUserDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.xumiao.ws.vo.GetUserDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetUserDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETUSER$0 = 
        new javax.xml.namespace.QName("http://localhost:8080/ws/vo", "getUser");
    
    
    /**
     * Gets the "getUser" element
     */
    public com.xumiao.ws.vo.GetUserDocument.GetUser getGetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.xumiao.ws.vo.GetUserDocument.GetUser target = null;
            target = (com.xumiao.ws.vo.GetUserDocument.GetUser)get_store().find_element_user(GETUSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getUser" element
     */
    public void setGetUser(com.xumiao.ws.vo.GetUserDocument.GetUser getUser)
    {
        generatedSetterHelperImpl(getUser, GETUSER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getUser" element
     */
    public com.xumiao.ws.vo.GetUserDocument.GetUser addNewGetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.xumiao.ws.vo.GetUserDocument.GetUser target = null;
            target = (com.xumiao.ws.vo.GetUserDocument.GetUser)get_store().add_element_user(GETUSER$0);
            return target;
        }
    }
    /**
     * An XML getUser(@http://localhost:8080/ws/vo).
     *
     * This is a complex type.
     */
    public static class GetUserImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.xumiao.ws.vo.GetUserDocument.GetUser
    {
        private static final long serialVersionUID = 1L;
        
        public GetUserImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARGS0$0 = 
            new javax.xml.namespace.QName("http://localhost:8080/ws/vo", "args0");
        private static final javax.xml.namespace.QName ARGS1$2 = 
            new javax.xml.namespace.QName("http://localhost:8080/ws/vo", "args1");
        
        
        /**
         * Gets the "args0" element
         */
        public java.lang.String getArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "args0" element
         */
        public org.apache.xmlbeans.XmlString xgetArgs0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
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
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
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
        public void setArgs0(java.lang.String args0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARGS0$0);
                }
                target.setStringValue(args0);
            }
        }
        
        /**
         * Sets (as xml) the "args0" element
         */
        public void xsetArgs0(org.apache.xmlbeans.XmlString args0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARGS0$0);
                }
                target.set(args0);
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
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARGS0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARGS0$0);
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
        
        /**
         * Gets the "args1" element
         */
        public int getArgs1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARGS1$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "args1" element
         */
        public org.apache.xmlbeans.XmlInt xgetArgs1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ARGS1$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "args1" element
         */
        public void setArgs1(int args1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARGS1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARGS1$2);
                }
                target.setIntValue(args1);
            }
        }
        
        /**
         * Sets (as xml) the "args1" element
         */
        public void xsetArgs1(org.apache.xmlbeans.XmlInt args1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ARGS1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ARGS1$2);
                }
                target.set(args1);
            }
        }
    }
}
