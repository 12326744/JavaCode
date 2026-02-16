package com.work.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
