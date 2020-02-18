package com.example.springjpadatademo.dao;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Results")
public class VinElements {
    private String variableId;
    private String variable;
    private String valueID;

    @XmlElement(name="VariableId")
    public String getVariableId() {
        return variableId;
    }
    public void setVariableId(String variableId) {
        this.variableId = variableId;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getValueID() {
        return valueID;
    }

    public void setValueID(String valueID) {
        this.valueID = valueID;
    }
}
