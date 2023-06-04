package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JqueryDropDown {
    static WebDriver driver;
    static BrowserUtil browserUtil;
    static ElementUtilNavin elementUtil;

    public static void main(String[] args) throws InterruptedException {
        browserUtil = new BrowserUtil();
        driver = browserUtil.initBrowser("chrome");
        elementUtil = new ElementUtilNavin(driver);
        browserUtil.launchUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.findElement(By.id("justAnInputBox")).click();
        Thread.sleep(1000);
        By path = By.xpath("(//*[@class='comboTreeDropDownContainer'])[1]//span");
        //driver.findElement(path).click();
        //selectChoices(path, "choice 1", "choice 3", "choice 4");
        elementUtil.selectChoices(path, "choice 7");
    }


}
