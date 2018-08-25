package com.zxc.model.Observer;

/**
 * @author zxc on 2018/7/13
 * 首先注册了三个用户，ZhangSan、LiSi、WangWu。公众号发布了一条消息"PHP是世界上最好用的语言！"，三个用户都收到了消息。

用户ZhangSan看到消息后颇为震惊，果断取消订阅，这时公众号又推送了一条消息，此时用户ZhangSan已经收不到消息，其他用户

还是正常能收到推送消息
 */
public class Test {
    public static  void main(String[] args){
        WechatServer server=new WechatServer();
        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");
        server.regiserObserver(userZhang);
        server.regiserObserver(userLi);
        server.regiserObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");
        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");
    }
}
