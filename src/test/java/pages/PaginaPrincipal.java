package pages;


public class PaginaPrincipal extends BasePage {

    public String sectionLink = "//a[normalize-space()='%s' and @href]";

    public PaginaPrincipal() {
        super(driver);
    }
    //Metodo para navegar a la pagina wed de FreeRangeTesters
    public void navigateToFreeRangetesters() {
        navigateTo("https://www.freerangetesters.com");
    }

    public void clickOnSectionNavigationBar(String section) {
        //Reemplazar el marcador de posecion en sectionLink con el valor de la variable section
        String xpahtSection = String.format(sectionLink, section);
        clickElement(xpahtSection);
    }
}
