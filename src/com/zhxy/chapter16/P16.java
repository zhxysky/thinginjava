package com.zhxy.chapter16;

import java.util.Arrays;

/**
 * Created by zhangxiaoyan on 16/8/14.
 */
public class P16 {




    public static void main(String[] args) {

        int size = 6;
        boolean[] a1 = ConvertTo.primitive(Generated.array(java.lang.Boolean.class, new SkipCenerator.Boolean(true), size));
        System.out.println("a1:" + Arrays.toString(a1));
        byte[] a2 = ConvertTo.primitive(Generated.array(java.lang.Byte.class, new SkipCenerator.Byte((byte) 1), size));
        System.out.println("a2:" + Arrays.toString(a2));
        char[] a3 = ConvertTo.primitive(Generated.array(java.lang.Character.class, new SkipCenerator.Character(2), size));
        System.out.println("a3:" + Arrays.toString(a3));
        short[] a4 = ConvertTo.primitive(Generated.array(java.lang.Short.class, new SkipCenerator.Short((short) 3), size));
        System.out.println("a4:" + Arrays.toString(a4));
        int[] a5 = ConvertTo.primitive(Generated.array(java.lang.Integer.class, new SkipCenerator.Integer(4), size));
        System.out.println("a5:" + Arrays.toString(a5));
        long[] a6 = ConvertTo.primitive(Generated.array(java.lang.Long.class, new SkipCenerator.Long(5l), size));
        System.out.println("a6:" + Arrays.toString(a6));
        float[] a7 = ConvertTo.primitive(Generated.array(java.lang.Float.class, new SkipCenerator.Float(1.5f), size));
        System.out.println("a7:" + Arrays.toString(a7));
        double[] a8 = ConvertTo.primitive(Generated.array(java.lang.Double.class, new SkipCenerator.Double(2.0), size));
        System.out.println("a8:" + Arrays.toString(a8));

    }


}
