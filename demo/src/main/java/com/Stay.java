package com;

import java.util.Date;
import java.util.List;

/**
 * Class representing a stay at a hotel.
 */
public class Stay {
    Date startDate; // Start date of the stay
    Date endDate; // End date of the stay
    Room room; // Room assigned for the stay
    List<Guest> guests; // List of guests staying
    
    // Getters and setters for all attributes
    
    /**
     * Getter for the startDate attribute.
     * 
     * @return The start date of the stay.
     */
    public Date getStartDate() {
        return startDate;
    }
    
    /**
     * Setter for the startDate attribute.
     * 
     * @param startDate The start date to set for the stay.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    /**
     * Getter for the endDate attribute.
     * 
     * @return The end date of the stay.
     */
    public Date getEndDate() {
        return endDate;
    }
    
    /**
     * Setter for the endDate attribute.
     * 
     * @param endDate The end date to set for the stay.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    /**
     * Getter for the room attribute.
     * 
     * @return The room assigned for the stay.
     */
    public Room getRoom() {
        return room;
    }
    
    /**
     * Setter for the room attribute.
     * 
     * @param room The room to set for the stay.
     */
    public void setRoom(Room room) {
        this.room = room;
    }
    
    /**
     * Getter for the guests attribute.
     * 
     * @return The list of guests staying.
     */
    public List<Guest> getGuests() {
        return guests;
    }
    
    /**
     * Setter for the guests attribute.
     * 
     * @param guests The list of guests to set for the stay.
     */
    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
}
