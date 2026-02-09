package com.work.wrapperclass;

import java.math.BigInteger;

public class BigIntDemo {
    public static void main(String[] args) {
        long maxLong=Long.MAX_VALUE;

        long overFlowed=maxLong * 10;
        System.out.println("overflowed Long: "+ overFlowed);

        BigInteger bigNum=BigInteger.valueOf(maxLong);
        BigInteger result=bigNum.multiply(BigInteger.valueOf(10));
        System.out.println("BigInteger Result: "+ result);
    }
}
