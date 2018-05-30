
package com.xumiao.ws.vo;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://localhost:8080/ws/vo" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="getUser">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:string" nillable="true" name="args0" minOccurs="0"/>
 *       &lt;xs:element type="xs:int" name="args1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetUser
{
    private String args0;
    private int args1;

    /** 
     * Get the 'args0' element value.
     * 
     * @return value
     */
    public String getArgs0() {
        return args0;
    }

    /** 
     * Set the 'args0' element value.
     * 
     * @param args0
     */
    public void setArgs0(String args0) {
        this.args0 = args0;
    }

    /** 
     * Get the 'args1' element value.
     * 
     * @return value
     */
    public int getArgs1() {
        return args1;
    }

    /** 
     * Set the 'args1' element value.
     * 
     * @param args1
     */
    public void setArgs1(int args1) {
        this.args1 = args1;
    }
}
