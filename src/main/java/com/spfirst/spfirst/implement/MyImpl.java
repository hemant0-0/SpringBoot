package com.spfirst.spfirst.implement;

import com.spfirst.spfirst.repository.MyInterface;
import org.springframework.stereotype.Component;

@Component
public class MyImpl implements MyInterface {
    @Override
    public String getData() {
        return "Hello World";
    }
}
