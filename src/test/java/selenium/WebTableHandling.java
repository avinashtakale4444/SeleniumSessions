package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WebTableHandling {
    static WebDriver driver;
    static BrowserUtil browserUtil;
    static ElementUtilNavin elementUtil;

    public static void main(String[] args) {
        browserUtil = new BrowserUtil();
        driver = browserUtil.initBrowser("chrome");
        browserUtil.launchUrl("https://selectorshub.com/xpath-practice-page/");
        elementUtil = new ElementUtilNavin(driver);
        WebElement element = elementUtil.getLocator(By.xpath("//*[text()='Users Table  ']"));
        elementUtil.scrollDown(element);
        By path = By.xpath("//a[text()='Jordan.Mathews']/parent::td/preceding-sibling::td/input[@type='checkbox']");
        elementUtil.submit(path);
        List<WebElement> list = new ArrayList<>();
        list = elementUtil.getLocators(By.xpath("//a[text()='Jordan.Mathews']/parent::td/following-sibling::td"));
        for (WebElement e : list) {
            System.out.println(e.getText());
        }
    }
}
