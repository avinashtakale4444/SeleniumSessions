package javaAssignments.practice;

import java.util.Arrays;

public class ArrayRotationLeft {
   /* Input:
    arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2
    Output: 3 4 5 6 7 1 2
    */
    public static void main(String[] args) {
        int a[]=new int[]{1, 2, 3, 4, 5, 6, 7};
        int b[]=new int[]{1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        rotateLeftMethod1(a,d);
        rotateLeftMethod2(b,d);
    }

    public static void rotateLeftMethod1(int a[] , int d) {
        while (d>0){
            int last=a[0];
            for (int i=0;i<a.length-1;i++){
                a[i]=a[i+1];
            }
            a[a.length-1]=last;
            d--;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void rotateLeftMethod2(int a[] , int d) {
    int temp[]=new int[a.length];
    int k=0;
    for (int i=d;i<=a.length-1;i++){
        temp[k++]=a[i];
    }
        for (int i=0;i<d;i++){
            temp[k++]=a[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
