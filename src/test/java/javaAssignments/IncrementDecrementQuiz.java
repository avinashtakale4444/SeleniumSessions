package javaAssignments;

import org.testng.annotations.Test;

public class IncrementDecrementQuiz {
    @Test
    public void test1() {
        int i = 11;
        i = i++ + ++i;
        //11 12+1 13
        System.out.println(i);//24
    }

    @Test
    public void test2() {
        int a = 11, b = 22, c;
        c = a + b + a++ + b++ + ++a + ++b;
        // 11 + 22 +11 + 22 +13+24
        System.out.println("a=" + a);//13
        System.out.println("b=" + b);//24
        System.out.println("c=" + c);//103
    }

    @Test
    public void test3() {
        int i = 0;
        i = i++ - --i + ++i - i--;
        //  0-0+1-1
        System.out.println(i);//0
    }

    @Test
    public void test4() {
        boolean b = true;
        // b++;
        System.out.println(b);//Operator '++' cannot be applied to 'boolean'
    }

    @Test
    public void test5() {
        int i = 1, j = 2, k = 3;
        int m = i-- - j-- - k--;
        System.out.println("i=" + i);//0
        System.out.println("j=" + j);//1
        System.out.println("k=" + k);//2
        System.out.println("m=" + m);//-4
    }

    @Test
    public void test6() {
        int a = 1, b = 2;
        System.out.println(--b - ++a + ++b - --a);//0
        // 1 - 2+2-1
    }

    @Test
    public void test7() {
        int i = 19, j = 29, k;
        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
         //19 - 18 + 28 -29 +18 - 29+19-28
        //i=19 18 19
        //j=28 
        System.out.println("i=" + i);//19
        System.out.println("j=" + j);//29
        System.out.println("k=" + k);//-20
    }

    @Test
    public void test8() {
        int i = 11;
       // int j = --(i++);//variable is expected
       // System.out.println(j);
    }

    @Test
    public void test9() {
      int m = 0, n = 0;
      int p = --m * --n * n-- * m--;
            //-1 * -1 * -1 * -1
      System.out.println(p);//1
    }

    @Test
    public void test10() {
        int a=1;
        a = a++ + ++a * --a - a--;
          //1 + 3 * 2-2
        System.out.println(a);//5
    }

    @Test
    public void test11() {
       // int a = 11++;//variable expected
       // System.out.println(a);
    }

    @Test
    public void test12() {
        char ch = 'A';
        ch++;
        System.out.println(ch);
        System.out.println(ch++);
        System.out.println(ch);
    }

    @Test
    public void test13() {
        char ch = 'A';
        System.out.println(--ch);
        System.out.println(++ch);
    }

    @Test
    public void test14() {
        double d = 1.5, D = 2.5;
        System.out.println(d++ + ++D);//5.0


    }
}
