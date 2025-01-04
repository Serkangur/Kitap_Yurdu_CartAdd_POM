package constants;

import org.openqa.selenium.By;

public class ConstantsBookDetailPage {
    public static By stockText= By.xpath("//span[@class=\"preparation-day\"]");
    public static By sepeteEkle= By.id("button-cart");
    public  static By cartPlace= By.xpath("//div[@class=\"heading\"]");
    public static By cartClick = By.xpath("//a[@id=\"js-cart\"]");
    public static By cartEmpty=By.xpath("//div[@class=\"empty\"]");

}
