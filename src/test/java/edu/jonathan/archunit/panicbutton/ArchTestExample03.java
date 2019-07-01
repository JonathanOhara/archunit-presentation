package edu.jonathan.archunit.panicbutton;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import com.tngtech.archunit.lang.syntax.elements.ClassesShouldConjunction;
import edu.jonathan.archunit.Application;
import edu.jonathan.archunit.controller.PersonController;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@AnalyzeClasses(packagesOf = Application.class,importOptions = ImportOption.DoNotIncludeTests.class)
public class ArchTestExample03 {

    @ArchTest
    static ArchRule shouldHaveServiceAnnotationAllServiceClasses = classes().that().
                resideInAnyPackage("..service..").should().beAnnotatedWith(Service.class).
                because("I want that!");

    @ArchTest
    static ArchRule shouldHaveNameEndingWithServiceAllServiceClasses = classes().that().
            resideInAnyPackage("..service..").
                should().haveNameMatching(".*Service");
}
