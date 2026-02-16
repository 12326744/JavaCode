package com.work.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class TestException {
    static void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("abc.txt");
    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }
}
