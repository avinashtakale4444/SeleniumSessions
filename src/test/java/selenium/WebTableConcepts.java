package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WebTableConcepts {
    static WebDriver driver;
    static BrowserUtil browserUtil;
    static ElementUtilNavin elementUtil;

    public static void main(String[] args) throws InterruptedException {
        browserUtil = new BrowserUtil();
        driver = browserUtil.initBrowser("chrome");
        browserUtil.launchUrl("https://classic.crmpro.com/");
        elementUtil = new ElementUtilNavin(driver);
        By userNameTxt = By.xpath("//*[@name='username']");
        By passwordTxt = By.xpath("//*[@name='password']");
        By submitBtnTxt = By.xpath("//*[@value='Login']");
        elementUtil.login(userNameTxt, "newautomation", passwordTxt, "Selenium@12345", submitBtnTxt);
        System.out.println(browserUtil.getPageTitle());
        driver.switchTo().frame("mainpanel");
        Thread.sleep(5000);
        driver.findElement(By.linkText("CONTACTS")).click();
        WebElement element = driver.findElement(By.xpath("//*[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']"));
        element.click();
        By path = By.xpath("//*[text()='deepti gupta']/parent::td/following-sibling::td");
        System.out.println(getTexts(path));
        System.out.println("Company Name : "+getCompanyName("deepti gupta"));
    }

    public static List<String> getTexts(By locator) {
        List<String> list = new ArrayList<>();
        List<WebElement> eleList = elementUtil.getLocators(locator);
        for (WebElement e : eleList) {
            String text = e.getText();
            if (text != null)
                list.add(text);
        }
        return list;
    }
    public static String  getCompanyName(String person){
       return driver.findElement(By.xpath("//*[text()='"+person+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
    }
}
