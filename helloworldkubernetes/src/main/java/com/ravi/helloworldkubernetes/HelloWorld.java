package com.ravi.helloworldkubernetes;

public class HelloWorld {

    private String name;
    private String company;
    private String text;


    public HelloWorld() {

    }

    public HelloWorld(String name, String company, String text) {
        this.name = name;
        this.company = company;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
