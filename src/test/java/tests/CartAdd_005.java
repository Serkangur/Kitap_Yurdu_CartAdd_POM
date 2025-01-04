package tests;

import base.BaseTest;
import org.junit.Test;
import pages.BookDetailPage;
import pages.BookPage;
import pages.CartPage;
import pages.HomePage;

public class CartAdd_005 extends BaseTest {
    HomePage homepage;
    BookPage bookpage;

    @Test //Sepete Birden Fazla Farklı Ürün Ekleme
    public void cartAd_005() throws InterruptedException {
        homepage= new HomePage(driver);
        homepage.getDriver("https://www.kitapyurdu.com/");
        homepage.clickCookieButton();
        homepage.setSearch_Input("Sefiller");

        bookpage= new BookPage(driver);
        bookpage.cartAddButton();

        homepage.setSearch_Input("1984");
        bookpage.cartAddButton();
        Thread.sleep(1000);
        bookpage.getCartText();



    }
}
