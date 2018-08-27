package com.zxc.model.proxy.test.cglib;

/**
 * @author zxc on 2018/8/27
 */
public class MainTest {
    public static void main(String[] args) {
        //目标对象
        TargetObject target = new TargetObject();
        //拦截器
        MyInterceptor myInterceptor = new MyInterceptor(target);
        //代理对象，调用cglib系统方法自动生成
        //注意：代理类是目标类的子类。
        TargetObject proxyObj = (TargetObject) myInterceptor.createProxy();
        proxyObj.business();
    }
}
