package 行为型模式.策略模式.案例1.impl;

import 行为型模式.策略模式.案例1.BrayBehavior;

/**
 * @author Administrator
 * @date 2020-06-11 19:42
 */
public class Croak implements BrayBehavior {

    @Override
    public void bray() {
        System.out.println("呱呱叫");
    }
}
