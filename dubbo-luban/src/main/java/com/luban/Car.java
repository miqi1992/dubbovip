package com.luban;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI("car1")
public interface Car {



    @Adaptive
    public void test(URL url);



}
