package com.luban;

import org.apache.dubbo.common.URL;

public class CarImpl implements Car {

    private Person person;     // Person接口的Adaptive对象，  person.test


    public void setPerson(Person person) {  //
        this.person = person;
    }


    @Override
    public void test(URL url) {
        person.tt(url);  // 实现类
        System.out.println("ttttt");
    }
}
