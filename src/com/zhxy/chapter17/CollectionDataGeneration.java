package com.zhxy.chapter17;

import com.zhxy.chapter16.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by zhangxiaoyan on 16/8/25.
 */
public class CollectionDataGeneration {
    public static void main(String[] args) {
        System.out.println(new ArrayList<String>(CollectionData.list(new RandomGenerator.String(),10)));
        System.out.println(new HashSet<Integer>(new CollectionData<Integer>(new RandomGenerator.Integer(),10)));
    }
}
