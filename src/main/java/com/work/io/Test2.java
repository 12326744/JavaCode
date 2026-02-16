package com.work.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException { //checked Exception handle using throws
        FileInputStream fis = new FileInputStream("abc.txt");
    }
}