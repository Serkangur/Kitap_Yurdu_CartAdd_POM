package tests;

import base.BaseTest;
import org.junit.Test;
import pages.BookDetailPage;
import pages.BookPage;
import pages.CartPage;
import pages.HomePage;

public class CartAdd_004 extends BaseTest {
    HomePage homepage;
    BookPage bookpage;
    BookDetailPage bookdetailpage;
    CartPage cartpage;

    @Test //Sepette kitap miktarını arttırma
    public void cartAd_004() throws InterruptedException {
        homepage= new HomePage(driver);
        homepage.getDriver("https://www.kitapyurdu.com/");
        homepage.clickCookieButton();
        homepage.setSearch_Input("Sefiller");

        bookpage= new BookPage(driver);
        bookpage.bookClick();

        bookdetailpage= new BookDetailPage(driver);
        bookdetailpage.addCart(1);
        bookdetailpage.goToCartPlace();
        bookdetailpage.cartClick();

        cartpage= new CartPage(driver);
        cartpage.valueAdd();
        cartpage.addPopUpIsDisplayed();







    }
}
