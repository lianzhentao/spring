package com.java.springboot.common;

import com.java.springboot.common.strategy.StrategyBServiceImpl;
import com.java.springboot.common.strategy.StrategyContext;
import com.java.springboot.common.strategy.StratrgyAServiceImpl;

public class commonTest {

    public static void main(String[] args) {
        StrategyContext context = new StrategyContext(new StratrgyAServiceImpl());
        context.handle();
        context.setStrategyServices(new StrategyBServiceImpl());
        context.handle();
    }
}
