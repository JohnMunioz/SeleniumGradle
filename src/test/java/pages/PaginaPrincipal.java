package pages;

public class PaginaPrincipal extends BasePage {

    public PaginaPrincipal() {
        super(driver);
    }

    public void navegarAFreeRangetesters() {
        navigateTo("https://www.freerangetesters.com");
    }


    
}
