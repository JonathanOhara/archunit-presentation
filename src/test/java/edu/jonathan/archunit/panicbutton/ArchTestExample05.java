package edu.jonathan.archunit.panicbutton;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.GeneralCodingRules;
import edu.jonathan.archunit.Application;
import org.springframework.beans.factory.annotation.Autowired;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.*;

@AnalyzeClasses(packagesOf = Application.class,importOptions = ImportOption.DoNotIncludeTests.class)
public class ArchTestExample05 {

    @ArchTest
    static ArchRule test = noClasses().should(GeneralCodingRules.THROW_GENERIC_EXCEPTIONS);


}
