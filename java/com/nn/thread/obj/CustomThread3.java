package com.nn.thread.obj;

public class CustomThread3 extends Thread{

    public CustomThread3(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this){
            System.out.println(Thread.currentThread().getName() + ":5");
            notify();
            System.out.println(Thread.currentThread().getName() + ":6");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true){
            System.out.println("---");
        }
    }
}
