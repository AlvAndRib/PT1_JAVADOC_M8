package com;

import java.util.List;

public class Room {

    int number;
    RoomType type;
    List<Guest> occupants;
    
    // Getters y Setters para todos los atributos
    public int getNumber() {
        return number;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public RoomType getType() {
        return type;
    }
    
    public void setType(RoomType type) {
        this.type = type;
    }
    
    public List<Guest> getOccupants() {
        return occupants;
    }
    
    public void setOccupants(List<Guest> occupants) {
        this.occupants = occupants;
    }
}
