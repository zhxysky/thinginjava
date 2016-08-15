package com.zhxy.chapter16;

/**
 * Created by zhangxiaoyan on 16/8/8.
 */
public class CounterGenerator {
    public static class Boolean implements Generator<java.lang.Boolean> {
        private boolean value = false;
        @Override
        public java.lang.Boolean next() {
            value = !value;
            return value;
        }
    }
}
