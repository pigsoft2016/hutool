package com.zxc.model.factory.simpleFactory;

/**
 * @author zxc on 2018/7/13
 */
public class Customer {
    public static void main(String[] args){
        SimpleFactory factory=new SimpleFactory();
        Car car1=factory.CreateCar("ad");
    }
}
