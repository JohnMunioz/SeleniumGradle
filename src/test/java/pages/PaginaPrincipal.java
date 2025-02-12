package pages;

public class PaginaPrincipal extends BasePage {

    private String searchButton = "//*[@id=\"page_section_48252437\"]/div/section/div[2]";

    public PaginaPrincipal() {
        super(driver);
    }
    //Metodo para navegar a la pagina wed de FreeRangeTesters
    public void navegarAFreeRangetesters() {
        navigateTo("https://www.freerangetesters.com");
        click(searchButton);
    }
}
