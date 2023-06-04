package javaSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRefferance {
   int age;
   String name;
    public static void main(String[] args) {
        ObjectRefferance obj=new ObjectRefferance();
        obj.test(obj);
    }

    public void test(ObjectRefferance obj1){
        obj1.age=1;
        obj1.name="avi";
        System.out.println(age);
        System.out.println(name);

    }
}
