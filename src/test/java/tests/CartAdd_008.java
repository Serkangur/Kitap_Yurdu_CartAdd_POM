package tests;

import base.BaseTest;
import org.junit.Test;
import pages.BookDetailPage;
import pages.BookPage;
import pages.CartPage;
import pages.HomePage;

public class CartAdd_008 extends BaseTest {
    HomePage homepage;
    BookPage bookpage;
    BookDetailPage bookdetailpage;
    CartPage cartpage;
    @Test //Sepette kitap miktarını azaltma
    public void cartAd_008() throws InterruptedException {
        homepage= new HomePage(driver);
        homepage.getDriver("https://www.kitapyurdu.com/");
        homepage.clickCookieButton();
        homepage.setSearch_Input("Sefiller");

        bookpage= new BookPage(driver);
        bookpage.bookClick();

        bookdetailpage= new BookDetailPage(driver);
        bookdetailpage.addCart(2);
        bookdetailpage.goToCartPlace();
        bookdetailpage.cartClick();

        cartpage= new CartPage(driver);
        cartpage.valueSubtract();
        cartpage.addPopUpIsDisplayed();



    }
}
