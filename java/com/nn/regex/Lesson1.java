package com.nn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson1 {
    static String constants = "http://www.baidu.com/img/123456789.jpg<--->http://www.baidu.com/img/987654321.jpg";

    public static void main(String[] args) {
        //正则匹配上面的url:/img/123456789.jpg
        Lesson1 lesson1 = new Lesson1();
        lesson1.test1();
        lesson1.test2();
    }

    void test1(){
        String reg = ".*img.*";
        boolean matches = Pattern.matches(reg, constants);
        System.out.println(matches);
    }

    void test2(){
        String reg = ".*img.*";
        Pattern compile = Pattern.compile(reg);
        Matcher matcher = compile.matcher(constants);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
