package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CrickBuzz {
    static WebDriver driver;
    static BrowserUtil browserUtil;
    static ElementUtilNavin elementUtil;

    public static void main(String[] args) throws InterruptedException {
        browserUtil = new BrowserUtil();
        driver = browserUtil.initBrowser("chrome");
        browserUtil.launchUrl("https://www.cricbuzz.com/live-cricket-scorecard/66274/gt-vs-rr-23rd-match-indian-premier-league-2023");
        elementUtil = new ElementUtilNavin(driver);
getInfo(" Abhinav Manohar ");
    }
    public static void getInfo(String name){
        By path= By.xpath("//a[text()='"+name+"' ]/parent::div/following-sibling::div");
        List<WebElement> locators = elementUtil.getLocators(path);
        List<String> list=new ArrayList<>();
        list.add(name);
        for (WebElement e:locators){
            list.add(e.getText());
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"\t");
        }
    }

}

