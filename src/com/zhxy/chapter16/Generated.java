package com.zhxy.chapter16;

import com.zhxy.chapter17.CollectionData;

import java.lang.reflect.Array;

/**
 * Created by zhangxiaoyan on 16/8/14.
 */
public class Generated {
    public static <T> T[] array(T[] a,Generator<T> gen) {
        return new CollectionData<T>(gen, a.length).toArray(a);
    }

    public static <T> T[] array(Class<T> type,Generator<T> gen,int size) {
        T[] a = (T[]) Array.newInstance(type, size);
        return new CollectionData<T>(gen,size).toArray(a);
    }
}
