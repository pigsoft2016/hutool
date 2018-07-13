package com.zxc.model.factory.simpleFactory;

/**
 * 简单工厂类
 * @author zxc on 2018/7/13
 */
public class SimpleFactory {
    public Car CreateCar(String type){
        if("ad".equals(type)){
            System.out.println("造奥迪车");
            return new Audi();
        }else{
            System.out.println("造比亚迪");
            return new Byd();
        }
    }

}
