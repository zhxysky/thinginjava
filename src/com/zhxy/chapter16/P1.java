package com.zhxy.chapter16;

/**
 * Created by zhangxiaoyan on 16/8/8.
 */
public class P1 {
    private void hide(BerylliumSphere[] a) {
        System.out.println("a.length:"+a.length);
    }

    public static void main(String[] args) {
        P1 p = new P1();
        //动态的聚集初始化
        p.hide(new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()});
        //普通的 聚集初始化
        BerylliumSphere[] b = {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()};
        p.hide(b); //不能直接在参数中使用普通聚集初始化,必须通过变量
    }
}
