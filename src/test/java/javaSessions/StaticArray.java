package javaSessions;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticArray {
    @Test
    public void test() {
        int a[]=new int[2];
        int a1 []=new int[1];
        int [] a3=new int[1];
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a3);

        int a4[]=new int[]{1,6,7};
        System.out.println(Arrays.toString(a4));

        String a6[]=new  String[]{"abc","test"};
        System.out.println(Arrays.toString(a6));

        char c[]=new char[]{'a','b'};
        System.out.println(Arrays.toString(c));
        ArrayList l=new ArrayList();
    }
}
