package com.luban;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.common.utils.StringUtils;
import org.apache.dubbo.rpc.Protocol;

import java.util.List;

public class SpiTest {

    public static void main(String[] args) {

//        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
//
//        Protocol http = extensionLoader.getExtension("dubbo");
//
//        System.out.println(http);



        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        URL url = new URL("http", "localhost", 8080);
        url = url.addParameter("test", "carf");
        //
        List<Car> test = extensionLoader.getActivateExtension(url, new String[]{"carf"});
        System.out.println(test);

        // 系统存在多个Filter, 不同的URL参数使用不同的Filter, 怎么匹配？
        // 首先Filter自己定义一个匹配规则，比如@Activate注解就是用来定义匹配规则的
    }
}
