package com.alisson.domain;

public class Client {
    private Integer id;
    private String name;
    private String CPF;

    public Client() {

    }

    public Client(Integer id, String name, String cPF) {
        this.id = id;
        this.name = name;
        CPF = cPF;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }
}
