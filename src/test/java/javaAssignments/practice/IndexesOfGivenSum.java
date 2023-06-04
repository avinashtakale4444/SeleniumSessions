package javaAssignments.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexesOfGivenSum {
    /*
    Input: arr[] = {8, 10, 6, 4}, Sum = 12
    Output: 7 4
     */
    public static void main(String[] args) {
        int a[]=new int[]{7,1, 10, 6, 4};

        int sum=12;
        System.out.println(Arrays.toString(test(a,sum)));
    }

    public static int[] test(int[] a, int sum) {
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==sum){
                    return new int []{i,j};
                }
            }
        }
        return null;
    }

}
