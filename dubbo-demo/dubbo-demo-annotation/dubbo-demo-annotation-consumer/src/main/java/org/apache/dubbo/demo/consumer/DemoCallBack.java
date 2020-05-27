package org.apache.dubbo.demo.consumer;

import org.springframework.stereotype.Component;

@Component
public class DemoCallBack {

    public void onreturn() {
        System.out.println("onreturn");
    }
}
