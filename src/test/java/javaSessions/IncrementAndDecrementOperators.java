package javaSessions;

public class IncrementAndDecrementOperators {
    public static void main(String[] args) {

        //++ and --

        //post increment:
        int a = 1;
        int b = a++;

        System.out.println(a);//2
        System.out.println(b);//1

        int l = 3;
        int m = l++;
        System.out.println(l);//4
        System.out.println(m);//3

        int p = -98;
        int q = p++;
        System.out.println(p);//-97
        System.out.println(q);//-98

        //pre increment:
        int u = 1;
        int y = ++u;
        System.out.println(u);//2
        System.out.println(y);//2

        int x = 5;
        int z = ++x;
        System.out.println(x);//6
        System.out.println(z);//6

        int v = -99;
        int vv = ++v;
        System.out.println(v);//-98
        System.out.println(vv);//-98

        int pop = 2;
        System.out.println(pop++);//2
        System.out.println(pop);//3

        int loop = 2;
        System.out.println(++loop);//3
        System.out.println(loop);//3

        int amount = 10;
        int finalAmount = amount+4;
        System.out.println(finalAmount);//14

        //post decrement:
        int tt = 2;
        int pp = tt--;
        System.out.println(tt);//1
        System.out.println(pp);//2

        int rest = -99;
        System.out.println(rest);//-99
        int api = rest--;
        System.out.println(rest);//-100
        System.out.println(api);//-99

        //pre decrement:
        int aa = 2;
        int bb = --aa;
        System.out.println(aa);//1
        System.out.println(bb);//1

        int s1 = -1000;
        int s2 = --s1;
        System.out.println(s1);//-1001

        System.out.println(s2);//-1001

        int s3 = 40;
        System.out.println(s3--);//40
        System.out.println(s3);//39


        int p3 = 50;
        System.out.println(--p3);//49
        System.out.println(p3);//49

        System.out.println(p3+1);//50


        int na = 1;
        System.out.println(na);//1
        int test = na++ + na++ + na++ + na++;//test=1+2+3+4  na=2 3 4 5
        System.out.println(test);// 10
        System.out.println(na);//5



    }
}
