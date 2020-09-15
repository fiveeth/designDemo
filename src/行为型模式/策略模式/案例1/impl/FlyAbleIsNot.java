package 行为型模式.策略模式.案例1.impl;

import 行为型模式.策略模式.案例1.FlyBehavior;

/**
 * @author Administrator
 * @date 2020-06-11 19:40
 */
public class FlyAbleIsNot implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我不会飞");
    }
}
