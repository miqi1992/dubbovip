package com.luban;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.common.utils.StringUtils;
import org.apache.dubbo.rpc.Protocol;

import java.util.List;

public class SpiTest {

    public static void main(String[] args) {

        // Protocol    扩展点--->实现类的对象

//        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
//
//
//        extensionLoader.getExtension("car1");











//
//        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
//        URL url = new URL("http", "localhost", 8080);
//        url = url.addParameter("test", "carf");
//
//        List<Car> test = extensionLoader.getActivateExtension(url, new String[]{"111"});   // Filter
//        System.out.println(test);


        // Filter 链

        // 系统存在多个扩展点, 不同的URL参数使用不同的Filter, 怎么匹配？
        // 首先Filter自己定义一个匹配规则，比如@Activate注解就是用来定义匹配规则的
    }
}
