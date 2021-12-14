package com.rayucan.designparttern.BehavioralPatterns.StrategyPattern;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Rayucan
 * @description
 * @date Created on 2021/12/14 22:19
 * 
 * 策略模式
 */
public class Main {
    public static void main(String[] args) {
        //案例一
        String[] array = {"apple","orange","banana"};
        //自定义排序方法，并传入String类自带的比较器（策略）
        mySortMethod(array, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(array));
        
        //案例二
        DiscountContext discountContext = new DiscountContext();

        BigDecimal pay1 = discountContext.calculatePrice(BigDecimal.valueOf(114514));
        System.out.println(pay1);
        
        discountContext.setStrategy(new VipDiscountStrategy());
        BigDecimal pay2 = discountContext.calculatePrice(BigDecimal.valueOf(114514));
        System.out.println(pay2);
        
        discountContext.setStrategy(new OverDiscountStrategy());
        BigDecimal pay3 = discountContext.calculatePrice(BigDecimal.valueOf(114514));
        System.out.println(pay3);
    }

    /**
     * 自定义冒泡排序方法
     * @param a 比较的数组
     * @param c 比较器
     * @param <T> 数组元素类型
     */
    static <T> void mySortMethod(T[] a, Comparator<? super T> c){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                
                //比较的策略
                //即怎么比较，得到结果是大于0，等于0，小于0
                //需要传入比较器来确定
                if (c.compare(a[j], a[j + 1]) > 0){
                    T temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
