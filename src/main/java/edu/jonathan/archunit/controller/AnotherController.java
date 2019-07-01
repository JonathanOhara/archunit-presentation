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
public class AnotherController {


    @Autowired
    private PersonService personService;


    @GetMapping
    public List<Person> getPersons(){
        return new PersonController().getPersons();
    }


}
