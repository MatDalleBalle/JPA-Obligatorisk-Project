package org.example.obligatoriskjpaopgave.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Unicode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int unicode; // Unik værdi for Unicode-tegnet
    private char bogstav; // Tegnet repræsenteret af denne Unicode-værdi
    private String description; // Beskrivelse af tegnet
    private String name; // Navn på tegnet

    // Getters and setters
    public int getUnicode() {
        return unicode;
    }
    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }
    public char getBogstav() {
        return bogstav;
    }
    public void setBogstav(char bogstav) {
        this.bogstav = bogstav;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
