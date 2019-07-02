package edu.jonathan.archunit.service.legacy;

import edu.jonathan.archunit.controller.PersonController;
import edu.jonathan.archunit.service.AnotherSer;
import org.springframework.stereotype.Component;

@Component
public class AnotherSer2  {

    public void createFork(){
        new AnotherSer().createSpoon();
    }

}
