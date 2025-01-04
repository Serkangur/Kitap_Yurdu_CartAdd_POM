package tests;

import base.BaseTest;
import org.junit.Test;
import pages.BookDetailPage;
import pages.BookPage;
import pages.HomePage;

public class CartAdd_002 extends BaseTest {
    HomePage homepage;
    BookPage bookpage;
    BookDetailPage bookdetailpage;
    @Test //Stokta Olmayan Ürünü Sepete Ekleme
    public void cartAd_002() throws InterruptedException {
        homepage= new HomePage(driver);
        homepage.getDriver("https://www.kitapyurdu.com/");
        homepage.clickCookieButton();
        homepage.setSearch_Input("The Lord of the  Rings - The Two Towers");

        bookpage= new BookPage(driver);
        bookpage.bookClick();

        bookdetailpage= new BookDetailPage(driver);
        bookdetailpage.stockTextIsDisplayed();


    }
}
