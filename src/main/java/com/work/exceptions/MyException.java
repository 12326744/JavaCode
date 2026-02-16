package com.work.exceptions;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class Test {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom Error");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}