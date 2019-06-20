package com.nn.thread.obj;

/**
 * 两把锁都要用,否则会抛异常:java.lang.IllegalMonitorStateException;
 * 忽略警告;
 */
public class Lesson2 {
    public static void main(String[] args) throws Exception{
        Lesson2 lesson2 = new Lesson2();
//        lesson2.test1();
        lesson2.test2();

    }

    @SuppressWarnings("all")
    void test1() throws Exception{
        System.out.println(Thread.currentThread().getName() + ":1");
        CustomThread2 customThread2 = new CustomThread2("t1  ");
        synchronized (customThread2){
            customThread2.start();
            System.out.println(Thread.currentThread().getName() + ":2");
            customThread2.wait();
            System.out.println(Thread.currentThread().getName() + ":5");
        }
        System.out.println(Thread.currentThread().getName() + ":6");
    }

    @SuppressWarnings("all")
    void test2() throws Exception{
        System.out.println(Thread.currentThread().getName() + ":1");
        Thread thread = new Thread(new CustomRunable2());
        thread.setName("t2");
        synchronized (thread){
            thread.start();
            System.out.println(Thread.currentThread().getName() + ":2");
            thread.wait();
            System.out.println(Thread.currentThread().getName() + ":5");
        }
        System.out.println(Thread.currentThread().getName() + ":6");
    }
}
