package javaSessions;

public class MathematicalOperations {
    public static void main(String[] args) {

        System.out.println(4/2);//2
        System.out.println(4+2);//6
        System.out.println(4-2);//2
        System.out.println(4*2);//8

        System.out.println(9/3);//3
        System.out.println(9/2);//4
        System.out.println(9.0/2);//4.5
        System.out.println(9/2.0);//4.5
        System.out.println(9.0/2.0);//4.5

        System.out.println((float)9/2);//4.5

        System.out.println(0/9);//0
        //System.out.println(9/0);//ArithmeticException: / by zero

        //System.out.println(0/0);//ArithmeticException: / by zero

        System.out.println("9.0/0 is "+9.0/0);//infinity
        System.out.println(9/0.0);//infinity
        System.out.println(9.0/0.0);//infinity
        System.out.println("0.0/2.0 is "+0.0/2.0);//0.0
        System.out.println((float)9/0);//infinity
        System.out.println(0.0/0);//NaN
        System.out.println(0/0.0);//NaN
        System.out.println(0.0/0.0);//NaN
        //System.out.println(0/0);
        System.out.println(9/0.0);//infinity
        System.out.println('a'/2);//48
        System.out.println(9 % 3);//0
        System.out.println(9 % 2);//1
        System.out.println(100 % 5);//0
        System.out.println(8 % 2);//0

    }
}
