package tests;

import base.BaseTest;
import org.junit.Test;
import pages.BookDetailPage;
import pages.BookPage;
import pages.CartPage;
import pages.HomePage;

public class CartAdd_006 extends BaseTest {
    HomePage homepage;
    BookPage bookpage;
    BookDetailPage bookdetailpage;
    CartPage cartpage;
    @Test //Sepetten kitap silme
    public void cartAd_006() throws InterruptedException {
        homepage= new HomePage(driver);
        homepage.getDriver("https://www.kitapyurdu.com/");
        homepage.clickCookieButton();
        homepage.setSearch_Input("Sefiller");

        bookpage= new BookPage(driver);
        bookpage.cartAddButton();

        bookdetailpage= new BookDetailPage(driver);
        bookdetailpage.goToCartPlace();
        bookdetailpage.cartClick();

        cartpage= new CartPage(driver);
        cartpage.cleanCart();
        cartpage.cartClearIsDisplayed();


    }
}
