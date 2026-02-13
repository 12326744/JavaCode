package com.work.multithreading;

public class ThreadJoin {
    public  static void main(String... args) throws InterruptedException {
        System.out.println("START "+ Thread.currentThread());

        Thread t1 = new Thread(() -> {
            for (int i=0;i<5;i++){
                System.out.println("Hello "+ i);
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        Worker t2=new Worker();
        t2.start();
        t2.join();

        t1.join();
        System.out.println(t1.getState());
        System.out.println("END "+ Thread.currentThread());
    }
}
