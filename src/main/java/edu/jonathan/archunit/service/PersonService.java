package edu.jonathan.archunit.service;

import edu.jonathan.archunit.domain.Person;
import edu.jonathan.archunit.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {


    @Autowired
    private PersonRepository personRepository;


    public List<Person> getPersons() {
        return (List<Person>) personRepository.findAll();
    }

    public Person insertPerson(Person newPerson) {
        return personRepository.save(newPerson);
    }
}
