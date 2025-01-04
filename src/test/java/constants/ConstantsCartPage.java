package constants;

import org.openqa.selenium.By;

public class ConstantsCartPage {
    public static By bookAdd = By.xpath("//i[@class=\"js-count-plus-button cart-sprite cart-icon-plus ms-2px\"]");
    public static By productPrice=By.xpath("//div[@id=\"cart-nav-total\"]");
    public static By cartAmount=By.xpath("//span[@id=\"cart-items\"]");
    public static By productPriceDetail=By.xpath("//p[@class=\"fs-14 fw-bold lh-1 mb-0\"]");
    public static By cleanCart=By.xpath("//div[@class=\"js-remove-button d-flex align-items-center pe-10px\"]");
    public static By cleanCartClick=By.xpath("//button[@class=\"btn fs-18 bg-gray-200 lh-sm text-gray-900 mb-10px p-15px\"]");
    public static By cartCleanCheck=By.xpath("//div[@class=\"cart-empty-text fs-16\"]");
    public static By bookSubtract=By.xpath("//i[@id=\"minus-button-281936\"]");
}
