package edu.jonathan.archunit.service;

import edu.jonathan.archunit.controller.PersonController;
import edu.jonathan.archunit.service.legacy.AnotherSer2;
import edu.jonathan.archunit.util.SomeUtil;
import org.springframework.stereotype.Component;

@Component
public class AnotherSer {

    public void createNecklace() throws Exception {
        new PersonController();
        SomeUtil.makeJewelFromNiobium(1000);
        throw new Exception();
    }

    public void createSpoon(){
        new AnotherSer2().createFork();
    }

}
