package pages;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static constants.ConstantsBooksPage.popUpElement;
import static constants.ConstantsCartPage.*;
import static constants.ConstantsCartPage.cleanCartClick;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void valueAdd() throws InterruptedException {
        clickToWebElement(bookAdd);
        Thread.sleep(2000);
    }

    public void valueSubtract() throws InterruptedException {
        clickToWebElement(bookSubtract);
        Thread.sleep(2000);
    }

    public void addPopUpIsDisplayed(){
        String bookPrice= getTextMethodString(productPrice);
        String bookPriceDetail=getTextMethodString(productPriceDetail);

        double bookPriceDouble=Double.parseDouble(bookPrice.replaceAll("[^0-9.]", ""));
        double bookPriceDetailDouble=Double.parseDouble(bookPriceDetail.replaceAll("[^0-9.]", ""));

        if(bookPriceDouble==bookPriceDetailDouble){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
    }
    public void cleanCart() throws InterruptedException {
        clickToWebElement(cleanCart);
        Thread.sleep(1000);
        clickToWebElement(cleanCartClick);
    }

    public void cartClearIsDisplayed(){
isElementDisplayed(cartCleanCheck);
    }

}
