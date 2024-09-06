package org.example.obligatoriskjpaopgave.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestControl {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char) i;
        return "unicode: " + i + " char= " + c;
    }
    //      /unicode/{i}: Konverterer en unicode-værdi til et tegn.
    //      http://localhost:8080/unicode/97 -- Vil returnere "unicode: 97 char= a"

    @GetMapping("/char/{c}")
    public String charToUnicode(@PathVariable char c) {
        int unicode = (int) c;
        return "char: " + c + " unicode= " + unicode;
    }
    //      /char/{c}: Konverterer et tegn til en unicode-værdi.
    //      http://localhost:8080/unicode/65 -- Vil returnere "char: A unicode= 65"

    @GetMapping("generateLetters")
    public String generateLetters(@RequestParam char startChar, @RequestParam int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append((char) (startChar + i));
        }
        return result.toString();
    }
    //      /generateLetters: Genererer en streng af tegn, hvor det første tegn er startChar og der er count tegn i alt.
    //      http://localhost:8080/generateLetters?startChar=a&count=10 -- Vil returnere "abcdefghij"
}