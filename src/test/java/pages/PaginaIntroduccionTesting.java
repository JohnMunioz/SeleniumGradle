package pages;

public class PaginaIntroduccionTesting extends BasePage {

    private String introduccionTestingLink = "//*[@id=\"page_section_73411163\"]/div/section/div[3]/div/div[1]/section/div[2]/section/header/a/h3";

   public PaginaIntroduccionTesting() {
       super(driver);
   }

   public void clickIntroduccionTestingLink() {
       clickElement(introduccionTestingLink);
   }   
}

