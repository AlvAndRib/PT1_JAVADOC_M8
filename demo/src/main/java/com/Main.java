package com;

import java.util.*;

/**
 * Main class for hotel management.
 */
public class Main {
    public static void main(String[] args) {
        // Create a hotel
        Hotel aiguaclara = new Hotel();
        aiguaclara.name = "Aiguaclara";
        aiguaclara.address = "Carrer Montserrat 34, Begur, Girona";
        aiguaclara.web = "www.aiguaclara.com";
        aiguaclara.category = HotelCategory.FOUR_STARS;

        // Create a manager for the hotel
        Manager claraFarre = new Manager();
        claraFarre.identifier = "12345678A";
        claraFarre.startDate = new Date(); 
        claraFarre.experience = 5;
        aiguaclara.manager = claraFarre;

        // Create a room in the hotel
        Room room110 = new Room();
        room110.number = 110;
        room110.type = RoomType.DOUBLE;

        // Create guests for the room
        Guest sophieDomine = new Guest();
        sophieDomine.name = "Sophie Domine";
        sophieDomine.identifier = "43210987B";
        sophieDomine.nationality = "French";

        Guest loganRousseau = new Guest();
        loganRousseau.name = "Logan Rousseau";
        loganRousseau.identifier = "98237645C";
        loganRousseau.nationality = "French";

        // Assign occupants to the room
        room110.occupants = Arrays.asList(sophieDomine, loganRousseau);

        // Create a stay for the guests
        Stay frenchStay = new Stay();
        frenchStay.startDate = new Date(); 
        frenchStay.endDate = new Date(); 
        frenchStay.room = room110;
        frenchStay.guests = Arrays.asList(sophieDomine, loganRousseau);
    }
}
