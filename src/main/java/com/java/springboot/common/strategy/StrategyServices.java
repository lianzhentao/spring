package com.java.springboot.common.strategy;

/**
 * 策略模式的相关代码
 * 编写一个策略接口
 * 编写两个策略的具体实现，编写策略上下文，根据不同的策略在上下文中获取不同的实现对象去执行
 */
public interface StrategyServices {

    void strategyHandle();
}
