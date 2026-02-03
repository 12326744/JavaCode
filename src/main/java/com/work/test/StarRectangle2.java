package com.work.test;

public class StarRectangle2 {
    public static void main(String[] args) {
        int n=4;
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
