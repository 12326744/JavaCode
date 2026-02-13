package com.work.multithreading;

public class DaemonExample {
    public static void main(String[] args) {
        Thread d1 = new Thread(()->{
            while(true){
                try{
                    System.out.println("Daemon thread working in the background...");
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        
        d1.setDaemon(true);
        
        d1.start();
        
        try{
            System.out.println("main thread is starting its work ...");
            Thread.sleep(3000);
            System.out.println("Main thread is finished!");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("main thread is exiting ... ");
    }
}