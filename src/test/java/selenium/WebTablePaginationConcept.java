package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablePaginationConcept {
    static WebDriver driver;
    static BrowserUtil browserUtil;
    static ElementUtilNavin elementUtil;

    public static void main(String[] args) throws InterruptedException {
        browserUtil = new BrowserUtil();
        driver = browserUtil.initBrowser("chrome");
        browserUtil.launchUrl("https://selectorshub.com/xpath-practice-page");
        elementUtil = new ElementUtilNavin(driver);
        By path = By.xpath("(//*[text()='System Distribution Details'])[2]");
        WebElement locator = elementUtil.getLocator(path);
        elementUtil.scrollDown(locator);
        //selectCheckBox("abc");
        selectCountrys("India");
    }

    public static void multipleSelection(String country) throws InterruptedException {
        selectCountrys(country);
        /*List<WebElement> elements = driver.findElements(By.xpath("//*[@class='row-hover']/child::tr/td[text()='" + country + "']"));

        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
            String coun = elements.get(i).getText();
            driver.findElement(By.xpath("//td[text()='" + coun + "']/preceding-sibling::td/input[@type='checkbox']")).click();
        }*/
    }

    public static void selectCheckBox(String country) throws InterruptedException {
        while (true) {
            if (driver.findElements(By.xpath("//td[text()='" + country + "']")).size() > 0) {
                continue;
            } else {
                Thread.sleep(1500);
                WebElement next = driver.findElement(By.linkText("Next"));
                if (next.getAttribute("class").contains("disable")) {
                    System.out.println("pagination is over...country is not found...");
                    break;
                }
                next.click();
                Thread.sleep(1500);
            }

        }
    }

    public static void selectCountry(String country) {
        driver.findElement(By.xpath("//td[text()='" + country + "']/preceding-sibling::td/input[@type='checkbox']")).click();
    }

    public static void selectCountrys(String... country) throws InterruptedException {
        int size = country.length;
        System.out.println(size);

        while (true) {
            Thread.sleep(5000);
            WebElement next = driver.findElement(By.linkText("Next"));

            if (!next.getAttribute("class").contains("disable")) {
                List<WebElement> elements = driver.findElements(By.xpath("//td[text()='" + country[0] + "']/preceding-sibling::td/input[@type='checkbox']"));
                for (WebElement e : elements) {
                    e.click();
                }
                next.click();

            } else {
                System.out.println("pagination is over...country is not found...");
                break;
            }
        }
    }
}
