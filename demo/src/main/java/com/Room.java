package com;

import java.util.List;

/**
 * Class representing a room.
 */
public class Room {

    int number; // Room number
    RoomType type; // Type of room
    List<Guest> occupants; // List of occupants
    
    // Getters and setters for all attributes
    
    /**
     * Getter for the number attribute.
     * 
     * @return The number of the room.
     */
    public int getNumber() {
        return number;
    }
    
    /**
     * Setter for the number attribute.
     * 
     * @param number The number to set for the room.
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    /**
     * Getter for the type attribute.
     * 
     * @return The type of the room.
     */
    public RoomType getType() {
        return type;
    }
    
    /**
     * Setter for the type attribute.
     * 
     * @param type The type to set for the room.
     */
    public void setType(RoomType type) {
        this.type = type;
    }
    
    /**
     * Getter for the occupants attribute.
     * 
     * @return The list of occupants in the room.
     */
    public List<Guest> getOccupants() {
        return occupants;
    }
    
    /**
     * Setter for the occupants attribute.
     * 
     * @param occupants The list of occupants to set for the room.
     */
    public void setOccupants(List<Guest> occupants) {
        this.occupants = occupants;
    }
}
