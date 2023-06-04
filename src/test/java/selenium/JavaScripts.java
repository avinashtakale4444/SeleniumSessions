package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScripts {
    static WebDriver driver;
    static BrowserUtil browserUtil;
    static ElementUtilNavin elementUtil;

    public static void main(String[] args) throws InterruptedException {
        browserUtil = new BrowserUtil();
        driver = browserUtil.initBrowser("chrome");
        browserUtil.launchUrl("https://www.freshworks.com/");
        elementUtil = new ElementUtilNavin(driver);
        By path = By.xpath("//*[text()='IT Service']/following-sibling::a");
        WebElement element = elementUtil.getLocator(path);
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView(true)",element);
       js.executeScript("arguments[0].click();",element);
    }
}
