package com.example.personne.service;

import com.example.personne.entity.Person;
import com.example.personne.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
/*
    public List<Person> filterAndSavePersons(List<Person> persons, int subListSize) {
        // Logs de débogage
        System.out.println("Received persons: " + persons);

        // Filtrer la liste des personnes avec Age > 40
        List<Person> filteredPersons = filterPersonsByAge(persons, 40);

        // Trier la liste filtrée
        Collections.sort(filteredPersons, Comparator.comparingInt(Person::getAge).thenComparing(Person::getLastName).thenComparing(Person::getFirstName));

        // Sauvegarder la liste dans la base de données
        savePersonsToDatabase(filteredPersons);

        // Écrire la liste filtrée dans un fichier texte (log dans ce cas)
        System.out.println("Filtered and sorted persons: " + filteredPersons);

        return filteredPersons;
    }
*/
    // ... (les autres méthodes restent inchangées)
    public List<Person> filterAndSavePersons(List<Person> persons, int subListSize) {
        // ...
        System.out.println("Received persons: " + persons);
        // Filtrer la liste des personnes avec Age > 40
        List<Person> filteredPersons = filterPersonsByAge(persons, 40);

        // Vérifier si la liste filtrée est null
        if (filteredPersons != null) {
            // Trier la liste filtrée
            //Collections.sort(filteredPersons, Comparator.comparingInt(Person::getAge).thenComparing(Person::getLastName).thenComparing(Person::getFirstName));
            Collections.sort(filteredPersons, Comparator.comparingInt(Person::getAge).thenComparing(Person::getLastName).thenComparing(Person::getFirstName));

            // ...
        } else {
            // Gérer le cas où la liste filtrée est null
            System.out.println("La liste filtrée est null.");
        }

        // ...
        // Sauvegarder la liste dans la base de données
        savePersonsToDatabase(filteredPersons);

        // Écrire la liste filtrée dans un fichier texte (log dans ce cas)
        System.out.println("Filtered and sorted persons: " + filteredPersons);

        return filteredPersons;
    }



    private List<Person> filterPersonsByAge(List<Person> persons, int ageThreshold) {
        // Implémentez la logique de filtrage par âge ici
        return persons; // Placeholder, à remplacer par la logique réelle
    }

    private void savePersonsToDatabase(List<Person> persons) {
        // Implémentez la logique de sauvegarde en base de données ici
        personRepository.saveAll(persons);
    }

    private void writeFilteredPersonsToFile(List<Person> persons, String filePath) {
        // Implémentez la logique d'écriture dans un fichier texte ici
        // Assurez-vous de trier la liste avant de l'écrire dans le fichier
    }
}



