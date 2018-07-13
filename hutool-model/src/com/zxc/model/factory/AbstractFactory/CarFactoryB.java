package com.zxc.model.factory.AbstractFactory;

/**
 * B类汽车工厂
 * @author zxc on 2018/7/13
 */
public class CarFactoryB implements  CarFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Seat createSeat() {
        return new Bseat();
    }
}
