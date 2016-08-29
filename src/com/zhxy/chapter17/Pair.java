package com.zhxy.chapter17;

/**
 * Created by zhangxiaoyan on 16/8/25.
 */
public class Pair<K,V> {
    //key 和 value 都是public 和 final的,这是为了使Pair成为只读的数据传输对象
    public final K key;

    public final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }


}
