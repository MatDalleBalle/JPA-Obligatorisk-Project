package org.example.obligatoriskjpaopgave.config;

import org.example.obligatoriskjpaopgave.model.Unicode;
import org.example.obligatoriskjpaopgave.repository.UnicodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class InitData {

    @Autowired
    private UnicodeRepo unicodeRepo;

    // Metode til at gemme et sæt af Unicode-tegn i databasen
    public void saveUnicodeCharaters(Set<Character>characters) {
        for (Character c : characters) {
            Unicode unicode = new Unicode();
            unicode.setBogstav(c);
            unicode.setUnicode((int) c);
            unicodeRepo.save(unicode);
        }
    }
}
