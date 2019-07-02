package edu.jonathan.archunit.panicbutton;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import edu.jonathan.archunit.Application;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;


public class ArchTestExample03 {

    private JavaClasses classes = new ClassFileImporter().
            withImportOption(location -> !location.contains("/test/")).
            importPackagesOf(Application.class);

    @Test
    void shouldHaveServiceAnnotationAllServiceClasses(){
        ArchRule myRule = classes()
                .that().resideInAPackage("..service..")
                .should().onlyBeAccessed().byAnyPackage("..controller..", "..service..");

        myRule.check(classes);
    }
}
