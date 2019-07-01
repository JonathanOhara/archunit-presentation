package edu.jonathan.archunit.service;

import edu.jonathan.archunit.controller.PersonController;
import edu.jonathan.archunit.service.legacy.AnotherSer2;
import org.springframework.stereotype.Component;

@Component
public class AnotherSer {

    public void throwGenericException() throws Exception {
        new PersonController();
        throw new Exception();
    }

    public void call(){
        new AnotherSer2().call();
    }

}
