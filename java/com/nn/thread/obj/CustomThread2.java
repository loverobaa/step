package com.nn.thread.obj;

public class CustomThread2 extends Thread{
    public CustomThread2(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this){
            System.out.println(Thread.currentThread().getName() + ":3");
            notify();
            System.out.println(Thread.currentThread().getName() + ":4");
        }
    }
}
