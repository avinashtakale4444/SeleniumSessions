package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
    static WebDriver driver;
    static BrowserUtil browserUtil;
    static ElementUtilNavin elementUtil;

    public static void main(String[] args) throws InterruptedException {
        browserUtil = new BrowserUtil();
        driver = browserUtil.initBrowser("chrome");
        browserUtil.launchUrl("https://www.browserstack.com/");
        elementUtil = new ElementUtilNavin(driver);
        By path = By.id("product-menu-dropdown");
        Actions actions = new Actions(driver);
        //moveToElement(path, actions);
        moveToElement(path,actions);
    }

    private static void moveToElement(By path, Actions actions) {
        actions.moveToElement(elementUtil.getLocator(path)).click()
                .build().perform();
       /* By path1 = By.xpath("//*[@id='product-menu-dropdown']");
        actions.moveToElement(elementUtil.getLocator(path1))
                .click().build().perform();*/
    }

    private static void tabConcept(By path,Actions actions) throws InterruptedException {
        moveToElement(path,actions);
        Thread.sleep(3000);
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).click().build().perform();
    }
}
