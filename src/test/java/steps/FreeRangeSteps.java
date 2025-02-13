package steps;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;
import pages.PaginaCursos;

public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangetesters();
    }

    @When("I go to {word} using the navigation bar")
    public void navigatonBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section); 
    }

    @And("select Introducción al testing")
    public void navigateToIntro() {
        cursosPage.clickIntroduccionTestingLink();
    }
}
