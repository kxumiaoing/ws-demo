
package com.xumiao.ws.vo;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://localhost:8080/ws/vo" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="User">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:int" name="age" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="name" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class User
{
    private Integer age;
    private String name;

    /** 
     * Get the 'age' element value.
     * 
     * @return value
     */
    public Integer getAge() {
        return age;
    }

    /** 
     * Set the 'age' element value.
     * 
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /** 
     * Get the 'name' element value.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
