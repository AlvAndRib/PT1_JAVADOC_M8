package com;

public class Hotel {
    String name;
    String address;
    String web;
    HotelCategory category;
    Manager manager;
    
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
    
    public String getWeb() {
        return web;
    }
    
    public void setWeb(String web) {
        this.web = web;
    }
    
    public HotelCategory getCategory() {
        return category;
    }
    
    public void setCategory(HotelCategory category) {
        this.category = category;
    }
    
    public Manager getManager() {
        return manager;
    }
    
    public void setManager(Manager manager) {
        this.manager = manager;
    }
}