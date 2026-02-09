package com.work.exceptions;

public class ExceptionHandlingWithThrows {
    public static void main(String[] args) {
        ExceptionPropagation ep = new ExceptionPropagation();
        try{
            ep.callA();
        }catch (Exception e){
            e.printStackTrace();
        }
//        catch (Throwable t){  //we should not include catch with Throwable as it catches Errors as well
//            t.printStackTrace();
//        }

        System.out.println("END");
    }

    private void callA() throws InterruptedException {
        System.out.println("callA");
        callB();
    }
    private void callB() throws InterruptedException {
        System.out.println("callB");
        callC();
    }
    private void callC() throws InterruptedException {
        System.out.println("callC");

        Thread.sleep(500);
        System.out.println("END");
    }
}