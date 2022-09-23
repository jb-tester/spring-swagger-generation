package com.mytests.spring.springSwaggerGeneration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * *
 * <p>Created by irina on 9/23/2022.</p>
 * <p>Project: spring-swagger-generation</p>
 * *
 * expected schema:
 * MyJacksonPOJO:
 *       type: object
 *       properties:
 *         prop2:
 *           type: string
 *         p1:
 *           type: string
 *         p4:
 *           type: string
 *         p3:
 *           type: string
 */
//@JsonIgnoreProperties({ "prop5" })
@JsonIgnoreProperties("prop5")
public class MyJacksonPOJO {
    String prop1;
    String prop2;
    String prop3;
    @JsonProperty("p4")
    String prop4;
    String prop5;
    @JsonIgnore
    String prop6;
    String prop7;

   // standard getter/setter names, but the alternative property name is specified via annotation
   // expected result in json: p1
    @JsonProperty("p1")
    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    @JsonProperty("p1")
    public String getProp1() {
        return prop1;
    }

    // standard getter/setter names, no annotations
    // expected result in json: prop2
    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public String getProp2() {
        return prop2;
    }

    // not standard getter/setter names, the property name is specified via annotation
    // expected result in json: p3
    @JsonProperty("p3")
    public void setProperty3(String prop3) {
        this.prop3 = prop3;
    }

    @JsonProperty("p3")
    public String getProperty3() {
        return prop3;
    }

    // standard getter-setter names; the annotation with alternative name is provided for the field itself
    // expected result in json: p4
    public void setProp4(String prop4) {
        this.prop4 = prop4;
    }

    public String getProp4() {
        return prop4;
    }

    // ignored via class-level @JsonIgnoreProperties annotation
    // expected result in json: no property
    public String getProp5() {
        return prop5;
    }

    public void setProp5(String prop5) {
        this.prop5 = prop5;
    }

    // ignored via field annotation
    // expected result in json: no property
    public String getProp6() {
        return prop6;
    }

    public void setProp6(String prop6) {
        this.prop6 = prop6;
    }

    // ignored via accessor methods annotations
    // expected result in json: no property
    @JsonIgnore
    public String getProp7() {
        return prop7;
    }
    @JsonIgnore
    public void setProp7(String prop7) {
        this.prop7 = prop7;
    }
}
