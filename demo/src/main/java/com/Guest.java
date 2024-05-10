package com;

public class Guest {
    String name;
    String identifier;
    String nationality;
        
    /**
     * Getter for the name attribute.
     * 
     * @return The name of the guest.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Setter for the name attribute.
     * 
     * @param name The name to set for the guest.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Getter for the identifier attribute.
     * 
     * @return The identifier of the guest.
     */
    public String getIdentifier() {
        return identifier;
    }
    
    /**
     * Setter for the identifier attribute.
     * 
     * @param identifier The identifier to set for the guest.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    /**
     * Getter for the nationality attribute.
     * 
     * @return The nationality of the guest.
     */
    public String getNationality() {
        return nationality;
    }
    
    /**
     * Setter for the nationality attribute.
     * 
     * @param nationality The nationality to set for the guest.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
