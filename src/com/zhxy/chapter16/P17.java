package com.zhxy.chapter16;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by zhangxiaoyan on 16/8/14.
 */
public class P17 {
    public static void main(String[] args) {
        BigDecimal[] bd = Generated.array(BigDecimal.class, new BigDecimicalGenerator(new BigDecimal("0.2")), 10);
        System.out.println(Arrays.asList(bd));
    }
}
