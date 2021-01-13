package com.luban;

import org.apache.dubbo.common.URL;

public class PersonImpl implements Person {

    @Override
    public void tt(URL url) {
        System.out.println("person");
    }
}
