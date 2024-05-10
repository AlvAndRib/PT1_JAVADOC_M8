package com;

import java.util.Date;

/*
 * Class representing a manager.
 */

public class Gerent {

    private String nom; // Manager's name
    private String documentIdentitat; // Manager's ID document
    private java.util.Date dataInici; // Start date in the position
    private int anysExperiencia; // Manager's years of experience

    
    public Gerent(String nom, String documentIdentitat, java.util.Date date) { //Constructor of the Manager class. 
        this.nom = nom; // Manager's name.
        this.documentIdentitat = documentIdentitat; //Manager's ID document
        this.dataInici = date; //Start date in the position
        this.anysExperiencia = calcularAnysExperiencia(date); //Years of experience
    }

    private int calcularAnysExperiencia(java.util.Date date) { //Private method to calculate the manager's years of experience.
        return anysExperiencia;
        // Implementation of the calculation    
    }

    
    /**
     * Method to get the manager's name.
     *
     * @return Manager's name.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Method to get the manager's ID document.
     *
     * @return Manager's ID document.
     */
    public String getDocumentIdentitat() {
        return documentIdentitat;
    }

    /**
     * Method to get the start date in the position of the manager.
     *
     * @return Start date in the position of the manager.
     */
    public java.util.Date getDataInici() {
        return dataInici;
    }

    /**
     * Method to get the years of experience of the manager.
     *
     * @return Years of experience of the manager.
     */
    public int getAnysExperiencia() {
        return anysExperiencia;
    }

}
