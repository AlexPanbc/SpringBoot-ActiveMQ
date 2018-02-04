# SpringBoot-ActiveMQ
SpringBoot集成ActiveMQ
超级简单 不想传统的写法需要连接等等等。。
这里只需要把用到的类注解进去即可使用

controller加了个定时器 方便调用，不用每次都调用api
    @Scheduled(fixedDelay=3000)//每3s执行1次
    

配置文件超级简单
server:
  port: 8080
spring:
  jms:
    pub-sub-domain: false   # 配置消息的类型，如果是true则表示为topic消息，如果为false表示Queue消息
  activemq:
    user: admin    # 连接用户名
    password: admin   # 连接密码
    broker-url: tcp://127.0.0.1:61616 # 消息组件的连接主机信息

  特别注意这个属性  pub-sub-domain: false   # 配置消息的类型，如果是true则表示为topic消息，如果为false表示Queue消息
