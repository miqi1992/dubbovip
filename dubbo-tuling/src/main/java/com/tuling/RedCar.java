package com.tuling;

import org.apache.dubbo.common.URL;

public class RedCar implements Car {
    @Override
    public String getCarName(URL url) {
        return "red";
    }
}
