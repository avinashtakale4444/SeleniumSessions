package javaAssignments.strings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Stack;

public class StringsAssignments {
    @Test
    public void removeTrailingSpaces() {
        String str = "   Hello   Everyone   ";
        System.out.println(str.trim());
    }

    @Test
    public void removeTrailingAndBetweenSpaces() {
        String str = "   Hello   Everyone   ";
        System.out.println(str.replace(" ", ""));
    }

    @Test
    public void firstAndLastChar() {
        String str = "Avinash Takale";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));
    }

    @Test
    public void wordOrCharContains() {
        String str = "Avinash Takale";
        System.out.println(str.contains("n"));
        System.out.println(str.contains("kale"));
    }

    @Test
    public void reverseString() {
        String str = "Avinash Takale";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }

    @Test
    public void reverseEachWordOfString() {
        String str = "Avinash Takale";
        String[] s = str.split(" ");
        String rev = "";
        for (int i = 0; i <= s.length - 1; i++) {
            String s1 = s[i];
            String re = "";
            for (int j = s1.length() - 1; j >= 0; j--) {
                rev = rev + s1.charAt(j);
            }
            rev = rev + re + "\t";
        }
        System.out.println(rev);
    }

    @Test
    public void reverseEachWordOfStringUsingStack() {
        String str = "Avinash Takale";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) != ' ') {
                stack.push(str.charAt(i));
            }

            else {
              while (stack.empty()==false){
                System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
        }
        //System.out.println(stack);
      while (stack.empty() == false) {
            System.out.print(stack.pop());
        }
    }

    @Test
    public void reverseWordsOfString() {
        //Input: str = “I Love To Code”
        //Output: Code To Love I
        String str = "I Love To Code";
        String rev="";
        String s[]=str.split(" ");
        for (int i=s.length-1;i>=0;i--){
            rev+=s[i]+" ";
        }
        System.out.println(rev);
    }

    @Test
    public void reverseWordsOfStringUsingStack() {
        //Input: str = “I Love To Code”
        //Output: Code To Love I
        long l = System.currentTimeMillis();
        String str = "I Love To Code";
        Stack<String> stack=new Stack<>();
        String temp="";
        for (int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)==' '){
                stack.push(temp);
                temp="";
            }
            else {
                temp=temp+str.charAt(i);
            }

        }
        stack.add(temp);
        System.out.println(stack);
        while (stack.empty()==false){
            System.out.print(stack.pop()+" ");
        }
        long l1 = System.currentTimeMillis();
        System.out.println("\nTotal time - "+(l1-l));
    }

    @Test
    public void printNumericValues() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);

        driver.get("google");
        String s = "your transaction id is: 12345 and reference id is 34567";
        for (int i=0;i<=s.length()-1;i++){
            if(Character.isDigit(s.charAt(i))){
                System.out.print(Character.getNumericValue(s.charAt(i)));
            }
        }
    }
}
