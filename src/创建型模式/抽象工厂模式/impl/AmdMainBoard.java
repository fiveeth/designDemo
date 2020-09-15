package 创建型模式.抽象工厂模式.impl;

import 创建型模式.抽象工厂模式.MainBoard;

/**
 * @author Administrator
 * @date 2020-06-11 22:26
 */
public class AmdMainBoard implements MainBoard {
    @Override
    public void display() {
        System.out.println("我是AMD MainBoard");
    }
}
