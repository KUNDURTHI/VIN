package com.example.springjpadatademo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TEST")
public class Test implements Serializable {

    public Test(){

    }

    public Test(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Id
    @Column(name = "TEST_ID")
    private int id;
    @Column(name = "TEST_NAME")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
