package com.zxc.model.factory.AbstractFactory;

/**
 * A类汽车工厂
 * @author zxc on 2018/7/13
 */
public class CarFactoryA implements CarFactory {
    @Override
    public Engine createEngine() {
        return new EngineA();
    }

    @Override
    public Seat createSeat() {
        return new Aseat();
    }
}
