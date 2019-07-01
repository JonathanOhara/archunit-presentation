package edu.jonathan.archunit.panicbutton;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.dependencies.SliceRule;
import com.tngtech.archunit.library.dependencies.SlicesRuleDefinition;
import com.tngtech.archunit.library.plantuml.PlantUmlArchCondition;
import edu.jonathan.archunit.Application;
import edu.jonathan.archunit.ApplicationTests;

import java.net.URL;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packagesOf = Application.class,importOptions = ImportOption.DoNotIncludeTests.class)
public class ArchTestExample07 {

    @ArchTest
    static void module(JavaClasses classes){
        SliceRule sliceRule2 = SlicesRuleDefinition.slices().matching("..archunit.(*)..").should().beFreeOfCycles();

        sliceRule2.check(classes);
    }


}
