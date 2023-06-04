package javaSessions;

import org.testng.annotations.Test;

public class MethodCalling {
    public static void m1(){
        System.out.println("In static m1");
        m2();
    }
    public static void m2(){
        System.out.println("In static m2");
        m3();
    }
    public static void m3(){
        System.out.println("In static m3");

    }

    public void m4() {
        System.out.println("in m4");
        m3();
    }
    public void m5() {
        System.out.println("in m5");
        m4();
    }
    public static void main(String[] args) {
        MethodCalling m=new MethodCalling();
        m.m5();
    }
}
