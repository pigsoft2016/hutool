package com.zxc.model.factory.simpleFactory;

/**
 * 具体产品
 * @author zxc on 2018/7/13
 */
public class Audi implements Car {
    @Override
    public void run() {
    System.out.println("奥迪车");
    }
}

