package 结构型模式.代理模式.案例2.impl;

import 结构型模式.代理模式.案例2.MoveAble;

/**
 * @author guoyihua
 * @date 2020-07-23 20:09
 */
public class TimeProxy implements MoveAble {
    MoveAble moveAble;

    public TimeProxy(MoveAble moveAble) {
        this.moveAble = moveAble;
    }

    @Override
    public void move() {
        long beginTime = System.currentTimeMillis();
        moveAble.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车运行时间: " + (endTime - beginTime) + "毫秒");
    }
}
