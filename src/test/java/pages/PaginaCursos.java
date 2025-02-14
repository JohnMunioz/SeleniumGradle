package pages;

public class PaginaCursos extends BasePage {

    public String cursosTestingLink = "//a[normalize-space()='Cursos' and @href]";

    public PaginaCursos() {
        super(driver);
    }

    public void clickCursosTestingLink() {
        clickElement(cursosTestingLink);
    }
}
