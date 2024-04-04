package com.java.springboot.common.strategy;


public class StrategyContext {

    private StrategyServices strategyServices;

    public void setStrategyServices(StrategyServices strategyServices) {
        this.strategyServices = strategyServices;
    }

    public StrategyContext(StrategyServices strategyServices) {
        this.strategyServices = strategyServices;
    }

    public void handle(){
        strategyServices.strategyHandle();
    }
}
