package org.example.obligatoriskjpaopgave.repository;

import org.example.obligatoriskjpaopgave.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnicodeRepo extends JpaRepository<Unicode, Integer> {
    // Interface for at håndtere CRUD-operationer på Unicode-entiteter i databasen
}
