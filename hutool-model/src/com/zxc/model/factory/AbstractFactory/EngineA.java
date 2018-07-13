package com.zxc.model.factory.AbstractFactory;

/**
 * @author zxc on 2018/7/13
 */
public class EngineA implements  Engine {
    @Override
    public void run() {
        System.out.println("A");
    }
}
