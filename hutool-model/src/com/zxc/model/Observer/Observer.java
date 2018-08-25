package com.zxc.model.Observer;

/**
 * 定义观察者接口
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 * @author zxc on 2018/7/13
 */
public interface Observer {
    public void update(String massage);
}
