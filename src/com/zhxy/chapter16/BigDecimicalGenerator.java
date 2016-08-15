package com.zhxy.chapter16;

import java.math.BigDecimal;

/**
 * Created by zhangxiaoyan on 16/8/14.
 */
public class BigDecimicalGenerator implements Generator<BigDecimal> {
    private BigDecimal value = new BigDecimal(0);
    private BigDecimal step;
    public BigDecimicalGenerator(BigDecimal step) {
        this.step = step;
    }
    @Override
    public BigDecimal next() {
        BigDecimal oldValue = value;
        value = value.add(step);
        return oldValue;
    }
}
