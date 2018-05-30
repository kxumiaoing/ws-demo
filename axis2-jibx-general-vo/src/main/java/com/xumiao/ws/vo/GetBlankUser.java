
package com.xumiao.ws.vo;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://localhost:8080/ws/vo" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="getBlankUser">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:User" nillable="true" name="args0" minOccurs="0"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetBlankUser
{
    private User args0;

    /** 
     * Get the 'args0' element value.
     * 
     * @return value
     */
    public User getArgs0() {
        return args0;
    }

    /** 
     * Set the 'args0' element value.
     * 
     * @param args0
     */
    public void setArgs0(User args0) {
        this.args0 = args0;
    }
}
