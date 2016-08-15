package com.zhxy.chapter17;

import com.zhxy.chapter16.Generator;

import java.util.ArrayList;

/**
 * Created by zhangxiaoyan on 16/8/14.
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity) {
        for(int i=0;i<quantity;i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> gen,int quantity) {
        return new CollectionData<T>(gen, quantity);
    }

}
