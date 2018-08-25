package com.zxc.model.Observer;

/**
 * 定义一个抽象主题角色（被观察者接口）
 * 声明了添加、删除、通知观察者方法
 * @author zxc on 2018/7/13
 */
public interface Observerable {
    public void regiserObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
