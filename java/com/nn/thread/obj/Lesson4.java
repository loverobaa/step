package com.nn.thread.obj;

/**
 * 主要是关于子线程死循环中,触发某些条件来唤醒主线
 */
public class Lesson4 {
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception{
        CustomThread4 customThread4 = new CustomThread4("t4  ");
        synchronized (customThread4){
            customThread4.start();
            customThread4.wait();
        }
        System.out.println(Thread.currentThread().getName() + ":end");
    }
}
