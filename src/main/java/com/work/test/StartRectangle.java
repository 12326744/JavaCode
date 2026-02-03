package com.work.test;

public class StartRectangle {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=n-1;k>=i;k--){
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
