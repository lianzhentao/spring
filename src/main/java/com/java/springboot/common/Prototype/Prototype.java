package com.java.springboot.common.Prototype;

/**
 * 原型模式示例代码
 * 通过实现cloneable接口重写其方法实现
 */
public class Prototype implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
