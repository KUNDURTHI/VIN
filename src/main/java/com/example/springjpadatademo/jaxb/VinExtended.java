package com.example.springjpadatademo.jaxb;

import com.example.springjpadatademo.dao.Response;
import com.example.springjpadatademo.dao.VINExtended;
import com.example.springjpadatademo.dao.VinElements;
import com.example.springjpadatademo.domain.ServiceUtilities;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.logging.Logger;
@Service
@ConfigurationProperties("spring.datasource")
public class VinExtended implements VINExtended {
    private static final Logger log = Logger.getLogger(String.valueOf(ServiceUtilities.class));
    private String url1;

    protected String responsexml;
    protected String jaxbCtxpath;
    protected String serviceNamae;

    public VinExtended() {
    }
    public VinExtended(String url1) {
        this.url1 = url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

    @Override
    public Object getVinResponse() throws Exception {
        List<VinElements> vinElements=null;
        log.info("log" + url1);
        if(StringUtils.isEmpty(url1)){
            throw new Exception("URL is empty");
        }
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);
            Unmarshaller jaxbUnmarsheller = jaxbContext.createUnmarshaller();
            URL baseUrl=new URL(url1);

            URL pathUrl=new URL(baseUrl,"JH4TB2H26CC000000");
            log.info("log" + pathUrl.toString());
            Response response = (Response) jaxbUnmarsheller.unmarshal(pathUrl);
            log.info("Getting JAXB::" + response.getMessage());
        }catch(Exception e){
            e.printStackTrace();
            log.info("Exception Occured while Unmarshelling the file::" + e);
        }
        return vinElements;
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
