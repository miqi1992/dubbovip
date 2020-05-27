package com.luban;

import org.apache.dubbo.common.bytecode.Wrapper;

import java.io.IOException;

public class WrapperTest {

    public static void main(String[] args) throws IOException {
        Wrapper wrapper = Wrapper.getWrapper(User.class);
        System.out.println(wrapper.getClass().getName());
        System.in.read();
    }
}
