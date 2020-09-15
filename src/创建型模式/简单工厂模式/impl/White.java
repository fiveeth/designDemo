package 创建型模式.简单工厂模式.impl;

import 创建型模式.简单工厂模式.Color;

/**
 * @author Administrator
 * @date 2020-06-11 20:19
 */
public class White implements Color {
    @Override
    public void display() {
        System.out.println("我是白色");
    }
}
