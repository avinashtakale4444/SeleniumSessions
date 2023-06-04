package javaSessions.strings;

public class StringConcatenation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);//30

        String x = "hello";
        String y = "Selenium";

        System.out.println(x+y);//helloSelenium
        System.out.println(a+x);//10hello
        System.out.println(a+b+x+y);//30helloSelenium
        System.out.println(x+y+a+b);//helloSelenium1020
        System.out.println(x+y+(a+b));//helloSelenium30
        System.out.println(a+b+x+y+a+b);//30helloSelenium1020
        System.out.println(a+b+x+y+(a+b));//30helloSelenium30

        double c = 12.33;
        double d = 23.44;

        System.out.println(x+y+c+d);//helloSelenium12.3323.44
        System.out.println(x+y+a+b+c+d);//helloSelenium102012.3323.44

        char g = 'm';
        char p = 'n';

        String l = "testing";
        String u = "testing";

        System.out.println(l+u);//testingtesting
        System.out.println(l+u+g+p);//testingtestingmn

        char t1 = 'a';//
        char t2 = 'b';//
        System.out.println(t1+t2);//97+98=195
        char t3 = 'z';//
        System.out.println(t1+t2+t3);//97+98=195+122

        System.out.println(t1);//a
        System.out.println(t2-t1);//1

        char gender = 'm';

        System.out.println('a'+'b');//97+98

        System.out.println("a+b");//a+b

        //a-z: 97 to 122
        //A-Z: 65 to 90
        //0-9: 48 to 57
        System.out.println('$'+'a');//36+97

        System.out.println((byte)'a');//97
        System.out.println((byte)'$');//36
        System.out.println((int)'a');//97
        System.out.println((long) 'a');
        System.out.println((double) 'a');
        int s1 = 100;
        int s2 = 300;
        System.out.println("the value of s1 is :" + s1);//100
        System.out.println("the value of s2 is :" + s2);//300
        System.out.println("the sum is: "+ (s1 + s2));//400
    }
}
