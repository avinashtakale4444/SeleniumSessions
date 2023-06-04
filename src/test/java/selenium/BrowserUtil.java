package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;

public class BrowserUtil {
    private WebDriver driver;

    public WebDriver initBrowser(String browser) {
        if (browser == null) {
            System.out.println("Browser cannot be null");
            throw new MyException("BROWSERNULLEXCEPTION");
        }
        switch (browser.toLowerCase().trim()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Plz pass the right browser");
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }

    public void closeBrowser() {
        driver.quit();
    }

    public void launchUrl(String url) {
        driver.navigate().to(url);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void launchUrl(URL url) {
        driver.navigate().to(url);
    }
}
