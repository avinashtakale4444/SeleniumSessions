package javaSessions;

public class DataTypesConcept {
    public static void main(String[] args) {
        //data types:
        //1. primitive data types: it takes the space in the memory - without object
        //There are 8 types of Primitive data types in Java –
        // boolean-1 ~bit, char-2 byte,int-4 byte, short-2 byte-1 byte, long-8 byte, float-4 byte, and double-8 byte
        //boolean type: true/false
        //Numeric Type:
        //a. character type: char
        //b. Integral Value:
        //b.1: Integer: byte, short, int, long
        //b.2: Floating-point: float, double

        //2. non primitive data types: with Object. Array, String, Classes, Interface -- OOP

//1. byte:
        //size: 1 byte = 8 bits and range: -128 to 127
        byte a = 100;byte b=0;byte c=-128;
        System.out.println(a+ " "+b+" "+c );
//2. short:
        //size: 2 bytes = 2x8 = 16 bits and range: -32768 to 32767
        short d=128 , e=-129;
        System.out.println(d+" "+e);
//3. int:
        //size: 4 bytes = 32 bits and range: -2147483648 to 2147483647 ==> -2^31 to 2^31-1
        int f = 2300;       int g = 909998;        int h = 0;
        System.out.println(f+" "+g+" "+h);
        //BigInteger
//4. long:
        //size: 8 bytes = 64 bits and range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //-2^63 to 2^63-1
        long num = 121212121;        long distance = 989898765456l;        long phone = 2345678919L;//Not recommended
        System.out.println(distance+" "+phone);
//5. float:
        //size: 4 bytes = 32 bits and range: after . it can take upto 7 digits
        float f1 = 12.33f;    float f2 = (float)34.44;  float f3 = 2.1f; float f4=2.1111111111111112221f;
        System.out.println(f1+" "+f3+" "+f4);
//6. double:
        //size: 8 bytes = 64 bits and range: after . it can take upto 15 digits
        double dd = 12.333;  double d1 = 1.1; double d2=5664.22222222222222222222222222d;
        System.out.println(dd+" "+d1+" "+d2);
        //BigDecimal
//7. char:
        //size: 2 bytes = 16 bits
        //0-9
        //a-z
        //A-Z
        //all special chars
        char c1 = 'a'; //a-z , A-Z
        char c3 = 'A';
        char c4 = 'H';
        char c2 = '1'; //0-9
        char c5 = '$';
        char c6 = '*';
        System.out.println(c1+c3);
        System.out.println(c3+c1-c1);
//8. boolean:true/false
        //size: ~ 1 bit
        boolean flag = true;
        boolean test = false;
        System.out.println(flag);
        System.out.println(1);
        int pop = 1000;
        System.out.println(pop);

    }
}
