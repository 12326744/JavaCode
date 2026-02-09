package com.work.exceptions;

public class ExceptionPropagation {
    public static void main(String[] args) {
        ExceptionPropagation ep=new ExceptionPropagation();
        try{
            ep.callA();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("END");

    }

    void callA(){
        System.out.println("callA");
        callB();
    }
    private void callB(){
        System.out.println("callB");
        callC();
    }
    private void callC(){
        System.out.println("callC");
        System.out.println(8/0);
    }
}
// java is a default exception handler
