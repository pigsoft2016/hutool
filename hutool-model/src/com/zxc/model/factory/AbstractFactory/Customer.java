package com.zxc.model.factory.AbstractFactory;

/**
 * @author zxc on 2018/7/13
 */
public class Customer {
   public static void main(String[] args){
       CarFactory  factory1 = new CarFactoryA();
       Engine e = factory1.createEngine();
       Seat s=factory1.createSeat();
   }
}
