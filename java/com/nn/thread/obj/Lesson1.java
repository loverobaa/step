package com.nn.thread.obj;

/**
 * 查看主线程是否一定比子线程快,答案是否定的,跟代码设计有关;
 * Thread.sleep(5000);会释放锁吗,不会
 */
public class Lesson1 {
    public static void main(String[] args) throws Exception{
        CustomRunable1 customRunable1 = new CustomRunable1();
        Thread thread = new Thread(customRunable1);
        synchronized (thread){
            thread.start();
            Thread.sleep(5000);
        }
        System.out.println("123");
    }
}
