package runner;

import base.ProjSpecifications;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue={"pages","runner"},monochrome=true,publish=true)
public class RunnerClass extends ProjSpecifications{

}
