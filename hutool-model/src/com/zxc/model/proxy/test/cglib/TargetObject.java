package com.zxc.model.proxy.test.cglib;

/**
 * @author zxc on 2018/8/27
 */

import com.zxc.model.proxy.test.TargetInterface;

/**
 * 被代理的类
 * 目标对象类
 * 实现目标接口.
 * 继而实现目标方法。
 */
public class TargetObject  {

    /**
     * 目标方法(即目标操作)
     */

    public void business() {
        System.out.println("business");
    }

}
