package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DropDowns {
    BrowserUtil browserUtil = new BrowserUtil();
    ElementUtilNavin elementUtil;

    @Test
    public void selectMethods() {
        WebDriver driver = browserUtil.initBrowser("edge");
        elementUtil = new ElementUtilNavin(driver);
        browserUtil.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
        By country=By.id("Form_getForm_Country");
        WebElement e = elementUtil.getLocator(country);
        elementUtil.scrollDown(e);
        elementUtil.selectByIndex(country,2);
        elementUtil.selectByValue(country,"China");
        elementUtil.getAllOptions(country,"Canada");
    }

    @Test
    public void selectMultiple() {
        WebDriver driver = browserUtil.initBrowser("edge");
        elementUtil = new ElementUtilNavin(driver);
        browserUtil.launchUrl("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
        By country=By.id("multi-select");
        elementUtil.selectByValue(country,"California");
        elementUtil.selectByIndex(country,4);
        elementUtil.selectByVisibleText(country,"Pennsylvania");
    }
}
