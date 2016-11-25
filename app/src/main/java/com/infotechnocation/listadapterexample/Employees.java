package com.infotechnocation.listadapterexample;

/**
 * Created by Prajin Bajracharya on 11/25/2016.
 */

public class Employees {
    private String name;
    private String address;
    private String position;

    public Employees(String name, String address, String position) {
        this.name = name;
        this.address = address;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
