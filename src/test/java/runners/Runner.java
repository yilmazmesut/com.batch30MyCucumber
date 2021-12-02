package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)        // JUnit'i runner'i Cucumber ile calistirmasi icin kullaniyoruz
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@rapor1",

        dryRun = false      // dryRun=true dedigimizde testi calistirmadan bize eksik adimi verir
                            // dryRun=false yaparsak testi calistirir, eksik bir adimla karsilasirsa
                            // test failed olur ve bize eksik adimi raporlar
)

public class Runner {

}
