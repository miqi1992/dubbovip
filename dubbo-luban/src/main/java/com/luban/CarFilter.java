package com.luban;

import org.apache.dubbo.common.URL;

public class CarFilter implements Car {

    private Person person;     // Person接口的Adaptive对象，  person.test

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void test(URL url) {
        System.out.println("ttttt");
    }
}
