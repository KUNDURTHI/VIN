package com.example.springjpadatademo.dao;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="VinElements")
@XmlAccessorType(XmlAccessType.FIELD)
public class VinElements {
    @XmlElement(name="VariableId")
    private String variableId;
    @XmlElement(name="Variable")
    private String variable;
    @XmlElement(name="ValueId")
    private String valueID;


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
