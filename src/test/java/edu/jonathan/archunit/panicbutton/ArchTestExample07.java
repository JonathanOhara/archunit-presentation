package edu.jonathan.archunit.panicbutton;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaMember;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;
import com.tngtech.archunit.library.GeneralCodingRules;
import edu.jonathan.archunit.Application;

import javax.persistence.Entity;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

@AnalyzeClasses(packagesOf = Application.class,importOptions = ImportOption.DoNotIncludeTests.class)
public class ArchTestExample07 {

    ArchCondition<JavaClass> HAVE_TABLE_NAME = new ArchCondition<JavaClass>("should have name set") {
        @Override
        public void check(JavaClass item, ConditionEvents events) {
            Entity entity = item.getAnnotationOfType(Entity.class);

            if(entity.name() == null || entity.name().isEmpty())
                events.add(SimpleConditionEvent.violated(item, "you need to set the name of table in "+item.getFullName()));
        }
    };


    @ArchTest
    ArchRule rule = classes().that().areAnnotatedWith(Entity.class).should(HAVE_TABLE_NAME);

}
