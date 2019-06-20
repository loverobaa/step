package com.nn.thread.obj;

/**
 * 主要是关于wait(1000)前后的一些测试,设置某个子线程为守护线程未测试;
 * 现有测试表示,假如主线程执行完毕,子线程还在执行,则子线程不会因为主线程的结束而结束,但是子线程若是守护线程则不清楚;
 */
public class Lesson3 {
    public static void main(String[] args) throws Exception{
        System.out.println(Thread.currentThread().getName() + ":1");
        CustomThread3 customThread3 = new CustomThread3("t3  ");
        synchronized (customThread3){
            customThread3.start();
            System.out.println(Thread.currentThread().getName() + ":2");
            customThread3.wait(3000);
            System.out.println(Thread.currentThread().getName() + ":3");
        }
        System.out.println(Thread.currentThread().getName() + ":4");
    }
}
