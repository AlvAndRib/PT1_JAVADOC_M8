package com;

public class Hotel {
    String name; // Name of the hotel
    String address; // Address of the hotel
    String web; // Website of the hotel
    HotelCategory category; // Category of the hotel
    Manager manager; // Manager of the hotel
    
    /**
     * Getter for the name attribute.
     * 
     * @return The name of the hotel.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Setter for the name attribute.
     * 
     * @param name The name to set for the hotel.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Getter for the address attribute.
     * 
     * @return The address of the hotel.
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * Setter for the address attribute.
     * 
     * @param address The address to set for the hotel.
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Getter for the web attribute.
     * 
     * @return The website of the hotel.
     */
    public String getWeb() {
        return web;
    }
    
    /**
     * Setter for the web attribute.
     * 
     * @param web The website to set for the hotel.
     */
    public void setWeb(String web) {
        this.web = web;
    }
    
    /**
     * Getter for the category attribute.
     * 
     * @return The category of the hotel.
     */
    public HotelCategory getCategory() {
        return category;
    }
    
    /**
     * Setter for the category attribute.
     * 
     * @param category The category to set for the hotel.
     */
    public void setCategory(HotelCategory category) {
        this.category = category;
    }
    
    /**
     * Getter for the manager attribute.
     * 
     * @return The manager of the hotel.
     */
    public Manager getManager() {
        return manager;
    }
    
    /**
     * Setter for the manager attribute.
     * 
     * @param manager The manager to set for the hotel.
     */
    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
