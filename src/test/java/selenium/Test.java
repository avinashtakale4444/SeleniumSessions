package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {
    static WebDriver driver;
    public static BrowserUtil browserUtil;
    public static ElementUtilNavin elementUtil;

    public static void main(String[] args) throws MyException {
        browserUtil=new BrowserUtil();
        driver = browserUtil.initBrowser("chrome");
        elementUtil = new ElementUtilNavin(driver);

        driver.navigate().to("https://www.guru99.com/");

       /* By id=By.id("menu-item-3172");
        String text=elementUtil.getText(id);
        System.out.println(text);*/
        String ele="DEFECT TOOLS";
        By xpath=By.xpath("//*[@class='col-md-3']/div/h4");
        elementUtil.search(xpath,ele);

    }

}
