package com.zxc.model.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，也就是微信公众号服务
 * 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 * @author zxc on 2018/7/13
 */
public class WechatServer implements  Observerable {
    //注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
    private List<Observer> list=new ArrayList<Observer>();
    private  String massage;
    @Override
    public void regiserObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
    list.remove(o);
    }

    @Override
    public void notifyObserver() {
     for(int i=0;i<list.size();i++){
         Observer oserver=list.get(i);
         oserver.update(this.massage);
     }
    }
    public void setInfomation(String s){
     this.massage=s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
