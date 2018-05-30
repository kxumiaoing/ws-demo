/*
 * An XML document type.
 * Localname: getBlankUserResponse
 * Namespace: http://localhost:8080/ws/vo
 * Java type: com.xumiao.ws.vo.GetBlankUserResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.xumiao.ws.vo;


/**
 * A document containing one getBlankUserResponse(@http://localhost:8080/ws/vo) element.
 *
 * This is a complex type.
 */
public interface GetBlankUserResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetBlankUserResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s198701D201C1C1B65A3540EB5582DDB3").resolveHandle("getblankuserresponse8e69doctype");
    
    /**
     * Gets the "getBlankUserResponse" element
     */
    com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse getGetBlankUserResponse();
    
    /**
     * Sets the "getBlankUserResponse" element
     */
    void setGetBlankUserResponse(com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse getBlankUserResponse);
    
    /**
     * Appends and returns a new empty "getBlankUserResponse" element
     */
    com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse addNewGetBlankUserResponse();
    
    /**
     * An XML getBlankUserResponse(@http://localhost:8080/ws/vo).
     *
     * This is a complex type.
     */
    public interface GetBlankUserResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetBlankUserResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s198701D201C1C1B65A3540EB5582DDB3").resolveHandle("getblankuserresponse9823elemtype");
        
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
            public static com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse newInstance() {
              return (com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.xumiao.ws.vo.GetBlankUserResponseDocument.GetBlankUserResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument newInstance() {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.xumiao.ws.vo.GetBlankUserResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.xumiao.ws.vo.GetBlankUserResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
