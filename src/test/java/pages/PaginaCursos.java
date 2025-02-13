package pages;

public class PaginaCursos extends BasePage {

    public String introduccionTestingLink = "//a[normalize-space()='Introducción al Testing de Software' and @href]";

    public PaginaCursos() {
        super(driver);
    }

    public void clickIntroduccionTestingLink() {
        clickElement(introduccionTestingLink);
    }


}
