package com.zxc.model.factory.AbstractFactory;

/**
 * @author zxc on 2018/7/13
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
}
