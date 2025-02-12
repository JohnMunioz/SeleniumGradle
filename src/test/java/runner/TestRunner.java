package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", //Directorio de los archivos feacture
        glue = "steps", //Paquete donde se encuentran las clases definiendo los steps 
        plugin = {"pretty", "html:target/cucumber-reports"}) //Genera reportes en formato html

public class TestRunner {
    
}
