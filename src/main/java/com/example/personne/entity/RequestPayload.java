package com.example.personne.entity;

import java.util.List;

public class RequestPayload {
    private List<Person> Persons;
    private int SubListSize;

    // Ajout d'un constructeur par défaut pour la désérialisation JSON
    public RequestPayload() {
    }

    // Ajout de getters et setters

    public List<Person> getPersons() {
        return Persons;
    }

    public void setPersons(List<Person> persons) {
        Persons = persons;
    }

    public int getSubListSize() {
        return SubListSize;
    }

    public void setSubListSize(int subListSize) {
        SubListSize = subListSize;
    }
}
