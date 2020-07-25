package com.aarmas.demo.service;

import com.aarmas.demo.dao.PersonDAO;
import com.aarmas.demo.model.Person;

public class PersonService {

    private final PersonDAO personDao;
    public PersonService(PersonDAO personDao){
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
