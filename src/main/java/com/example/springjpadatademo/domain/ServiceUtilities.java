package com.example.springjpadatademo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ServiceUtilities {
    private String url;
  /*  private static final Logger log = Logger.getLogger(String.valueOf(ServiceUtilities.class));
    private  static Map<String, JAXBContext> jaxbContextMap;

    public static JAXBContext getJAXBContext(String jaxbContextPath) throws JAXBException{
        if(jaxbContextMap == null){

            jaxbContextMap = new HashMap<String, JAXBContext>();
        }
       if(jaxbContextMap.containsKey(jaxbContextPath)){
           return jaxbContextMap.get(jaxbContextPath);
       }else{
           JAXBContext jaxbContext = JAXBContext.newInstance(jaxbContextPath);
           jaxbContextMap.put(jaxbContextPath, jaxbContext);
           return jaxbContext;
       }
    }*/
}
