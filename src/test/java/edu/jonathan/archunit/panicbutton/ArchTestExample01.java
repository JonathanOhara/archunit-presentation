package edu.jonathan.archunit.panicbutton;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import edu.jonathan.archunit.Application;
import edu.jonathan.archunit.controller.PersonController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArchTestExample01 {

    @Test
    void firstDemo(){

        JavaClasses mainPackage = new ClassFileImporter().importPackagesOf(Application.class);

        JavaClass personController = mainPackage.get(PersonController.class);

        System.out.println(personController.getMethodCallsFromSelf().size());

        assertTrue(personController.getMethodCallsFromSelf().size() > 0);
    }
}
