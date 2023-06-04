package javaAssignments;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ArrayListss {
    int age;
    String name;
    String teamName;
    String DOB;
    char gender;
    Double strikeRate;
    final static int a=10;

    public  ArrayListss(int age,String name, String teamName,String DOB,char gender,Double strikeRate) {
       this.age=age;
       this.name=name;
       this.teamName=teamName;
       this.DOB=DOB;
       this.gender=gender;
       this.strikeRate=strikeRate;
    }



    public void dis(){
    System.out.println(age+" "+name+" "+teamName+" "+DOB+" "+gender+" "+strikeRate);
    return  ;
}
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println(stack);
        stack.add(1);
        System.out.println(stack);
        stack.add(2);
        System.out.println(stack);
        stack.add(3);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        ArrayListss a=new ArrayListss(25,"abc","india","12-12-2000",'M',45.45);
        a.dis();
        ArrayList<String> stringArrayList= new ArrayList<>();
        stringArrayList.add("abc");
        stringArrayList.add("xyx");
        stringArrayList.add("pqwr");
        stringArrayList.add("efg");
        System.out.println(stringArrayList.subList(0,1));

    }

}
