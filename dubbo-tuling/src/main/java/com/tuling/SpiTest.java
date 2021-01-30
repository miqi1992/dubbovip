package com.tuling;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

public class SpiTest {
    public static void main(String[] args) {

//        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
//        Protocol protocol = extensionLoader.getExtension("http");
//        System.out.println(protocol);

//        ExtensionLoader<Person> extensionLoader = ExtensionLoader.getExtensionLoader(Person.class);
//        Person person = extensionLoader.getExtension("black");
//
//        URL url = new URL("x", "localhost", 8080);
//        url = url.addParameter("car", "black");
//        System.out.println(person.getCar().getCarName(url));


//        ExtensionLoader<Filter> extensionLoader = ExtensionLoader.getExtensionLoader(Filter.class);
//        URL url = new URL("http://", "localhost", 8080);
//        url = url.addParameter("cache", "test");
//        List<Filter> activateExtensions = extensionLoader.getActivateExtension(url, new String[]{"validation"}, CommonConstants.CONSUMER);
//        for (Filter activateExtension : activateExtensions) {
//            System.out.println(activateExtension);
//        }

    }
}
