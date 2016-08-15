package com.zhxy.chapter16;

import com.zhxy.chapter17.CollectionData;

/**
 * Created by zhangxiaoyan on 16/8/14.
 */
public class P14 {
    public static void main(String[] args) {
        for(Class<?> type:CountingGenerator.class.getClasses()) {
            try {
                System.out.println(type.getSimpleName()+"\t"+CollectionData.list((Generator<?>)type.newInstance(), 10));
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
