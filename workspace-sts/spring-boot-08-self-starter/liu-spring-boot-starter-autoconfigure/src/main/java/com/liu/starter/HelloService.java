package com.liu.starter;

public class HelloService {

    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    // 根据配置文件里的配置信息来处理自己的业务逻辑
    public String sayHelloFromLiu(String name) {
        return helloProperties.getPrefix()+ "-" + name + "-" + helloProperties.getSuffix();
    }

}
