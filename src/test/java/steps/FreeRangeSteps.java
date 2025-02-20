package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaCursos;
import pages.PaginaIntroduccionTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;


public class FreeRangeSteps {

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaIntroduccionTesting introduccionPage = new PaginaIntroduccionTesting();
    PaginaRegistro registroPage = new PaginaRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangetesters();
    }

    @When("I go to Cursos using the navigation bar")
    public void navigatonToCursos() {
        cursosPage.clickCursosTestingLink();
    }

    @When("I select Elegir Plan")
    public void selectElegirPlan() {
        landingPage.clickOnElegirPlanButton();
    }

    @And("I select introduccion al testing")
    public void navigateToIntroduccion() {
        introduccionPage.clickIntroduccionTestingLink();  
    }

    @Then("I can validate the options in the checkout page")
    public void validateCheckoutOptions() {
        List<String> lista = registroPage.returnDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 13 productos","Academia: $176 / año • 13 productos", "Free: Gratis • 3 productos");
        Assert.assertEquals(listaEsperada, lista);
        
    }
}
