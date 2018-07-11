package com.zxc.model.proxy;

/**
 * @Description: 定义目标业务对象类
 * @author zxc on 2018/7/11
 */
public class ZXC implements Person{
    @Override
    public String sing(String name){
                 System.out.println("刘德华唱"+name+"歌！！");
                 return "歌唱完了，谢谢大家！";
             }
    @Override
    public String dance(String name){
        System.out.println("刘德华跳"+name+"舞！！");
        return "舞跳完了，多谢各位观众！";
    }
}
