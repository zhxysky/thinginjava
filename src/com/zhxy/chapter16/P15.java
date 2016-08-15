package com.zhxy.chapter16;

import java.util.Arrays;

/**
 * Created by zhangxiaoyan on 16/8/14.
 */
public class P15 {

    public static  class BSGenerator implements Generator<BerylliumSphere> {

        @Override
        public BerylliumSphere next() {
            return new BerylliumSphere();
        }
    }

    public static void main(String[] args) {
        BerylliumSphere[] bs = Generated.array(BerylliumSphere.class, new BSGenerator(), 15);
        System.out.println(Arrays.toString(bs));
        System.out.println(bs[4]);


    }
}
