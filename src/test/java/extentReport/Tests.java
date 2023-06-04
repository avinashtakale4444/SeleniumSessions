package extentReport;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
    @Test
    public void test1() {
        System.out.println("hi test1");
    }

    @Test
    public void test2() {
        Assert.assertTrue(true);
    }
}
