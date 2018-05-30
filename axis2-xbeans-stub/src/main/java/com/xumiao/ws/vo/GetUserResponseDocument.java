/*
 * An XML document type.
 * Localname: getUserResponse
 * Namespace: http://localhost:8080/ws/vo
 * Java type: com.xumiao.ws.vo.GetUserResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.xumiao.ws.vo;


/**
 * A document containing one getUserResponse(@http://localhost:8080/ws/vo) element.
 *
 * This is a complex type.
 */
public interface GetUserResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetUserResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s198701D201C1C1B65A3540EB5582DDB3").resolveHandle("getuserresponsec18fdoctype");
    
    /**
     * Gets the "getUserResponse" element
     */
    com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse getGetUserResponse();
    
    /**
     * Sets the "getUserResponse" element
     */
    void setGetUserResponse(com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse getUserResponse);
    
    /**
     * Appends and returns a new empty "getUserResponse" element
     */
    com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse addNewGetUserResponse();
    
    /**
     * An XML getUserResponse(@http://localhost:8080/ws/vo).
     *
     * This is a complex type.
     */
    public interface GetUserResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetUserResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s198701D201C1C1B65A3540EB5582DDB3").resolveHandle("getuserresponse891delemtype");
        
        /**
         * Gets the "return" element
         */
        com.xumiao.ws.vo.User getReturn();
        
        /**
         * Tests for nil "return" element
         */
        boolean isNilReturn();
        
        /**
         * True if has "return" element
         */
        boolean isSetReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(com.xumiao.ws.vo.User xreturn);
        
        /**
         * Appends and returns a new empty "return" element
         */
        com.xumiao.ws.vo.User addNewReturn();
        
        /**
         * Nils the "return" element
         */
        void setNilReturn();
        
        /**
         * Unsets the "return" element
         */
        void unsetReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse newInstance() {
              return (com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.xumiao.ws.vo.GetUserResponseDocument.GetUserResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.xumiao.ws.vo.GetUserResponseDocument newInstance() {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.xumiao.ws.vo.GetUserResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.xumiao.ws.vo.GetUserResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.xumiao.ws.vo.GetUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
