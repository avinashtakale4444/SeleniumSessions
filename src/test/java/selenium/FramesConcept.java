package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesConcept {
    static WebDriver driver;
    static BrowserUtil browserUtil;
    static ElementUtilNavin elementUtil;

    public static void main(String[] args) throws InterruptedException {
        browserUtil = new BrowserUtil();
        driver = browserUtil.initBrowser("chrome");
        browserUtil.launchUrl("https://selectorshub.com/iframe-scenario");
        elementUtil = new ElementUtilNavin(driver);
        By path = By.xpath("//input[@id='jex']");
        Thread.sleep(5000);
        driver.switchTo().frame("pact1")
                .switchTo().frame("pact2")
                .findElement(path)
                .sendKeys("hello there ");
        driver.switchTo().parentFrame();
        Actions a=new Actions(driver);
        By parentPath = By.xpath("//input[@id='inp_val']");
        driver.findElement(parentPath).sendKeys("first crush");
        By destinyPath=By.xpath("//input[@id='glaf']");
        driver.switchTo().frame("pact2").switchTo().frame("pact3");
        Thread.sleep(5000);
        driver.findElement(destinyPath).sendKeys("test");
    }
}
