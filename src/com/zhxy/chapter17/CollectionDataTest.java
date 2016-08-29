package com.zhxy.chapter17;

import com.zhxy.chapter16.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by zhangxiaoyan on 16/8/25.
 */

class Government implements Generator<String> {
    String[] foundation = ("strange women lying in ponds distributing swords is no basis for as system of government").split(" ");
    private int index;
    @Override
    public String next() {
        return foundation[index++];
    }
}

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>(new CollectionData<>(new Government(),15));
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }
}
