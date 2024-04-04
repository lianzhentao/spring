package com.java.springboot.common;

import com.java.springboot.common.Prototype.Prototype;
import com.java.springboot.common.strategy.StrategyBServiceImpl;
import com.java.springboot.common.strategy.StrategyContext;
import com.java.springboot.common.strategy.StratrgyAServiceImpl;

public class commonTest {

    public static void main(String[] args) {
        // 策略模式测试
//        StrategyContext context = new StrategyContext(new StratrgyAServiceImpl());
//        context.handle();
//        context.setStrategyServices(new StrategyBServiceImpl());
//        context.handle();

        // 原型模式测试
        Prototype type1 = new Prototype();
        type1.setName("name1");
        try {
            Prototype copyProrotype = (Prototype) type1.clone();
            type1.setName("name2");
            System.out.println(type1.getName());
            System.out.println(copyProrotype.getName());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
