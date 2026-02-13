package com.work.multithreading;

public class Worker extends Thread{

    public void run(){
        System.out.println(Thread.currentThread());
        for (int i=0;i<10;i++){
            try{
                Thread.sleep(500);
                System.out.println("Hello "+ i + " from " + Thread.currentThread());
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
    }
}
