package com.nn.thread.obj;

/**
 * notify all test;
 * 多个子线程等待主线程的唤醒,注意此时的执行顺序是不定的;
 */
public class Lesson6 {
    private static Object obj = new Object();
    public static void main(String[] args) {
        System.out.println("come in");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        System.out.println("1--lock");
                        obj.wait();
                        System.out.println("1--out");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                synchronized (obj) {
                    try {
                        System.out.println("2--lock");
                        obj.wait();
                        System.out.println("2--out");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        System.out.println("3--lock");
                        obj.wait();
                        System.out.println("3--out");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        thread2.start();
        thread3.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (obj){
            System.out.println("4--lock");
//            try {
//                Thread.sleep(10000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            obj.notifyAll();
            System.out.println("4--out");
        }
        System.out.println("go out");
    }
}
