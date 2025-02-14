package steps;

import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaIntroduccionTesting;
import pages.PaginaPrincipal;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaIntroduccionTesting introduccionPage = new PaginaIntroduccionTesting();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangetesters();
    }

    @When("I go to Cursos using the navigation bar")
    public void navigatonToCursos() {
        cursosPage.clickCursosTestingLink();
    }

    @And("I select introduccion al testing")
    public void navigateToIntroduccion() {
        introduccionPage.clickIntroduccionTestingLink();  
    }
}
