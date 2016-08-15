package com.zhxy.chapter16;

import java.util.Arrays;

/**
 * Created by zhangxiaoyan on 16/8/14.
 */
public class P12 {
    public static void main(String[] args) {
        CountingGenerator.Double d = new CountingGenerator.Double();
        int len = 10;
        double[] a = new double[len];
        for(int i=0;i<len;i++) {
            a[i] = d.next();
        }
        System.out.println(Arrays.toString(a));

        double[] b = ConvertTo.primitive(Generated.array(Double.class, new CountingGenerator.Double(), 15));
        System.out.println(Arrays.toString(b));

    }
}
