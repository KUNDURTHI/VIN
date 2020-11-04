package com.example.springjpadatademo.jaxb;

import com.example.springjpadatademo.domain.ServiceUtilities;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringWriter;
import java.util.logging.Logger;
@Service
@ConfigurationProperties(prefix = "sprin.datasource.url1")
@Configuration("url")
public class VinExtended {
    private static final Logger log = Logger.getLogger(String.valueOf(ServiceUtilities.class));
protected String responsexml;
protected int timeout;
protected String jaxbCtxpath;
protected String serviceNamae;

    public String getJaxbCtxpath() {
        return jaxbCtxpath;
    }
    public void setJaxbCtxpath(String jaxbCtxpath) {
        this.jaxbCtxpath = jaxbCtxpath;
    }

    public Object getXmlResponse(Object request) throws Exception {
if (request == null){
 throw new Exception("XML request can not subjected to empty");
}
String url = getJaxbCtxpath();
Object response = null;

String requestXML = null;
StringWriter sw = new StringWriter();
    try{
        JAXBContext jaxbContext = ServiceUtilities.getJAXBContext(url);
        Unmarshaller jaxbUnmarsheller = jaxbContext.createUnmarshaller();
        log.info("Getting JAXB::" + jaxbCtxpath);
    }catch(Exception e){
        e.printStackTrace();
        log.info("Exception Occured while Unmarshelling the file::" + e);
    }
    return request;
}

public String getVinResponse(Object request){
    String response = null;
    try {
        response = new ObjectMapper().writeValueAsString(request);
    } catch (JsonProcessingException e) {
        e.printStackTrace();
    }
    return response;
}
}
