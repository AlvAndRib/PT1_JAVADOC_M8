package com;

import java.util.Date;

public class Gerent {

    private String nom;
    private String documentIdentitat;
    private java.util.Date dataInici;
    private int anysExperiencia;

    public Gerent(String nom, String documentIdentitat, java.util.Date date) {
        this.nom = nom;
        this.documentIdentitat = documentIdentitat;
        this.dataInici = date;
        this.anysExperiencia = calcularAnysExperiencia(date);
    }

    private int calcularAnysExperiencia(java.util.Date date) {
        return anysExperiencia;
        // Implementació del càlcul
    }

    public String getNom() {
        return nom;
    }

    public String getDocumentIdentitat() {
        return documentIdentitat;
    }

    public java.util.Date getDataInici() {
        return dataInici;
    }

    public int getAnysExperiencia() {
        return anysExperiencia;
    }

}
