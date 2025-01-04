package tests;

import base.BaseTest;
import org.junit.Test;
import pages.BookDetailPage;
import pages.BookPage;
import pages.CartPage;
import pages.HomePage;

public class CartAdd_007 extends BaseTest {
    HomePage homepage;
    BookDetailPage bookdetailpage;
    @Test //Boş sepetle siparişi tamamlama
    public void cartAd_007() throws InterruptedException {
        homepage= new HomePage(driver);
        homepage.getDriver("https://www.kitapyurdu.com/");
        homepage.clickCookieButton();

        bookdetailpage= new BookDetailPage(driver);
        bookdetailpage.goToCartPlace();
        Thread.sleep(1000);
        bookdetailpage.cartEmptyIsDisplayed();





    }
}
