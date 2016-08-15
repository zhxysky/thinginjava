package com.zhxy.chapter16;

import com.sun.tools.javac.jvm.Gen;

import java.util.Arrays;

/**
 * Created by zhangxiaoyan on 16/8/15.
 */
public class ArraySearching {
    public static void main(String[] args) {
        Generator<Integer> gen = new RandomGenerator.Integer(1000);
        int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
        Arrays.sort(a);
        System.out.println("Sorted arrays: " + Arrays.toString(a));
        while (true) {
            int r = gen.next();
            int location = Arrays.binarySearch(a, r);
            if (location >= 0) {
                System.out.println("Location of " + r + " is " + location + ",a[location]=" + a[location]);
                break;
            }
        }
    }
}
