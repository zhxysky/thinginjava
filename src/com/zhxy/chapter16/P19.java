package com.zhxy.chapter16;

import java.util.Arrays;

/**
 * Created by zhangxiaoyan on 16/8/15.
 */

class DataHolder {
    protected int data;
    DataHolder(int data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        return ((DataHolder)obj).data == this.data;
    }
}
public class P19 {
    public static void main(String[] args) {
        DataHolder[] d1 = new DataHolder[5];
        DataHolder[] d2 = new DataHolder[5];
        Arrays.fill(d1,new DataHolder(3));
        Arrays.fill(d2,new DataHolder(3));
        System.out.println(Arrays.equals(d1,d2));
    }


}
