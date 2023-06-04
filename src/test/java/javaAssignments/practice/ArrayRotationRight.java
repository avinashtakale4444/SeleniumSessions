package javaAssignments.practice;

import java.util.Arrays;

public class ArrayRotationRight {
    /*
    Input: arr[] = {121, 232, 33, 43 ,5}
           k = 2
    Output: 43 5 121 232 33
     */
    public static void main(String[] args) {
        int a[] = new int[]{121, 232, 33, 43, 5};
        int b[] = new int[]{121, 232, 33, 43, 5};
        int d = 2;
        rotateRightMethod1(a, d);
        rotateRightMethod2(b, d);
    }

    public static void rotateRightMethod1(int[] a, int d) {
        int temp[] = new int[a.length];
        int k = 0;
        for (int i = a.length - d; i <= a.length - 1; i++) {
            temp[k++] = a[i];
        }
        for (int i = 0; i <= d; i++) {
            temp[k++] = a[i];
        }
        System.out.println(Arrays.toString(temp));
    }
    public static void rotateRightMethod2(int[] a, int d) {
       while (d>0){
        int first=a[a.length-1];
        for (int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=first;
        d--;
       }
        System.out.println(Arrays.toString(a));
    }
}
