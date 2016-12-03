
package org.omnirom.omnimost;

import java.util.HashMap;
import java.util.Map;

public class Posts {

    private Property1 property1;
    private Property2 property2;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Posts() {
    }

    /**
     *
     * @param property2
     * @param property1
     */
    public Posts(Property1 property1, Property2 property2) {
        this.property1 = property1;
        this.property2 = property2;
    }

    /**
     *
     * @return
     *     The property1
     */
    public Property1 getProperty1() {
        return property1;
    }

    /**
     *
     * @param property1
     *     The property1
     */
    public void setProperty1(Property1 property1) {
        this.property1 = property1;
    }

    public Posts withProperty1(Property1 property1) {
        this.property1 = property1;
        return this;
    }

    /**
     *
     * @return
     *     The property2
     */
    public Property2 getProperty2() {
        return property2;
    }

    /**
     *
     * @param property2
     *     The property2
     */
    public void setProperty2(Property2 property2) {
        this.property2 = property2;
    }

    public Posts withProperty2(Property2 property2) {
        this.property2 = property2;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Posts withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
