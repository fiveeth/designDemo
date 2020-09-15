package 创建型模式.简单工厂模式.impl;

import 创建型模式.简单工厂模式.Color;

/**
 * @author Administrator
 * @date 2020-06-11 20:10
 */
public class Yellow implements Color {

    @Override
    public void display() {
        System.out.println("我是黄色");
    }
}
