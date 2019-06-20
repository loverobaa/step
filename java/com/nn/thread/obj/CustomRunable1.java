package com.nn.thread.obj;

public class CustomRunable1 implements Runnable {
    @Override
    public void run() {
        synchronized (this){
//            notify();
            System.out.println("go out");
        }
    }
}
