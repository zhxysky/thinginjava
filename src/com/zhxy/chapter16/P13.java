package com.zhxy.chapter16;

/**
 * Created by zhangxiaoyan on 16/8/14.
 */
public class P13 {

    public static void main(String[] args) {
        String s = new CountingGenerator.String(15).next();
        System.out.println(s);
    }
}
