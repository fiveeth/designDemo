package 创建型模式.抽象工厂模式.impl;

import 创建型模式.抽象工厂模式.CPU;

/**
 * @author Administrator
 * @date 2020-06-11 22:23
 */
public class AmdCpu implements CPU {
    @Override
    public void display() {
        System.out.println("我是AMD CPU");
    }
}
