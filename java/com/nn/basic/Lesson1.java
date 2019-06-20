package com.nn.basic;

import java.util.ArrayList;

/**
 * 主要用于对Java基本类型和引用类型做一些与c指针相关的比较
 * java不能直接操作内存,指针什么的概念已经被jvm掩藏掉了;
 */
public class Lesson1 {
    public static void main(String[] args) {
        Lesson1 lesson1 = new Lesson1();
//        lesson1.test1();
//        lesson1.test2();
//        lesson1.test3();
        lesson1.test4();
    }

    //基本类型
    void test1(){
        int a = 1;
        int b = 1;
        b = 2;
        System.out.println(a);
    }

    //包装类型
    void test2(){
        Integer a = 1;
        Integer b = 1;
        b = 2;
        System.out.println(a);
        System.out.println(a.toString());
        System.out.println(a);
    }

    //引用类型
    void test3(){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = list;
        list.add(1);
        list.add(2);
        list.add(3);
        list2.remove(1);
        System.out.println(list.toString());
        System.out.println(list2.toString());
        System.out.println(list.toArray().toString());
        System.out.println(list2.toArray().toString());
    }


    void test4(){
        int a,b = 1;
//        a未初始化
//        System.out.println(a);
        System.out.println(b);
        int c = 1,d;
        System.out.println(c);
//        d未初始化
//        System.out.println(d);
    }


}
