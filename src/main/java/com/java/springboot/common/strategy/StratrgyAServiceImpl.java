package com.java.springboot.common.strategy;

import com.java.springboot.common.strategy.StrategyServices;

public class StratrgyAServiceImpl implements StrategyServices {

    @Override
    public void strategyHandle() {
        System.out.println("策略A的实现方法");
    }
}
