package com.example.springjpadatademo.jaxb;

import com.example.springjpadatademo.dao.VinElements;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class HttpclientImpl {
public static void main(String args[]) {
   /* Logger log = Logger.getLogger(String.valueOf(HttpclientImpl.class));

    File xmlFile = new File("src/main/resources/Vin.xml");

    JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(VinElements.class);
            Unmarshaller jaxbUnmarshall = jaxbContext.createUnmarshaller();
            List<VinElements> vin = (List<VinElements>) jaxbUnmarshall.unmarshal(xmlFile);
            System.out.println(vin.containsAll(vin));
        } catch (Exception e) {
            log.info("Jaxb Exception" + e.getMessage());
        }*/
    }
}

