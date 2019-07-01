package edu.jonathan.archunit.panicbutton;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import edu.jonathan.archunit.Application;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.*;

@AnalyzeClasses(packagesOf = Application.class,importOptions = ImportOption.DoNotIncludeTests.class)
public class ArchTestExample04 {

    @ArchTest
    static ArchRule autoWireRule = fields().should().notBeAnnotatedWith(Autowired.class).because("Use Constructor");


    @ArchTest
    static void useInjection(JavaClasses classes){
        methods().should().notBeAnnotatedWith(Autowired.class).because("Use @injection 1").check(classes);
        fields().should().notBeAnnotatedWith(Autowired.class).because("Use @injection 2").check(classes);

    }

}
