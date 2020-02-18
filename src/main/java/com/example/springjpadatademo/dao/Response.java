package com.example.springjpadatademo.dao;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="Response")
@XmlAccessorType(XmlAccessType.FIELD)
public class Response {
    private String response;
    @XmlElement(name="Count")
    private String count;

    @XmlElement(name="Message")
    private String message;

    @XmlElement(name="SearchCriteria")
    private String searchCriteria;

    @XmlElement(name="Results")
    private Results results;

    public Response(){

    }
    public Response(String response, String response1) {
        this.response = response1;

    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public Results getResults() {
        return results;
    }

    public void setResults(Results results) {
        this.results = results;
    }
}
