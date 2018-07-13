package com.zxc.model.factory.FactoryMethod;

/**
 * @author zxc on 2018/7/13
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
