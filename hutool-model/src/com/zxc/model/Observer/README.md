
## 观察者模式
定义了一个一对多的依赖关系，让多个观察者对象同时监听同一个主题对象。当这个主题状态发生改变时，会通知所有观察者对象，让它们自动更新自己
###类似场景：
* 聊天室程序的创建。服务器创建好后，A、B、C三个客户端连接好公开聊天。A向服务器发送数据，服务器在将数据分别发送给其他在线客户。也就是说，每个客户端需要更新服务器端的数据
* 网站上，很多人订阅了“Java主题”的新闻。当有这个主题新闻时，就会将这些新闻发给所有订阅的人
* 大家在玩CS游戏时，服务器需要将每个人的方位变化发给所有的客户
* 有一个微信公众号服务，不定时发布一些消息，关注公众号就可以收到推送消息，取消关注就收不到推送消息
上面这些场景，我们都可以使用观察者模式来处理。我们可以把多个订阅者、客户称之为观察者；需要同步给多个订阅者的数据封装到对对象中，称之为目标
###模式结构：
* 抽象主题角色(Subject): 把所有对观察者对象的引用保存在一个集合中，每个抽象主题角色都可以有任意数量的观察者。抽象主题提供一个接口，可以增加和删除观察者角色。一般用一个抽象类和接口来实现
* 具体主题角色(ConcreteSubject): 在具体主题内部状态改变时，给所有登记过的观察者发出通知。具体主题角色通常用一个子类实现
* 抽象观察者角色(Observer)： 为所有具体的观察者定义一个接口，在得到主题的通知时更新自己
* 具体观察者角色(ConcreteObserver)： 该角色实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调。通常用一个子类实现。如果需要，具体观察者角色可以保存一个指向具体主题角色的引用
