package tests;

import base.BaseTest;
import org.junit.Test;
import pages.BookPage;
import pages.HomePage;

public class CartAdd_001 extends BaseTest {
    HomePage homepage;
    BookPage bookpage;
    @Test //Geçerli Ürünü Sepete Ekleme
    public void cartAd_001() throws InterruptedException {
        homepage= new HomePage(driver);
        homepage.getDriver("https://www.kitapyurdu.com/");
        homepage.clickCookieButton();
        homepage.setSearch_Input("Sefiller");

        bookpage= new BookPage(driver);
        bookpage.cartAddButton();
        Thread.sleep(2000);
        bookpage.popUpIsDisplayed();







    }
}
