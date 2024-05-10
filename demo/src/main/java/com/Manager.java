package com;

import java.util.Date;

/**
 * Class representing a manager.
 */
public class Manager {
    
    String identifier; // Identifier of the manager
    Date startDate; // Start date of the manager
    int experience; // Experience of the manager
    
    /**
     * Getter for the identifier attribute.
     * 
     * @return The identifier of the manager.
     */
    public String getIdentifier() {
        return identifier;
    }
    
    /**
     * Setter for the identifier attribute.
     * 
     * @param identifier The identifier to set for the manager.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    /**
     * Getter for the startDate attribute.
     * 
     * @return The start date of the manager.
     */
    public Date getStartDate() {
        return startDate;
    }
    
    /**
     * Setter for the startDate attribute.
     * 
     * @param startDate The start date to set for the manager.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    /**
     * Getter for the experience attribute.
     * 
     * @return The experience of the manager.
     */
    public int getExperience() {
        return experience;
    }
    
    /**
     * Setter for the experience attribute.
     * 
     * @param experience The experience to set for the manager.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }
}
