/*
 * An XML document type.
 * Localname: getBlankUser
 * Namespace: http://localhost:8080/ws/vo
 * Java type: com.xumiao.ws.vo.GetBlankUserDocument
 *
 * Automatically generated - do not modify.
 */
package com.xumiao.ws.vo;


/**
 * A document containing one getBlankUser(@http://localhost:8080/ws/vo) element.
 *
 * This is a complex type.
 */
public interface GetBlankUserDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetBlankUserDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78EB8FC03F13E89EDFC35C6E5ACE6A8D").resolveHandle("getblankuser2388doctype");
    
    /**
     * Gets the "getBlankUser" element
     */
    com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser getGetBlankUser();
    
    /**
     * Sets the "getBlankUser" element
     */
    void setGetBlankUser(com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser getBlankUser);
    
    /**
     * Appends and returns a new empty "getBlankUser" element
     */
    com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser addNewGetBlankUser();
    
    /**
     * An XML getBlankUser(@http://localhost:8080/ws/vo).
     *
     * This is a complex type.
     */
    public interface GetBlankUser extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetBlankUser.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s78EB8FC03F13E89EDFC35C6E5ACE6A8D").resolveHandle("getblankuserc143elemtype");
        
        /**
         * Gets the "args0" element
         */
        com.xumiao.ws.vo.User getArgs0();
        
        /**
         * Tests for nil "args0" element
         */
        boolean isNilArgs0();
        
        /**
         * True if has "args0" element
         */
        boolean isSetArgs0();
        
        /**
         * Sets the "args0" element
         */
        void setArgs0(com.xumiao.ws.vo.User args0);
        
        /**
         * Appends and returns a new empty "args0" element
         */
        com.xumiao.ws.vo.User addNewArgs0();
        
        /**
         * Nils the "args0" element
         */
        void setNilArgs0();
        
        /**
         * Unsets the "args0" element
         */
        void unsetArgs0();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser newInstance() {
              return (com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.xumiao.ws.vo.GetBlankUserDocument.GetBlankUser) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.xumiao.ws.vo.GetBlankUserDocument newInstance() {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.xumiao.ws.vo.GetBlankUserDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.xumiao.ws.vo.GetBlankUserDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
