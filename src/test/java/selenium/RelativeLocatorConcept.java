package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorConcept {
    static WebDriver driver;
    static BrowserUtil browserUtil;
    static ElementUtilNavin elementUtil;

    public static void main(String[] args) throws InterruptedException {
        browserUtil = new BrowserUtil();
        driver = browserUtil.initBrowser("chrome");
        browserUtil.launchUrl("https://classic.crmpro.com/");
        elementUtil = new ElementUtilNavin(driver);
        By path= By.xpath("//a[text()='Features']");
        WebElement element=driver.findElement(path);
        String text = driver.findElement(with(By.tagName("a")).near(element)).getText();
        String text1 = driver.findElement(with(By.tagName("a")).toLeftOf(element)).getText();
        String text2 = driver.findElement(with(By.tagName("a")).toRightOf(element)).getText();
        System.out.println(text);
    }
}
