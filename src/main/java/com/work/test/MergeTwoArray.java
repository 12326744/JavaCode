package com.work.test;
import java.util.*;
public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1={10,2,5,6};
        int n=arr1.length;
        int[] arr2={1,20,4,9};
        int m=arr2.length;
        int[] merr=new int[n+m];

        for(int i=0;i<n;i++){
            merr[i]=arr1[i];
        }

        for(int i=0;i<m;i++){
            merr[i+n]=arr2[i];
        }

        Arrays.sort(merr);
        for(int i=0;i<n+m;i++){
            System.out.print(merr[i]+" ");
        }

    }
}
