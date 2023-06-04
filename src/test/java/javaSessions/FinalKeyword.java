package javaSessions;

public class FinalKeyword {
    public static void main(String[] args) {

        //constant values:

        int x = 10;
        x = 20;
        x = 30;
        x = 40;
        System.out.println(x);

        final int days = 7;
        int salary = days * 100;
        System.out.println(salary);

        final int DEFAULT_TIME_OUT = 10;
        final String LOGIN_PAGE_TITLE = "Amazon login";
        final char GENDER = 'f';
        final float f=10.1f;
        final double d=10;
        final long l=34;
        System.out.println(f);
    }
}
