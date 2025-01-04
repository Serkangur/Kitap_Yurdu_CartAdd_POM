package pages;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.ConstantsBookDetailPage.*;
import static constants.ConstantsBookDetailPage.cartClick;
import static constants.ConstantsBooksPage.popUpElement;


public class BookDetailPage extends BasePage {
    public BookDetailPage(WebDriver driver) {
        super(driver);

    }
    public void stockTextIsDisplayed() {
        isElementDisplayed(stockText);
    }
    public void addCart(int times) {
        for (int i = 0; i < times; i++) {
            clickToWebElement(sepeteEkle);
        }
    }

    public void popUpCheck(){
        popUpCheck("2",popUpElement);

    }

    public void goToCartPlace(){
        clickToWebElement(cartPlace);
    }
    public void cartClick(){
        clickToWebElement(cartClick);
    }
    public void cartEmptyIsDisplayed(){
        isElementDisplayed(cartEmpty);
    }
}
