package edu.jonathan.archunit.panicbutton;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;
import com.tngtech.archunit.library.plantuml.PlantUmlArchCondition;
import edu.jonathan.archunit.Application;
import edu.jonathan.archunit.ApplicationTests;
import javassist.compiler.Javac;
import org.junit.jupiter.api.Test;

import javax.persistence.Entity;

import java.net.URL;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packagesOf = Application.class,importOptions = ImportOption.DoNotIncludeTests.class)
public class ArchTestExample09 {

    static URL diagramURL = ApplicationTests.class.getClassLoader().getResource("test.puml");

    @ArchTest
    ArchRule rule = classes().should(PlantUmlArchCondition.adhereToPlantUmlDiagram(diagramURL, PlantUmlArchCondition.Configurations.consideringOnlyDependenciesInDiagram()));

}
