package com.java.springboot.common.strategy;

import com.java.springboot.common.strategy.StrategyServices;

public class StrategyBServiceImpl implements StrategyServices {

    @Override
    public void strategyHandle() {
        System.out.println("策略B的执行方法");
    }
}
