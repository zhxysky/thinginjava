package com.zhxy.chapter16;

/**
 * Created by zhangxiaoyan on 16/8/14.
 */
public class GeneratorTest {
    public static int size = 10;
    public static void test(Class<?> surroundingClass) {
        for(Class<?> type:surroundingClass.getClasses()) {
            System.out.print(type.getSimpleName() + ": ");
            try {
                Generator<?> g = (Generator<?>) type.newInstance();
                for(int i=0;i<size;i++) {
                    System.out.print(g.next()+" ");
                }
                System.out.println();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        test(CountingGenerator.class);
    }
}
