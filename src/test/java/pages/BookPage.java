package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import static constants.ConstantsBooksPage.*;
import static constants.ConstantsCartPage.cartAmount;

public class BookPage extends BasePage {
    public BookPage(WebDriver driver) {
        super(driver);
    }
    public void bookClick(){
        clickToWebElement(secilen_kitap);
    }
    public void cartAddButton(){
        clickToWebElement(cartAddButton);
    }
    public void popUpIsDisplayed(){
        isElementDisplayed(popUpElement);
    }
    public void getCartText(){
       String totalBookAmount= getTextMethodString(cartAmount);
        System.out.println(totalBookAmount);
    }
}
