package com.zxc.model.factory.FactoryMethod;

/**
 * @author zxc on 2018/7/13
 */
public class Customer
{  public static  void main(String[] args){
    CarFactory ad=new AudiFactory();
    ad.createCar();
}
}
