package com.example.personne.controller;

import com.example.personne.entity.Person;
import com.example.personne.entity.RequestPayload;
import com.example.personne.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/filter-and-save")
    public List<Person> filterAndSavePersons(@RequestBody RequestPayload requestPayload) {
        // Logs de débogage
        System.out.println("Received request payload: " + requestPayload);

        int subListSize = requestPayload.getSubListSize();
        List<Person> persons = requestPayload.getPersons();

        // Appeler votre service avec les données de la requête
        List<Person> result = personService.filterAndSavePersons(persons, subListSize);

        // Logs de débogage
        System.out.println("Result after filtering and saving: " + result);

        return result;
    }
}
