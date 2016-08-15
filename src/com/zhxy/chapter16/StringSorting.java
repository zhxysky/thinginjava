package com.zhxy.chapter16;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by zhangxiaoyan on 16/8/15.
 */
public class StringSorting {
    public static void main(String[] args) {
        String[] sa = Generated.array(new String[20], new RandomGenerator.String(5));
        System.out.println(Arrays.toString(sa));
        Arrays.sort(sa);
        System.out.println(Arrays.toString(sa));
        Arrays.sort(sa, Collections.reverseOrder());
        System.out.println(Arrays.toString(sa));
        Arrays.sort(sa,String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(sa));

    }
}
