package javaAssignments;

import org.testng.annotations.Test;

public class LoopsAssignments {
    @Test
    public void test(){
        for(int i=1;i<=9;i++){
            System.out.println("I am Batman "+i);
        }
    }

    @Test
    public void testWhileLoop() {
        int i=10;
        while (i>=1){
            System.out.println(i);
            i--;
        }
    }

    @Test
    public void testDoWhileLoop() {
        int i=10;
        do {
            System.out.println(i);
            i--;
        }while (i>0);
    }

    @Test
    public void testMultiplicatoinOf5() {
        int i=1;
        while (i<=100){
            if(i%9==0){
                System.out.print(i+"\t");
            }
            i++;
        }
    }

    @Test
    public void testOddEvenNumbers() {
        int i=1;
        while (i<=100){
            if (i%2==0){
                System.out.print("Even number: "+i);
            }
            else {
                System.out.print("odd number "+i);
            }
            i++;
            System.out.println();
        }
    }

    @Test
    public void printaTozWithAscii() {
        for (char c='A';c<='Z';c++){
            System.out.print(c+"="+(int) c+"\t");
        }
    }

    @Test
    public void print0To9WithAscii() {
        for (char c='1';c<='9';c++){
            System.out.println((int)c);
        }
    }

    @Test
    public void printSeries() {
        for (double i=1;i<=9;i++){
            System.out.println(i);
        }
    }

    @Test
    public void printVowels() {
        char c='a';
        while (c<='z') {
         if(c=='a'||c=='i'||c=='o'||c=='u'||c=='e'){
            System.out.println(c);
                    }
            c++;
        }
    }

    @Test
    public void testName() {
        int i=1;
        while (i<10){
            if(i%7==0)
            {
                System.out.println("bye, see you tomorrow");
            }
            i++;
        }
    }
}
