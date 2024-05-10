package com;

/**
 * Class representing a person.
 */
public class Person {
    String name; // Name of the person
    String identifier; // Identifier of the person
    String nationality; // Nationality of the person
    
    // Getters and setters for all attributes
    
    /**
     * Getter for the name attribute.
     * 
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Setter for the name attribute.
     * 
     * @param name The name to set for the person.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Getter for the identifier attribute.
     * 
     * @return The identifier of the person.
     */
    public String getIdentifier() {
        return identifier;
    }
    
    /**
     * Setter for the identifier attribute.
     * 
     * @param identifier The identifier to set for the person.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    /**
     * Getter for the nationality attribute.
     * 
     * @return The nationality of the person.
     */
    public String getNationality() {
        return nationality;
    }
    
    /**
     * Setter for the nationality attribute.
     * 
     * @param nationality The nationality to set for the person.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
