package com.example.springjpadatademo.jaxb;

import com.example.springjpadatademo.dao.VinElements;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.logging.Logger;

public class HttpclientImpl {
public static void main(String args[]) {
//    private Logger log = Logger.getLogger(String.valueOf(HttpclientImpl.class));

    File xmlFile = new File(".//Vin.xml");

    JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(VinElements.class);
            Unmarshaller jaxbUnmarshall = jaxbContext.createUnmarshaller();
            VinElements vin = (VinElements) jaxbUnmarshall.unmarshal(xmlFile);
            System.out.println(vin.getValueID() + "" + vin.getVariableId() + " " + vin.getVariable());
        } catch (JAXBException e) {

        }
    }
}

