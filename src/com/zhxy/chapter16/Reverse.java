package com.zhxy.chapter16;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by zhangxiaoyan on 16/8/15.
 */
public class Reverse {
    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], CompType.generator());
        System.out.println("before sorting:");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(a));
    }
}
