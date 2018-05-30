
package com.xumiao.ws.vo;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://localhost:8080/ws/vo" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="getUserResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:User" nillable="true" name="return" minOccurs="0"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetUserResponse
{
    private User _return;

    /** 
     * Get the 'return' element value.
     * 
     * @return value
     */
    public User getReturn() {
        return _return;
    }

    /** 
     * Set the 'return' element value.
     * 
     * @param _return
     */
    public void setReturn(User _return) {
        this._return = _return;
    }
}
