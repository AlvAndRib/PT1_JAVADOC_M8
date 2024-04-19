package com;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear hotel
        Hotel aiguaclara = new Hotel();
        aiguaclara.name = "Aiguaclara";
        aiguaclara.address = "Carrer Montserrat 34, Begur, Girona";
        aiguaclara.web = "www.aiguaclara.com";
        aiguaclara.category = HotelCategory.FOUR_STARS;

        Manager claraFarre = new Manager();
        claraFarre.identifier = "12345678A";
        claraFarre.startDate = new Date(); 
        claraFarre.experience = 5;
        aiguaclara.manager = claraFarre;

        Room room110 = new Room();
        room110.number = 110;
        room110.type = RoomType.DOUBLE;

        Guest sophieDomine = new Guest();
        sophieDomine.name = "Sophie Domine";
        sophieDomine.identifier = "43210987B";
        sophieDomine.nationality = "French";

        Guest loganRousseau = new Guest();
        loganRousseau.name = "Logan Rousseau";
        loganRousseau.identifier = "98237645C";
        loganRousseau.nationality = "French";

        room110.occupants = Arrays.asList(sophieDomine, loganRousseau);

        Stay frenchStay = new Stay();
        frenchStay.startDate = new Date(); 
        frenchStay.endDate = new Date(); 
        frenchStay.room = room110;
        frenchStay.guests = Arrays.asList(sophieDomine, loganRousseau);
    }
}



