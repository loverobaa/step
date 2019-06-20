package com.nn.thread.obj;

/**
 * 主要是关于子线程使用主线程中的变量;
 * 回调函数的用法;
 */
public class Lesson5 {

    private static int a = 10;

    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception{
        int b = 10;
        System.out.println("1");
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (this){
//                    System.out.println("2");
//                    notify();
//                    System.out.println("3");
//                }
//            }
//        });
        TestThread testThread = new TestThread(new Test(30));
        synchronized (testThread){
            testThread.start();
            testThread.wait();
        }
        System.out.println("4");
    }
    static void callback(int a){
        System.out.println("回调:" + a);
    }
}

class TestThread extends Thread{

    private Test test;

    public TestThread(Test test){
        this.test = test;
    }

    @Override
    public void run() {
        synchronized (this){
            test.setA(20);
            Lesson5.callback(test.getA());
            notify();
        }
    }
}

class Test{
    private int a = 10;

    public Test(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
