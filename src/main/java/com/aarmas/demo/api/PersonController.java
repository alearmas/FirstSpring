package com.aarmas.demo.api;

import com.aarmas.demo.model.Person;
import com.aarmas.demo.service.PersonService;

public class PersonController {

    private final PersonService personService;
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    public void addPerson(Person person){
        personService.addPerson(person);
    }
}
