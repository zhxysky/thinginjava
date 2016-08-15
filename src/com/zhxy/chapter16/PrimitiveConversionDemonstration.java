package com.zhxy.chapter16;

import java.util.Arrays;

/**
 * Created by zhangxiaoyan on 16/8/14.
 */
public class PrimitiveConversionDemonstration {

    public static void main(String[] args) {
        Integer[] a = Generated.array(Integer.class, new CountingGenerator.Integer(), 15);
        int[] b = ConvertTo.primitive(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        boolean[] c = ConvertTo.primitive(Generated.array(Boolean.class, new CountingGenerator.Boolean(), 7));
        System.out.println(Arrays.toString(c));
    }
}
