package com.example.springjpadatademo.dao;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Results {
    @XmlElement(name="DecodedVariable")
    private List<VinElements> decodedVariable;

    public List<VinElements> getDecodedVariable() {
        return decodedVariable;
    }

    public void setDecodedVariable(List<VinElements> decodedVariable) {
        this.decodedVariable = decodedVariable;
    }
}
