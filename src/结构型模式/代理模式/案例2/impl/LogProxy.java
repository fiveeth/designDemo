package 结构型模式.代理模式.案例2.impl;

import 结构型模式.代理模式.案例2.MoveAble;

/**
 * @author guoyihua
 * @date 2020-07-23 20:21
 */
public class LogProxy implements MoveAble {
    MoveAble moveAble;

    public LogProxy(MoveAble moveAble){
        this.moveAble = moveAble;
    }

    @Override
    public void move() {
        System.out.println("汽车运行日志--开始");
        moveAble.move();
        System.out.println("汽车运行日志--结束");
    }
}
