package com.zxc.model.Observer;

/**观察者
 * 实现了update方法
 * @author zxc on 2018/7/13
 */
public class User implements  Observer {
    private String name;
    private String message;
    public User(String name) {
        this.name = name;
    }
    @Override
    public void update(String massage) {
        this.message = massage;
        read();
    }
    public void read(){
        System.out.println(name + " 收到推送消息： " + message);
    }
}
