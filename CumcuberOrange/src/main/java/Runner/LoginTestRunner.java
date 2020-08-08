package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\G.Hemanth Kumar\\eclipse-workspace\\CumcuberOrange\\src\\main\\java\\Features\\Login.feature",

glue={"StepDefinition"},
 
dryRun=false,

strict=true,

monochrome=true,

format= {"pretty","html:test-output","json:Json_Output/Cucumber.json","junit:Junit_xml/Cucumber.Junit"},


snippets = SnippetType.UNDERSCORE
)

public class LoginTestRunner {

}
