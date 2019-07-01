package edu.jonathan.archunit.panicbutton;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import edu.jonathan.archunit.Application;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;


public class ArchTestExample02 {

    private JavaClasses classes = new ClassFileImporter().
            withImportOption(location -> !location.contains("/test/")).
            importPackagesOf(Application.class);

    @Test
    void shouldHaveServiceAnnotationAllServiceClasses(){
        ArchRule rule = classes().that().
                resideInAnyPackage("..service..").should().beAnnotatedWith(Service.class).
                because("I want that!");

        rule.check(classes);
    }

    @Test
    void shouldHaveNameEndingWithServiceAllServiceClasses(){

        ArchRule rule = classes().that().resideInAnyPackage("..service..").
                should().haveNameMatching(".*Service");

        rule.check(classes);


    }
}
