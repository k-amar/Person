package com.example.personne.repository;

import com.example.personne.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}

