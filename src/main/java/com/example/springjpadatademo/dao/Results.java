package com.example.springjpadatademo.dao;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name="Results")
@XmlAccessorType(XmlAccessType.FIELD)
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
