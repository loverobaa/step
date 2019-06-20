package com.nn.thread.obj;

public class CustomThread4 extends Thread{

    public CustomThread4(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (this){
            int a = 10;
            while (a > 0){
                System.out.println(a--);
                if(a == 5){
                    notify();
                }
            }
        }

    }
}
