package com;

import java.util.Date;
import java.util.List;

public class Stay {
    Date startDate;
    Date endDate;
    Room room;
    List<Guest> guests;
    
    public Date getStartDate() {
        return startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public Date getEndDate() {
        return endDate;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    public Room getRoom() {
        return room;
    }
    
    public void setRoom(Room room) {
        this.room = room;
    }
    
    public List<Guest> getGuests() {
        return guests;
    }
    
    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }
}