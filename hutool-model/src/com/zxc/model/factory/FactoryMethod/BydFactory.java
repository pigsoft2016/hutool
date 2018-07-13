package com.zxc.model.factory.FactoryMethod;

/**
 * @author zxc on 2018/7/13
 */
public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}
