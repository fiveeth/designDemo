package 结构型模式.代理模式.案例2.impl;

import 结构型模式.代理模式.案例2.MoveAble;

import java.util.Random;

/**
 * @author guoyihua
 * @date 2020-07-23 20:09
 */
public class Car implements MoveAble {

    @Override
    public void move() {
        System.out.println("tutututu");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
