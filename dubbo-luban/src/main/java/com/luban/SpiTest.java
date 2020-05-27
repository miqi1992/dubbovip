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
        List<Car> test = extensionLoader.getActivateExtension(url, new String[]{"test"});
        System.out.println(test);
    }
}
