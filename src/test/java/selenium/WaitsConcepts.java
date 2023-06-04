package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsConcepts {
    static WebDriver driver;
    static BrowserUtil browserUtil;
    static ElementUtilNavin elementUtil;
static WebDriverWait wait;
    public static void main(String[] args) throws InterruptedException {
        browserUtil = new BrowserUtil();
        driver = browserUtil.initBrowser("chrome");
        browserUtil.launchUrl("https://classic.crmpro.com/");
        elementUtil = new ElementUtilNavin(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        By path= By.xpath("(//*[@type='submit'])[1]");
        System.out.println("title is : "+elementUtil.getLocator(path).getAttribute("value"));


    }

}
