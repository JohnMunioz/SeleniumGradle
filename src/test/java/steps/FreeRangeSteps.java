package steps;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import pages.PaginaCursos;
import pages.PaginaIntroduccionTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;


public class FreeRangeSteps {
    //Se crea un objeto de la clase SoftAssert, se importa la librería org.testng.asserts.SoftAssert 
    //se crea un objeto de la clase SoftAssert.
    SoftAssert soft = new SoftAssert();

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaIntroduccionTesting introduccionPage = new PaginaIntroduccionTesting();
    PaginaRegistro registroPage = new PaginaRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangetesters();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }

    @When("I navigate specifically to Cursos using the navigation bar")
    public void navigationToCursos() {
        cursosPage.clickCursosTestingLink();
    }

    @When("^(?:I|The user|The client) selects? Elegir Plan$")
    public void selectElegirPlan() {
        landingPage.clickOnElegirPlanButton();
    }

    @And("^(?:I|The user|The client) selects? Introducción al Testing$")
    public void iSelectIntroduccionAlTesting() {
    introduccionPage.clickIntroduccionTestingLink();  
    }

    

    @Then("^(?:I|The user|The client) can validate the options in the checkout page$")
    public void validateCheckoutOptions() {
        List<String> lista = registroPage.returnDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 14 productos","Academia: $176 / año • 14 productos", "Free: Gratis • 3 productos");
        Assert.assertEquals(listaEsperada, lista);
        
    }

    public void EjemploAssertions(){
        String palabraEsperada = "Pepe";
        String palabraObtenida = "Papa";

        Integer numero = 1;
        Integer numero2 = 2;

        //Verificar que dos valores son iguales
        Assert.assertEquals(numero, numero2);
        
        //Verificar que dos valores son iguales
        Assert.assertEquals(palabraEsperada, palabraObtenida);

         //Verificar que dos valores no son iguales
        Assert.assertNotEquals(palabraEsperada, palabraObtenida);

        //Verificar que un valor es nulo
        Assert.assertNull(palabraObtenida);

        //Verificar que un valor no es nulo
        Assert.assertNotNull(palabraObtenida);

        //Verificar que un valor es verdadero
        Assert.assertTrue(palabraObtenida.contains(palabraEsperada));

        //Verificar que un valor es falso
        Assert.assertFalse(palabraObtenida.contains(palabraEsperada));

        //Soft Assertions: No se detiene la ejecución del test al fallar, ideal para validar varios elementos pequeños a la vez
        //Se debe importar la librería org.testng.Assert

        soft.assertEquals(numero, numero2);
        soft.assertEquals(palabraEsperada, palabraObtenida);
        soft.assertTrue(palabraObtenida.contains(palabraEsperada));
        
        //Validar todas las aserciones, asi si alguna falla, no se detiene la ejecución y siempre va soft.assertAll() al final.
        soft.assertAll();
    }
}
