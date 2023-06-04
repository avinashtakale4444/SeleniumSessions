package javaSessions.strings;

import org.testng.annotations.Test;

public class StringConcepts {
    @Test
    public void testName() {
        String str="This is my first java code";
        System.out.println(str.indexOf("i"));;
        System.out.println(str.indexOf('i',str.indexOf('i')+1));
        System.out.println(str.indexOf('i',str.indexOf('i',str.indexOf('i')+1)+1));
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.lastIndexOf('c',25));
        System.out.println(str.indexOf('f'));
        String s="";
        System.out.println(s.length());
        //java python selenium
        // muineles nohtyp avaj
        System.out.println(java.time.LocalDate.now().minusDays(1));
    }
}
