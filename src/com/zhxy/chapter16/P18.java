package com.zhxy.chapter16;

import java.util.Arrays;

/**
 * Created by zhangxiaoyan on 16/8/14.
 */
public class P18 {
    public static void main(String[] args) {
        BerylliumSphere[] b = new BerylliumSphere[10];
        Arrays.fill(b,new BerylliumSphere());
        b[1]=b[3]=new BerylliumSphere();
        System.out.println(Arrays.toString(b));
        BerylliumSphere[] c = new BerylliumSphere[10];
        System.arraycopy(b,0,c,0,b.length);
        System.out.println(Arrays.toString(c));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}
