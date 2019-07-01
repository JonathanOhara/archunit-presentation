package edu.jonathan.archunit.controller;

import edu.jonathan.archunit.domain.Person;
import edu.jonathan.archunit.service.PersonService;
import edu.jonathan.archunit.util.SomeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {


    @Autowired
    private PersonService personService;


    @GetMapping
    public List<Person> getPersons(){
        return personService.getPersons();
    }


    @PostMapping
    public Person insertPerson(@RequestBody Person person){
        Calendar calenderInstance = Calendar.getInstance();
        person.setMinutesPlusSeconds(SomeUtil.sum(calenderInstance.get(Calendar.MINUTE), calenderInstance.get(Calendar.SECOND)));
        return personService.insertPerson(person);
    }

}
