package com.zxc.model.proxy.test;

/**
 * @author zxc on 2018/8/27
 */
import java.lang.reflect.Proxy;

public class MainTest {
    public static void main(String[] args) {
        //目标对象
        TargetObject target = new TargetObject();
        //拦截器
        MyInterceptor myInterceptor = new MyInterceptor(target);

        /*
         *  Proxy.newProxyInstance参数：
         * 	1、目标类的类加载器
         * 	2、目标类的所有的接口
         *  3、拦截器
         */
        //代理对象，调用系统方法自动生成
        TargetInterface proxyObj = (TargetInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), myInterceptor);
        proxyObj.business();
    }
    /*
      1、代理对象是由谁产生的？
      jvm产生的，不像上次的静态代理，我们自己得new个代理对象出来
      2、代理对象实现了什么接口？
实现的接口是目标对象实现的接口。同静态代理模式中代理对象实现的接口。那个继承关系图还是相同的。代理对象和目标对象都实现一个共同的接口。
就是这个接口。所以Proxy.newProxyInstance()方法返回的类型就是这个接口类型。
3、代理对象的方法体是什么？
代理对象的方法体中的内容就是拦截器中invoke方法中的内容。所有代理对象的处理逻辑，控制是否执行目标对象的目标方法。都是在这个方法里面处理的。
4、拦截器中的invoke方法中的method参数是在什么时候赋值的？
在客户端，代理对象调用目标方法的时候，此实例中为：proxyObj.business()；实际上进入的是拦截器中的invoke方法，这个时候
，拦截器中的invoke方法中的method参数会被赋值。

最后，为啥这个方式叫做jdk动态代理呢？
因为这个动态代理对象时用jdk的相关代码生成的，所以这个叫jdk动态代理。
后面的cglib动态代理，就是因为要用到cglib的jar包，所以才叫cglib动态代理。
     */
}
