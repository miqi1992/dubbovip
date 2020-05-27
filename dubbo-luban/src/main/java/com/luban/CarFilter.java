package com.luban;

import org.apache.dubbo.common.extension.Activate;

@Activate(value = "test")
public class CarFilter implements Car {
}
