package com.inel.demo.domain;


/**
 *
 */
//fix error adding default constructor
public class Teacher {
    private long id;
    private String name;

    public Teacher(){

    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Teacher(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
