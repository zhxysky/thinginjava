package com.zhxy.chapter16;

import java.util.Arrays;

/**
 * Created by zhangxiaoyan on 16/8/8.
 */
public class P2 {
    private BerylliumSphere[] get(int n) {
        BerylliumSphere[] a = new BerylliumSphere[n];
        for(int i=0;i<n;i++) {
            if(a[i] == null) {
                a[i] = new BerylliumSphere();
            }
        }
        return a;
    }

    public static void main(String[] args) {
        P2 p = new P2();
        System.out.println(Arrays.toString(p.get(3)));
    }

}
