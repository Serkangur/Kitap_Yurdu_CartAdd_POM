package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.BookDetailPage;
import pages.BookPage;
import pages.HomePage;

import static constants.ConstantsBooksPage.popUpElement;

public class CartAdd_003 extends BaseTest {
    HomePage homepage;
    BookPage bookpage;
    BookDetailPage bookdetailpage;
    @Test // Sepete Aynı Ürünü Tekrar Ekleme
    public void cartAd_003() throws InterruptedException {
        homepage= new HomePage(driver);
        homepage.getDriver("https://www.kitapyurdu.com/");
        homepage.clickCookieButton();
        homepage.setSearch_Input("Sefiller");

        bookpage= new BookPage(driver);
        bookpage.bookClick();

        bookdetailpage= new BookDetailPage(driver);
        bookdetailpage.addCart(2);
        Thread.sleep(3000);
        bookdetailpage.popUpCheck();










    }
}
