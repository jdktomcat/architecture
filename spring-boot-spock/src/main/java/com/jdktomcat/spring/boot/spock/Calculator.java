package com.jdktomcat.spring.boot.spock;

/**
 * 测试计算类
 */
public class Calculator {
    public int size(String str) {
        return str.length();
    }

    public int sum(int a, int b) {
        return a + b;
    }

}
